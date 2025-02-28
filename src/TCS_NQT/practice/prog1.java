package TCS_NQT.practice;
import java.util.Arrays;
public class prog1 {
    /*
Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
Output:
4 5 1 9 5 0 0 0

Example 2:
Input:
6 — Value of N.
[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline
Output:
6 1 8 2 0 0
     */
    public static void main(String args[])
    {
        int nums1[]={6,0,1,8,0,2};
        prog1 ob1=new prog1();
        ob1.solve(nums1);
        System.out.println(Arrays.toString(nums1));

        int nums2[]={4,5,0,1,9,0,5,0};
//        ob1.solve(nums2);
        ob1.solveOptimal(nums2);
        System.out.println(Arrays.toString(nums2));
    }
    public  void solve(int []nums)
    {
        int n=nums.length;
        int ind=0;
        int noOfZeroes=0;
        for(int i=0;i<n;i++) {
            if (nums[i] != 0)
                nums[ind++] = nums[i];
            else
                noOfZeroes++;
        }
        for(int i=0;i<noOfZeroes;i++)
        {
            nums[ind+i]=0;
        }
    }

    public void solveOptimal(int []nums)
    {
        int firstZero=0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==0) {
                firstZero = i;
                break;
            }
        }
        if(firstZero==0)
        {
            System.out.println("No zeroes in the array!");
            return;
        }
        for(int i=firstZero+1;i< nums.length;i++)
        {
            if(nums[i]!=0) {
                swap(nums, i, firstZero);
                firstZero++;
            }
        }


    }
    private void swap(int []nums,int pos1,int pos2)
    {
        nums[pos1]=nums[pos1] ^ nums[pos2];
        nums[pos2]=nums[pos2] ^ nums[pos1];
        nums[pos1]=nums[pos1] ^ nums[pos2];
    }
}
