class StringSkipChar{
    void skipStr(String str,char c){
        //String res=helper(str,c,"",0);
        //System.out.println(res);
        String res1=skipApple(str);
        System.out.println(res1);
    }
    String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        else{
            if(up.startsWith("apple")){
                return skipApple(up.substring(5));
            }
            else{
                return up.charAt(0)+skipApple(up.substring(1));
            }
        }
    }
    String helper(String mstr,char c,String ans,int count){
        if(count>=mstr.length()){
            return ans;
        }
        if(mstr.charAt(count)==c){
            return helper(mstr,c,ans,count+1);
        }
        else{
            return helper(mstr,c,ans+mstr.charAt(count),count+1);
        }
    }

    public static void main(String[] args) {
        StringSkipChar ob=new StringSkipChar();
        System.out.println(ob.skipApple("baapple"));
        //ob.skipStr("cherry", 'r');
    }
}