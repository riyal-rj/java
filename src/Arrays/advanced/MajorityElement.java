package Arrays.advanced;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int []nums={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(new MajorityElement().majorityElement(nums));
        System.out.println(new MajorityElement().majority(nums));
    }

    private int majorityElement(int []nums)
    {
        //Better Approach
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int num:nums)
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry: mpp.entrySet())
        {
            if(entry.getValue()>= nums.length/2)
                return entry.getKey();
        }
        return -1;
    }


    private int majority(int []nums)
    {
        //Optimal Approach ---> Moore's Voting Algorithm

        //Intuition:-
        // 1) for every new set consider new
        //      ele=nums[i]
        //      set count=1

        // 2) when I am getting the same ele then increment the count
        // 3) for different ele the  decrement the count.

        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count == 0)
            {
                ele=nums[i];
                count=1;
            }

            if(nums[i] == ele)
                count++;
            else
                count--;
        }
        return ele;
    }
}
