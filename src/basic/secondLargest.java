package basic;

public class secondLargest {

    public static void main(String[] args) {
        int []nums={-24,-1,-2,-3,-7,-78,0};
        int maxi=nums[0];
        int sMaxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > maxi)
            {
                sMaxi=maxi;
                maxi=nums[i];
            }
            else if(nums[i] < maxi && nums[i] > sMaxi)
                sMaxi=nums[i];
        }

        System.out.println("Second Largest: "+sMaxi);
    }
}
