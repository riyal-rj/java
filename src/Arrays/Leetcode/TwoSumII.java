package Arrays.Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoSumII {
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

        TwoSumII ts=new TwoSumII();
        System.out.println(Arrays.toString(ts.twoSum(nums,target)));
    }

    private int []twoSum(int nums[],int target)
    {
        int left=0,right=nums.length-1;
        while(left<right)
        {
            if(nums[left] + nums[right] >target)
                right--;
            else if(nums[left] + nums[right]<target)
                left++;
            else if(nums[left] + nums[right] == target)
                return new int[]{left+1,right+1};
        }
        return new int[]{};
    }
}
