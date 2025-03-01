package Arrays.basic;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes maxCnt=new MaxConsecutiveOnes();
        System.out.println(maxCnt.maxConsOnes(new int []{1,1,0,2,3,1,1,1,1,0,0,1,1,0,0,1}));
    }

    int maxConsOnes(int []nums)
    {
        int count=0,maxi=-(int)9e9;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==1)
               count++; //update count when 1 is encountered
           else
               count=0; // reset when 1 is not encountered
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}
