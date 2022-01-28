class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> matrix = new LinkedList<>();
        Arrays.sort(arr);
        if(arr.length==0)return matrix;
        for(int i=0; i<arr.length-2; i++){
            if(i>0 && arr[i]==arr[i-1])continue; //help to remove the dup to enter in the list.
            int j=i+1; int k=arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]==-arr[i]){
                    matrix.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j<k && arr[j]==arr[j+1])j++;
                    while(j<k && arr[k]==arr[k-1])k--;
                    j++; k--;
                }
                else if(arr[j]+arr[k]>-arr[i]){
                    k--;
                }
                else j++;
            }
        }
        return matrix;
    }
}