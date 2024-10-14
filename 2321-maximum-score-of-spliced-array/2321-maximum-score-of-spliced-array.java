class Solution {
    public int maximumsSplicedArray(int[] num1, int[] num2) {
        int n = num1.length;
        long t1 = sum(num1);
        long t2 = sum(num2);
        
        
        long diff1=0, max1 = 0, diff2=0, max2=0;
        for(int i=0; i<n; i++ ){
            diff1 += num2[i]-num1[i];
            diff2 += num1[i]-num2[i];
            if(diff1>0){
                max1 = Math.max(max1,diff1);
            }
            else diff1 = 0;
            if(diff2>0){
                max2 = Math.max(max2,diff2);
            }
            else diff2 = 0;
        }
        return (Math.max((int)(t1+max1),(int)(t2+max2)));
        
    }
    static long sum(int arr[]){
        long s = 0;
        for(int i : arr)
            s += i;
        
        return s;
    }
    static void swap(int[] a, int[] b, int Size){
		int i;
		for(i = 0; i < Size; i++)
		{
		    a[i] = a[i] + b[i];
		    b[i] = a[i] - b[i]; 
		    a[i] = a[i] - b[i];
		}
	}
}