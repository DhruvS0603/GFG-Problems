/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    private static Node buildTree(int preorder[],int preStart,int preEnd, int inorder[],int inStart,int inEnd,Map<Integer,Integer> map){
        if(inStart>inEnd || preStart>preEnd)return null;
        Node root=new Node(preorder[preStart]);
        int inRoot=map.get(root.data);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,map);
        root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,map);
        return root;
    } 
    public static Node buildTree(int inorder[], int preorder[]) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
        Node root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
}