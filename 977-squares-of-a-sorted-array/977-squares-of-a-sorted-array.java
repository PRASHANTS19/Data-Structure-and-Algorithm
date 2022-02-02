class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        if(arr[0]>=0){
            solve(arr,n);
            return arr;
        }
        else if(arr[n-1]<0){
            reverse(arr,n);
            solve(arr,n);
            return arr;
        }
        else{
            int j = 0;
            int i=0;
           for(i=0; i<n; i++){
               if(arr[i]>=0){
                   j=i-1;
                   break;
               }
           }
            int res[] = new int[n];
            int index = j;
            while(index>=0){
                arr[index] = -arr[index];
                index--;
            }
            int k = 0;
            while(i<n && j>=0){
                if(arr[i]<=arr[j]){
                    res[k++]=arr[i];
                    i++;
                }
                else{
                    res[k++] = arr[j];
                    j--;
                }
            }
            while(i<n)res[k++]=arr[i++];
            while(j>=0)res[k++]=arr[j--];
            solve(res,n);
            return res;
            
        }
    }
    void solve(int arr[],int n){
        for(int i=0; i<n; i++){
            arr[i] *= arr[i];
        }
    }
    void reverse(int arr[],int n){
        int i=0; int j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}