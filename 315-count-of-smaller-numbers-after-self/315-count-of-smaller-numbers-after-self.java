class Solution {
    int count[];
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        count = new int[n];
        pair arr[] = new pair[n];
        for(int i=0; i<n; i++){
            arr[i] = new pair(nums[i],i);
        }
        mergeSort(arr,0,n-1);
        
        for(int x : count)
            list.add(x);
        
        return list;
        
        
    }
    void mergeSort(pair arr[],int l,int r){
        int mid = (l+r)/2;
        if(l<r){
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    void merge(pair arr[],int l,int mid,int r){
        pair temp[] = new pair[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=r){
            if(arr[i].first<=arr[j].first){
                temp[k++]=arr[j++];
            }
            else{
                count[arr[i].second] += r-j+1;
                temp[k++]=arr[i++];
            }    
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(int x=l; x<=r; x++){
            arr[x]=temp[x-l];
        }
        
        
    }
}
class pair{
    int first;
    int second;
    
    pair(int f,int s){
        first = f;
        second = s;
    }
}