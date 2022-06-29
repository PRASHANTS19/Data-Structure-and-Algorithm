class Solution {
    public int[][] reconstructQueue(int[][] arr) {
        
          Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
               ArrayList<Integer> dummy = new ArrayList<>();
                dummy.add(arr[i][0]);
                dummy.add(arr[i][1]);
                list.add(arr[i][1],new ArrayList<>(dummy));
        }
        int res[][] = new int[arr.length][2];
        int i = 0;
        for(ArrayList<Integer> l : list){
            res[i][0] = l.get(0);
            res[i][1] = l.get(1);
            i++;
        }
        return res;
    }
}