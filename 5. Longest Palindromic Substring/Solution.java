class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp += String.valueOf(s.charAt(i));
            if(longest.length() < temp.length())
                longest = temp;
            for(int j = i+1; j < s.length() && longest.length() < s.length() -i; j++){
                temp += String.valueOf(s.charAt(j));
                if (isPalindrome(temp) && longest.length() < temp.length()){
                    longest = temp;
                }
            }
            temp = "";
        }
        return longest;
    }

    private boolean isPalindrome(String s){
        for(int i = 0; i < s.length() && i < s.length() /2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}