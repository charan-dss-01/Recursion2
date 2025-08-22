import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        Permutation2 obj=new Permutation2();
        obj.printPermutations("", "123", ans);
         Collections.sort(ans);

        System.out.println(ans);
    }
    void printPermutations(String p,String up,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        else{
            char ch=up.charAt(0);
            for(int i=0;i<=p.length();i++){
                String f=p.substring(0,i);
                String l=p.substring(i);   
                printPermutations(f+ch+l, up.substring(1),ans);             
            }
        }
    }
}
