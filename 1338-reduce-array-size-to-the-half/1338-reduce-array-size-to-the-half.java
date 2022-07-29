class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int count = 0;
        if(n%2==0){
            count = n/2;
        }
        else count = (n/2)+1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            if(map.containsKey(i)==false){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        ArrayList<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            list.add(new int[]{entry.getKey(),entry.getValue()});
        }
        
        Collections.sort(list,(p,q)->q[1]-p[1]);
        
        int res=0;
        for(int[] x : list){
            count -= x[1];
            res++;
            if(count<=0)break;
        }
        return res;
    }
}