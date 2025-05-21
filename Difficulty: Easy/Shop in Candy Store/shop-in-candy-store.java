// User function Template for Java

class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        // code here
        Arrays.sort(candies);
        int count=0;
        int minSum=0;
        int maxSum=0;
        int i=0;
        int j=N-1;
        while(count<N){
            minSum+=candies[i++];
            maxSum+=candies[j--];
            count+=1+K;
        }
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(minSum);
        ans.add(maxSum);
        return ans;
    }
}