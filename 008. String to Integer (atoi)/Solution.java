class Solution {
    public int myAtoi(String s) {

        int number = 0;
        boolean isNegative = false;
        s = s.trim();
        if(s.length() == 0) return 0;

        if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
           number += s.charAt(0)-'0'; 
        }else if(s.charAt(0) == '-'){
            isNegative = true;
        }else if(s.charAt(0) == '+'){
            //do nothing
        }else{
            return number;
        }

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                try{
                    number = Math.multiplyExact(number, 10);
                    number = Math.addExact(number, s.charAt(i)-'0');
                }catch(ArithmeticException e){
                    if(isNegative){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
                System.out.println(number);
            }
            else{
                break;
            }
        }
        return (isNegative)?number*-1:number;
    }
}