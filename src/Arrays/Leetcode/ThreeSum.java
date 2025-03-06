package Arrays.Leetcode;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array length:- ");
        int n=Integer.parseInt(br.readLine());
        int []nums=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            nums[i]=Integer.parseInt(br.readLine());
        ThreeSum ts=new ThreeSum();
        System.out.println(ts.threeSum(nums));
    }
    private List<List<Integer>> threeSum(int []nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int start=i+1,end=nums.length-1;
            int target=nums[i];
            while(start<end)
            {
                if(nums[start]+nums[end] +target> 0)
                    end--;
                else if(nums[start]+nums[end]+target<0)
                    start++;
                else if(nums[start]+nums[end] +target== 0) {
                    result.add(Arrays.asList(nums[start], nums[end], target));
                    while(start<end && nums[start]==nums[start+1])
                        start++;
                    while(start<end && nums[end]==nums[end-1])
                        end--;
                    start++;
                    end--;
                }
            }
        }
        return result;
    }
}
