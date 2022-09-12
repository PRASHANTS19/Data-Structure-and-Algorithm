class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        Arrays.sort(arr);
        int n = arr.length;
        int i=0,j=n-1;
        
        int score=0;
        int max =  0;
        while(i<=j){
            if(power>=arr[i]){
                score++;
                power -= arr[i];
                i++;
            }
            else if(score>0){
                power += arr[j];
                j--;
                score--;
            }
            else break;
            max = Math.max(max,score);
        }
        return max;
    }
}