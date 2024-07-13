class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] health, String d) {
        Stack<robot> s = new Stack<>();
        int n = pos.length;
        robot arr[] = new robot[n];
        char dir[] = d.toCharArray();
        for(int i=0; i<n; i++){
            arr[i] = new robot(pos[i],health[i],dir[i]);
        }
        
        Arrays.sort(arr, (p,q)->p.pos-q.pos);
        HashMap<Integer,Integer> map= new HashMap<>();
        for(robot i : arr){
            if(s.isEmpty() && i.dir=='L'){
                map.put(i.pos,i.health);
                continue;
            }
            else if(i.dir=='L'){ 
                boolean flag = false;
                while(s.isEmpty()!=true){
                    if(s.peek().health==i.health){
                        s.pop();
                        flag = true;
                        break;
                    }
                    else if(s.peek().health>i.health){
                        s.peek().health -=1;
                        flag = true;
                        break;
                    }
                    else{
                        s.pop();
                        i.health -= 1;
                    }
                }
                if(flag == false){
                    map.put(i.pos,i.health);
                }
            }
            else{
                s.add(i);
            }
        }
        while(s.isEmpty()!=true){
            robot i = s.pop();
            map.put(i.pos,i.health);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : pos){
            if(map.containsKey(i))list.add(map.get(i));
        }
        return list;
        
    }
}
class robot{
    int pos;
    int health;
    char dir;
    
    robot(int p, int h , char d){
        pos = p;
        health = h;
        dir = d;
    }   
}