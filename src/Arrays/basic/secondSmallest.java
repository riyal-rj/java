package Arrays.basic;

public class secondSmallest {
    public static void main(String[] args) {
        int []nums={24,1,2,3,7,78,0};
        int mini=nums[0];
        int sMini=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < mini)
            {
                sMini=mini;
                mini=nums[i];
            }
            else if(nums[i] > mini && nums[i] < sMini)
                sMini=nums[i];
        }

        System.out.println("Second Smallest: "+sMini);
    }
}
