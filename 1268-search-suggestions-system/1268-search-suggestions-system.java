class Solution {
    public List<List<String>> suggestedProducts(String[] arr, String w) {
        List<List<String>> matrix = new ArrayList<>();
        
        Arrays.sort(arr);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<w.length(); i++){
            str.append(w.charAt(i));
            List<String> list = new ArrayList<>();
            
            for(int j=0; j<arr.length; j++){
                if(arr[j].length()>=str.length()){
                	String sub = arr[j].substring(0,str.length());
                    if(str.toString().equals(sub)){
                        list.add(arr[j]);
                    }
                }
                if(list.size()==3)break;
            }
            matrix.add(new ArrayList<>(list));
        }
        return matrix;
    }
}