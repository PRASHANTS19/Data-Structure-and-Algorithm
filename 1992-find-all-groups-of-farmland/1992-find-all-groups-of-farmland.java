class Solution {
    
    public int[][] findFarmland(int[][] arr) {
        int r = arr.length, c = arr[0].length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean vis[][] = new boolean[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c;j++){
                if(arr[i][j] == 1 && vis[i][j]==false){
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    solve(arr,vis,i,j, l);
                    list.add(l);
                }
            }
        }
        
        int ans[][] = new int[list.size()][4];
        for(int i=0; i<list.size(); i++){
            int a[] = {list.get(i).get(0),list.get(i).get(1),list.get(i).get(2),list.get(i).get(3)};
            ans[i] = a;
        }
        return ans;
        
        
    }
    void solve(int arr[][], boolean vis[][], int i, int j, ArrayList<Integer>l){
        if(i<0||j<0||i>=arr.length||j>=arr[0].length||vis[i][j]||arr[i][j]==0)return;
        vis[i][j]=true;
        
        if((i+1>=arr.length && j+1>=arr[0].length)){l.add(i); l.add(j);}
        else if((i+1<arr.length && j+1<arr[0].length)&&arr[i+1][j]==0 &&arr[i][j+1]==0){l.add(i); l.add(j);}
        else if(i+1<arr.length && j+1>=arr[0].length && arr[i+1][j]==0){l.add(i); l.add(j);}
        else if(i+1>=arr.length && j+1<arr[0].length && arr[i][j+1]==0){l.add(i); l.add(j);}
        
        solve(arr,vis,i+1,j,l);
        solve(arr,vis,i-1,j,l);
        solve(arr,vis,i,j+1,l);
        solve(arr,vis,i,j-1,l);
        
    }
}



















