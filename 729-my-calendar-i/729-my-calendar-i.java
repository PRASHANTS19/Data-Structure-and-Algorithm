class MyCalendar {
    ArrayList<pair> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        Collections.sort(list,(p,q)->p.second-q.second);
        boolean flag = true;
        for(int i=0; i<list.size(); i++){
            if((list.get(i).first<=start && list.get(i).second>start)){
                flag = false;
                break;
            }
            if(list.get(i).first>=start && (list.get(i).second<=end || list.get(i).first<end)){
                flag = false;
                break;
            }
        }
        if(flag)list.add(new pair(start,end));
        
        return flag;
    }
}
class pair{
    int first;
    int second;
    pair(int f,int s){
        first = f;
        second = s;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */