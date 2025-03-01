package Arrays.advanced;

public class MaximumSubArray {
    public static void main(String[] args) {
        int []nums={-2,-3,4-1,-2,1,5,-3};
        MaximumSubArray msa=new MaximumSubArray();
        System.out.println(msa.solve(nums));
    }

    //Kadane's Algorithm ----------------> O(n)
    private int maximumSubArraySum(int []nums)
    {
        // Algorithm:-
        // Reject the sum if it is negative.
        // Accept the sum until it is positive and follow up the process to find the maximum sum of the sub-array.
        int maxSum=-(int)9e9;int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }


    //Brute force Approach
    private int solve(int []nums)
    {
        int maxSum=-(int)9e9;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j< nums.length;j++)
            {
                sum+=nums[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

}
