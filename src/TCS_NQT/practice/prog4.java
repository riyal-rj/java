package TCS_NQT.practice;

import java.util.Arrays;

public class prog4 {
    public static void main(String[] args) {
        int []nums={2,0,2,1,1,0};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortArray(int []nums)
    {
        int n=nums.length;
        int low=0,mid=0,high=n-1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                nums[low]=nums[low] ^ nums[mid];
                nums[mid]=nums[mid] ^ nums[low];
                nums[low]=nums[low] ^ nums[mid];
                low ++;
                mid ++;
            }
            else if(nums[mid] == 1)
            {
                mid ++;
            }
            else
            {
                nums[mid]=nums[mid] ^ nums[high];
                nums[high]=nums[high] ^ nums[mid];
                nums[mid]=nums[mid] ^ nums[high];
                high --;
            }
        }
    }
}
