class MedianFinder {
    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;
    
    public MedianFinder() {
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new  PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxheap.size()==0 || maxheap.peek()>=num){
            maxheap.add(num);
        }
        else minheap.add(num);
        
        if(maxheap.size()>minheap.size()+1)
            minheap.add(maxheap.remove());
        else if(minheap.size()>maxheap.size())
            maxheap.add(minheap.remove());
    }
    
    public double findMedian() {
        if(minheap.size()==maxheap.size())
            return (minheap.peek()+maxheap.peek())/2.0;
        return maxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */