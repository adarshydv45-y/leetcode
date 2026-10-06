class Solution {
    public int minAddToMakeValid(String s) {
        // int countleft = 0;
        // int countright =0;
        // for(char c : s.toCharArray()){
        //     if(c=='('){
        //         countright++;
        //     }
        //     else{
        //         countleft++;
        //     }
        // }
        // if(countright>countleft){
        //     return(countright-countleft);
        // }
        // else{
        //     return(countleft-countright);
        // }
        int count = 0 ;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push('(');
            }
            else if(c==')'){
                if(st.isEmpty())
                count++;
                
                
            }
            
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;
      
        
    }
}