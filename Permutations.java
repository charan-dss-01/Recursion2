import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        print("", "abc");
        int[] nums = {1, 2, 3};
        Permutations sol=new Permutations();
        List<List<Integer>> permutations = sol.permute(nums);

        System.out.println("All permutations of " + Arrays.toString(nums) + ":");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
    static void print(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String l=p.substring(i,p.length());
            print(f+ch+l,up.substring(1));
        }
    }
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void helper(int[] nums,int ind,List<List<Integer>> ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(Arrays.stream(nums).boxed().toList()));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,ind,i);
            helper(nums,ind+1,ans);
            swap(nums,ind,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        helper(nums,0,list);
        return list;
    }
}
