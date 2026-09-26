class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] text2 = text.split(" "); 
        List<String> third = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i < text2.length - 2; i++){

            if(text2[i].equals(first) && text2[i+1].equals(second)){
                third.add(text2[i+2]);
            }
        }
        return third.toArray(new String[0]);
    }
}