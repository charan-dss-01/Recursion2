import java.util.ArrayList;

public class SubSequence {
    void printSubSequenece(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        else{
            printSubSequenece(p+up.charAt(0),up.substring(1));
            printSubSequenece(p,up.substring(1));
        }
    }

    void printSubSequenece1(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        else{
            printSubSequenece1(p+up.charAt(0),up.substring(1),list);
            printSubSequenece1(p,up.substring(1),list);
        }
    }

    ArrayList<String> printSubSequenece2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        else{
            ArrayList<String> left=printSubSequenece2(p+up.charAt(0),up.substring(1));
            ArrayList<String> right=printSubSequenece2(p,up.substring(1));
            left.addAll(right);
            return left;
        }
    }
    public static void main(String[] args) {
        SubSequence ob=new SubSequence();
        ArrayList<String> li=new ArrayList<>();
        ob.printSubSequenece("", "abc");
        ob.printSubSequenece1("", "abc",li);
        for(String s:li){
            System.out.println(s);
        }
        li=ob.printSubSequenece2("","abc");
        for(String s:li){
            System.out.println(s);
        }
    }
}
