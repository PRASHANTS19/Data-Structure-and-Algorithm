class Solution {
    public boolean reorderedPowerOf2(int n) {
        int arr[] = freq(n);
        int num = 1;
        for(int i=0; i<31; i++){
            if(Arrays.equals(arr,freq(num)))
                return true;
            else num = num*2;
        }
        return false;
    }
    int[] freq(int n){
        int[] arr = new int[10];
        while(n>0){
            arr[n%10]++;
            n = n/10;
        }
        return arr;
    }
}