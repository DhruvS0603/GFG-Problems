//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String str = sc.next();
            int index = new Solution().repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        // add your code here
        int n=S.length();
        int ans=Integer.MAX_VALUE;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            char c=S.charAt(i);
            
            if(map.containsKey(c)){
                ans=Math.min(ans,map.get(c));
            }
            else{
                map.put(c,i);
            }
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}