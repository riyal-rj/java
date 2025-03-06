package Arrays.Leetcode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array length:- ");
        int n=Integer.parseInt(br.readLine());
        int []nums=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
         nums[i]=Integer.parseInt(br.readLine());
        System.out.println("Enter the target:- ");
        int target=Integer.parseInt(br.readLine());

        TwoSum ts=new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(nums,target)));
    }

    private int [] twoSum(int []nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            else map.put(nums[i],i);
        }
        return new int[]{};
    }
}
