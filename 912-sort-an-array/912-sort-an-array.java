class Solution {
    public int[] sortArray(int[] arr) {
        
        int l = 0;
        int r = arr.length;
        mergeSort(arr,l,r-1);
        return arr;
    }
   
     void mergeSort(int[] nums, int lo, int hi){
        if (lo >= hi)
            return ;
        int mid = (lo + hi) >>> 1;
        mergeSort(nums, lo, mid);
        mergeSort(nums, mid + 1, hi);
        merge(nums, lo, mid, mid + 1, hi);
    }
    
     void merge(int[] nums, int preLo, int preHi, int endLo, int endHi){
        if (preLo == endHi)
            return;
        int lo = preLo;
        int hi = endHi;
        
        int[] newArr = new int[preHi - preLo + 1 + endHi - endLo + 1];
        int index = 0;
        while (preLo <= preHi && endLo <= endHi){
            newArr[index++] = (nums[preLo] < nums[endLo]) ? nums[preLo++] : nums[endLo++];
        }
        while (preLo <= preHi){
            newArr[index++] = nums[preLo++];
        }
        while (endLo <= endHi){
            newArr[index++] = nums[endLo++];
        }
        
        index = 0;
        while (lo <= hi){
            nums[lo++] = newArr[index++];
        }
    }
    // void mergeSort(int arr[],int l,int r){
    //     if(l<r) //should be two elements are there
    //     {
    //         int mid = (l+r)/2;
    //         mergeSort(arr,l,mid);
    //         mergeSort(arr,mid+1,r);
    //         merge(arr,l,mid,r);
    //     }   
    // }
    // void merge(int arr[],int l,int mid,int r){
    //     int i=l;
    //     int j=mid+1;
    //     int temp[] = new int[100000];
    //     int k=l;
    //     while(i<=mid && j<=r){
    //         if(arr[i]>arr[j]){
    //             temp[k]=arr[j];
    //             j++;
    //         }
    //         else{
    //             temp[k]=arr[i];
    //             i++;
    //         }
    //         k++;
    //     }
    //     while(i<=mid){
    //         temp[k++]=arr[i++];
    //     }
    //     while(j<=r){
    //         temp[k++]=arr[j++];
    //     }
    //     for(k=l; k<=r; k++){
    //         arr[k]=temp[k];
    //     }
    // }
}