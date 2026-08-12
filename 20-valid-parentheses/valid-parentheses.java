class Solution {
    public boolean isValid(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                str.append(ch);
            }else{
                if(str.length()==0){
                    return false;
                }
                char last=str.charAt(str.length()-1);
                if(ch==')'&&last=='('||ch=='}'&&last=='{'||ch==']'&&last=='['){
                    str.deleteCharAt(str.length()-1);
                }else{
                    return false;
                }
            }
        }
        return str.length()==0;
    }
}