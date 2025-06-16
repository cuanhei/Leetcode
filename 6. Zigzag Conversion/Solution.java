class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String[] rows = new String[numRows];
        Arrays.fill(rows, "");

        int rowIndex = 0;
        boolean increase = true;
        for(int i = 0; i < s.length(); i++){
            rows[rowIndex] += String.valueOf(s.charAt(i));
            if(increase){
                if(rowIndex == numRows-1){
                    increase = false;
                    rowIndex--;
                }else{
                    rowIndex++;
                }
            }else{
                if(rowIndex == 0){
                    increase = true;
                    rowIndex++;                
                }else{
                    rowIndex--;
                }
            }
        }
        
        String output = "";
        for(int i = 0; i < numRows; i++){
            output += rows[i];
        }
        return output;
    }
}