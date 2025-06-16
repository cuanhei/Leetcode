class Solution {
    public int lengthOfLongestSubstring(String s) {

        String unique = "";

        for(int i =  0; i < s.length(); i++){
            if(!unique.contains(String.valueOf(s.charAt(i)))){
                unique+= String.valueOf(s.charAt(i));
            }
        }
        
        int bestCount = 0;
        int count = 0;
        String temp = unique;

        for(int j = 0; j < s.length() && bestCount < s.length(); j++){
            for(int i = j; i < s.length() && temp.length()!=0; i++){
                if(temp.contains(String.valueOf(s.charAt(i)))){
                    temp = temp.replace(String.valueOf(s.charAt(i)), "");
                    count++;
                }else{
                    temp = unique;
                    count = 0;
                    break;
                }
                bestCount = (bestCount < count)?count:bestCount;
            }
        }
        
        return bestCount;
    }
}