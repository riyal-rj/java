package Arrays.advanced;

import java.util.*;

public class RearrangedSign {
    public static void main(String[] args) {
        RearrangedSign rs=new RearrangedSign();
        System.out.println(Arrays.toString(rs.mostOptimal(new int []{-1,2,3,4,-3,1,-9,-6,-7})));
    }

    private int[] rearrange(int []nums)
    {
        Queue<Integer> positives=new LinkedList<Integer>();
        Queue<Integer> negatives=new LinkedList<Integer>();
        for(int n:nums)
        {
            if(n>0)
                positives.add(n);
            else
                negatives.add(n);
        }
        int ind=0;
        while (!positives.isEmpty() && !negatives.isEmpty()) {
            nums[ind++] = positives.poll();
            nums[ind++] = negatives.poll();
        }

        // If any positive numbers are left
        while (!positives.isEmpty()) {
            nums[ind++] = positives.poll();
        }

        // If any negative numbers are left
        while (!negatives.isEmpty()) {
            nums[ind++] = negatives.poll();
        }
        return nums;
    }

    int [] mostOptimal(int []nums)
    {
        int n=nums.length;
        int posInd=0,negInd=1;
        while(posInd<n && negInd<n)
        {
            while(posInd<n && nums[posInd]>0)posInd+=2;//find the first misplaced negative element;
            while(negInd<n && nums[negInd]<0) negInd+=2;//find te first misplace positive element

            if(posInd< n && negInd<n)
            swap(nums,posInd,negInd);

        }
        return nums;
    }
    private void swap(int []nums,int pos1,int pos2)
    {
        nums[pos1]=nums[pos1] ^ nums[pos2];
        nums[pos2]=nums[pos2] ^ nums[pos1];
        nums[pos1]=nums[pos1] ^ nums[pos2];
    }
}
