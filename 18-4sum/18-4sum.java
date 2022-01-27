class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> matrix = new LinkedList<>();
        int n = arr.length;
        if(n<4)return matrix;
        for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
                int front=j+1; int back=n-1;
               while(front<back){
                   if(arr[i]+arr[j]+arr[front]+arr[back]<target)front++;
                   else if(arr[i]+arr[j]+arr[front]+arr[back]>target)back--;
                   else{
                       List<Integer> list = new ArrayList<>();
                       list.add(arr[i]);
                       list.add(arr[j]);
                       list.add(arr[front]);
                       list.add(arr[back]);
                       matrix.add(list);
                       while(front<back && arr[front]==list.get(2))front++;
                       while(front<back && arr[back]==list.get(3))back--; 
                   }
               }
               while(j<n-2 && arr[j]==arr[j+1])j++;
            }
            while(i<n-3 && arr[i]==arr[i+1])i++;
        }
        return matrix;
    }
}