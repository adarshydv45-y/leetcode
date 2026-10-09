class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count %2 ==1){
                    ans++;
                    count--;
                }
                count += 2;
            }
            else{
                count--;
                if(count < 0){
                    ans++;
                    count = 1;
                }
            }
        }
        return ans + count;
        
    }
}