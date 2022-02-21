class Solution {
    public int fib(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        int ans = fibo(arr,n);
        return ans;
    }
    int fibo(int[] arr,int n){
        if(n==0)return 0;
        if(n==1)return 1;
    if(arr[n]!=-1)return arr[n];
    
    return arr[n]=fibo(arr,n-1)+fibo(arr,n-2);
    }
}