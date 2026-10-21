class Solution {
    public int reverse(int x) {
        int positive = (x < 0)? x*-1: x;        
        String original = String.valueOf(positive);
        int reversed = 0;
        while (x != 0){
            reversed *= 10;
            reversed += (x % 10);
            x/=10;
        }
                       
        if(reversed >= 100000000 || reversed <= -100000000){
            String reversedOri = new StringBuilder(original).reverse().toString();
            return (reversedOri.equals(String.valueOf((reversed<0)?reversed*-1:reversed)))?reversed:0;
        }else{
            return reversed;
        }
    }
}