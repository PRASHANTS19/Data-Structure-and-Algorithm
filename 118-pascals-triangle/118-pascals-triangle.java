class Solution {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<row; i++){
            list.add(new ArrayList<>());
        }
        if(row == 0)return list;
        list.get(0).add(1);
        if(row==1)return list;
        list.get(1).add(1);
        list.get(1).add(1);
        if(row==2) return list;
    
        for(int i=2; i<row; i++){
            for(int j=0; j<=i; j++){
                if(j==0){
                    list.get(i).add(1);
                }
                else if(j==i){
                    list.get(i).add(1);
                }
                else{
                    int a = list.get(i-1).get(j-1);
                    int b = list.get(i-1).get(j);
                    list.get(i).add(a+b);
                }
            }
        }
        return list;
    }
}