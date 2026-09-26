class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> i : knowledge){
            if(i!=null && i.size()>=2){
                map.put(i.get(0),i.get(1));
            }
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!='('){
                ans.append(s.charAt(i));
            }else{
                temp.setLength(0);
                int j = i+1 ;
                while(s.charAt(j)!=')'){
                    temp.append(s.charAt(j));
                    j++;
                }
                i = j;
                if(map.containsKey(temp.toString())){
                    ans.append(map.get(temp.toString()));
                }else{
                    ans.append('?');
                }
                
            }
            
        }
        return ans.toString();
    }
}