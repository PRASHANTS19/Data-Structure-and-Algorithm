class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> matrix = new LinkedList<>();
        Arrays.sort(arr);
        if(arr.length==0)return matrix;
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            int j=i+1; int k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    matrix.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    //can remove duplicacy by skipping duplicates
                    while(j<k && arr[j]==arr[j+1])j++;
                    while(j<k && arr[k]==arr[k-1])k--;
                    j++; k--;
                }
                else if(arr[i]+arr[j]+arr[k]>0)k--;
                else j++;
            }
            while(i<n-2 && arr[i]==arr[i+1])i++;
        }
        return matrix;
        
    }
}