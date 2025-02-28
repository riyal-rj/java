package Arrays.basic;

import java.util.Arrays;

public class ReversetheArray {
    public static void main(String[] args) {
        ReversetheArray rev=new ReversetheArray();
        rev.reverseArray(new int[] {1,2,3,4,5});
    }
    public void reverseArray(int []nums)
    {
        int start=0,end=nums.length-1;
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
    private void swap(int []nums,int pos1,int pos2)
    {
        nums[pos1]=nums[pos1] ^ nums[pos2];
        nums[pos2]=nums[pos2] ^ nums[pos1];
        nums[pos1]=nums[pos1] ^ nums[pos2];
    }
}
