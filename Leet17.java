public class Leet17 {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    void helper(String p,String up,List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        else{
            int digit = up.charAt(0) - '0';  
            String letter = KEYPAD[digit];
            for(int i=0;i<letter.length();i++){
                char ch=letter.charAt(i);
                helper(p + ch, up.substring(1), ans);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.isEmpty()){
            return ans;
        }
        helper("",digits,ans);
        return ans;
    }
}
