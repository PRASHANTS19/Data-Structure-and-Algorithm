class UndergroundSystem {
    HashMap<Integer,pair> map1;
    HashMap<String,HashMap<String,ArrayList<Integer>>>map2;
    
    public UndergroundSystem() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map1.put(id,new pair(stationName,t));
    }
    
    public void checkOut(int id, String endStation, int endTime) {
        pair temp = map1.get(id);
        String startStation = temp.ss;
        int startTime = temp.time;
        
        if(map2.containsKey(startStation)){
            HashMap<String,ArrayList<Integer>> tempmap = map2.get(startStation);
            if(tempmap.containsKey(endStation)){
                tempmap.get(endStation).add(endTime-startTime);
            }
            else{
                tempmap.put(endStation,new ArrayList<>(Arrays.asList(endTime-startTime)));
            }
            map2.put(startStation,tempmap);
        }
        else{
            HashMap<String,ArrayList<Integer>> tempmap = new HashMap<>();
            tempmap.put(endStation,new ArrayList<>(Arrays.asList(endTime-startTime)));
            
            map2.put(startStation,tempmap);   
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        HashMap<String,ArrayList<Integer>> tempmap = map2.get(startStation);
        
        int s = tempmap.get(endStation).size();
        int totalTime = 0;
        for(int i : tempmap.get(endStation)){
            totalTime += i;
        }
        return (double)((double)totalTime/(double)s);
    }
}

class pair{
    String ss;
    int time;
    
    pair(String s, int t){
        ss = s;
        time = t;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */