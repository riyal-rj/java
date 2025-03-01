package Arrays.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class LeadersOfArray {
    public static void main(String[] args) {

        int nums[]={1,22,10,12,4,5,6};
        System.out.println(Arrays.toString(new LeadersOfArray().leadersOfArray(nums)));
    }

    int []leadersOfArray(int []nums)
    {
        int leader=-(int)9e9;
        List<Integer> res=new ArrayList<>();
        for(int i= nums.length-1;i>=0;i--)
        {
            if(nums[i] >leader)
            {
                res.add(nums[i]);
                leader=nums[i];
            }
        }
        Collections.sort(res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
