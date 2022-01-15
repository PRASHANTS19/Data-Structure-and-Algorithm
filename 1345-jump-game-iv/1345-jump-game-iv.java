class Solution {
    public int minJumps(int[] arr) {
     
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                ArrayList<Integer> list = map.get(arr[i]);
                list.add(i);
                map.put(arr[i],list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i],list);
            }
        }
        boolean visited[] = new boolean[arr.length + 1];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0); 
        int steps = 0;
        
        while(q.isEmpty()!=true){
            for(int size = q.size(); size>0; size--){
                int i = q.remove();
                if(i==arr.length-1)return steps;
                ArrayList<Integer> next = map.get(arr[i]);
                next.add(i+1); next.add(i-1);
                for(int j : next){
                    if(j>0 && j<arr.length && visited[j]==false){
                        visited[j] = true;
                        q.add(j);
                    }
                }
                next.clear();
            }
            steps++;
        }
        return steps;
        
        
        
    }
}