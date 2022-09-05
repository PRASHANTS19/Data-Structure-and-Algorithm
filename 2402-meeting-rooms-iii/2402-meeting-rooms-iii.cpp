class Solution {
public:
    int mostBooked(int n, vector<vector<int>>& meetings) {
        // if(n>=meetings.size())  return 0;
        sort(meetings.begin(),meetings.end());
        priority_queue<pair<long long,int> , vector<pair<long long,int>> ,greater<>> rooms;
        priority_queue<int,vector<int>,greater<>> available;
        
        for(int i=0;i<n;++i)    available.push(i);
        
        vector<int> ans(n,0);
        for(auto it:meetings){
            long long start=it[0];
            int duration=it[1]-it[0];
            
            while(!rooms.empty() && rooms.top().first<=start){
                available.push(rooms.top().second);
                rooms.pop();
            }
            int room;
            if(available.empty()){
                start = rooms.top().first;
                room = rooms.top().second;
                rooms.pop();
            }
            else{
                room=available.top();
                available.pop();
            }
            
            ans[room]++;
            rooms.push({start+duration,room});
            
            
        }
        int ansx = 0;
        for(int i=0; i<n; i++) 
            if(ans[ansx]<ans[i])
                ansx = i;
        
        return  ansx;
        
    }
    
//     int mostBooked(int n, vector<vector<int>>& meetings) {
//         sort(meetings.begin(), meetings.end());     //Sort the array for getting the earliest meet first
        
//         priority_queue<pair<long long, int>, vector<pair<long long, int>>, greater<>> rooms;        //Keep track of all occupied rooms and their meeting end time
//         priority_queue<int, vector<int>, greater<>> available;      //Gives all available rooms at the time
        
//         for(int i=0; i<n; i++) {
//             available.push(i);
//         }
        
//         vector<int> numMeets(n, 0);
//         for(auto& meet: meetings) {
//             long long start = meet[0];
//             int duration = meet[1] - meet[0];
            
//             while(!rooms.empty() && rooms.top().first<=start) { //Keep track of all available rooms
//                 available.push(rooms.top().second);
//                 rooms.pop();
//             }
            
//             int room;
//             if(available.empty()) {     //Delay the meeting if no room is available.
//                 start = rooms.top().first;
//                 room = rooms.top().second;
//                 rooms.pop();
//             }
//             else {
//                 room = available.top(); //Decide the room
//                 available.pop();
//             }
            
//             numMeets[room]++;       //Mark the meeting
//             rooms.push({start+duration, room});     //Put the end time and the room in the heap
            
//         }
        
//         int ans = 0;
//         for(int i=0; i<n; i++)      //Extract out the lowest room with max meetings
//             if(numMeets[ans]<numMeets[i])
//                 ans = i;
        
//         return  ans;
//     }
};