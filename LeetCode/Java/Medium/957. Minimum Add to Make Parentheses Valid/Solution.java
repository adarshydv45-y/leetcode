class Solution {
    public int minAddToMakeValid(String s) {
        int countleft = 0;
        int countright =0;
        for(char c : s.toCharArray()){
            if(c=='('){
                countright++;
            }
            else{
                countleft++;
            }
        }
        if(countright>countleft){
            return(countright-countleft);
        }
        else{
            return(countleft-countright);
        }
        
      
        
    }
}