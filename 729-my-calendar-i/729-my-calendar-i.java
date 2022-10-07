class MyCalendar {

    ArrayList<int[]>list;
    public MyCalendar() {
        list = new ArrayList<>();
    }
    
    public boolean book(int s, int e) {
       
        boolean flag = true;
        for(int x[] : list){
            if(s>=x[0] && s<x[1] || e>x[0] && e<x[1] || e>x[0] && s<=x[0]){
                flag = false;
                break;
            }
        }
        if(flag){
            list.add(new int[]{s,e});
        }
        return flag;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */