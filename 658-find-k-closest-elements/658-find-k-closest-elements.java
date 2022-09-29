class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        if(x>=arr[n-1]){
            for(int i=n-k; i<n; i++){
                list.add(arr[i]);
            }
        }
        else if(x<=arr[0]){
            for(int i=0; i<k; i++){
                list.add(arr[i]);
            }
        }
        else{
            int i=0,j=0;
            for(int kk=0; kk<n-1; kk++){
                if(arr[kk]<=x && x<=arr[kk+1]){
                    i=kk;
                    j=kk+1;
                    // System.out.println(arr[kk] + " " + arr[kk+1]);
                    break;
                }
            }
            
            while(i>=0 && j<n && k>0){
                if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)){
                    list.add(arr[i]);
                    i--;
                }
                else if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                    list.add(arr[j]);
                    j++;
                }
                // else{
                //     list.add(arr[i]);
                //     i--;
                // }
                k--;
            }
            if(k>0){
                while(i>=0 && k>0){
                   list.add(arr[i]);
                    i--; 
                    k--;
                }
            }
            if(k>0){
                while(j<n && k>0){
                    list.add(arr[j]);
                    j++;
                    k--;
                }
            }
            Collections.sort(list);
        }
        return list;
        
        
    }
}