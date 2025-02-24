package basic;
import java.util.Arrays;
public class rightRotateByKDist {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));

    }
    private static void rotate(int []nums,int k)
    {
        int n=nums.length;
        k=k%n;

        //Right Rotate
        reverse(nums,0,n-1);  //[7,6,5,4,3,2,1}
        reverse(nums,0,k-1);  //{5,6,7,4,3,2,1}
        reverse(nums,k,n-1);    //{5,6,7,1,2,3,4}
    }
    private static void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            nums[start]=nums[start] ^ nums[end];
            nums[end]=nums[start] ^ nums[end];
            nums[start]=nums[start]^nums[end];
            start++;
            end--;
        }
    }
}
