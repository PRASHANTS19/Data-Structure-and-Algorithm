class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        
        int n = arr.length;
        
        HashSet<List<Integer>>set = new HashSet<>();
        boolean freq[] = new boolean[n];
        
        solve(arr,0,n,set,new ArrayList<>(),freq);
        
        List<List<Integer>> matrix = new ArrayList<>();
        
        for(List<Integer> list : set){
            matrix.add(new ArrayList<>(list));
        }
        
        return matrix;
                
        
    }
    void solve(int arr[],int i,int n,HashSet<List<Integer>>set, List<Integer>list,boolean[] freq){
         if(list.size()==n){
            set.add(new ArrayList<>(list));
            return;
        }       
        for(int j=0; j<n; j++){
            if(freq[j]==false){
                freq[j]=true;
                list.add(arr[j]);
                solve(arr,j,n,set,list,freq);
                list.remove(list.size()-1);
                freq[j]=false;
            }
            
        }
        
        
    }
}