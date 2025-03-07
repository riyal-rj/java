package Arrays.Leetcode;
import java.util.Arrays;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int []nums={-1,2,1,-4};
        int target=1;
        ThreeSumClosest tsc=new ThreeSumClosest();
        System.out.println(tsc.threeSumClosest(nums,target));
    }
    private int threeSumClosest(int []nums,int target)
    {
        Arrays.sort(nums);
        int closestSum=(int)9e9;
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1,right=nums.length-1;
            while(left<right)
            {
                int currSum=nums[left]+nums[right]+nums[i];
                if(Math.abs(target - currSum) < Math.abs(target - closestSum))
                    closestSum=currSum;
                if(currSum>target)
                    right--;
                else if(currSum<target)
                    left++;
                else
                    return currSum;
            }
        }
        return closestSum;
    }
}
