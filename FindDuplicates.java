//DAY 1
//the code returns an integer which gives us the number which is repeated in the array
import java.util.HashSet;
import java.util.Scanner;
public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String args[]){
        int n;
        FindDuplicates fd=new FindDuplicates();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int x=fd.findDuplicate(nums);
        System.out.println("The duplicate element in the given array is"+" "+x);
    }   
}
