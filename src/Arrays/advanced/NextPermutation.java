package Arrays.advanced;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[]=new int []{1,2,4,3};
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void nextPermutation(int []nums)
    {
        int i=nums.length-2;//second last position

        while(i>=0 && nums[i]>=nums[i+1])//if the current ele > next ele then proceed backwards and check
            i--;

        if(i>=0)
        {
            int j=nums.length-1;//last ele position

            while(j>i && nums[j]<=nums[i])
                j--;
            swap(nums,i,j);//swap the elements from i and j;
        }
        reverse(nums,i+1,nums.length-1);
    }

    private void swap(int []nums,int pos1,int pos2)
    {
        nums[pos1]=nums[pos1] ^ nums[pos2];
        nums[pos2]=nums[pos2] ^ nums[pos1];
        nums[pos1]=nums[pos1] ^ nums[pos2];
    }

    private void reverse(int []nums,int start,int end)
    {
        if(start == end)
            return;
         while(start<end)
         {
             swap(nums,start,end);
             start++;
             end--;
         }
    }
}
