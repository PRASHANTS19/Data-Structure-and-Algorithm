class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] q) {
        
        int sum = 0;
        for(int i : arr)
        {
            if(i%2==0)sum += i;
        }
        
        int res[] = new int[q.length];
        for(int i=0; i<q.length; i++){
            if(arr[q[i][1]]%2==0){
                sum -=arr[q[i][1]];
                int s = arr[q[i][1]]+q[i][0];
                arr[q[i][1]]  =s;
                if(s%2==0)sum += s;
            }
            else{
                int s = arr[q[i][1]]+q[i][0];
                arr[q[i][1]]  =s;
                if(s%2==0)sum += s;
            }
            res[i]=sum;
        }

           return res; 
    }
}