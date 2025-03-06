package Arrays.Leetcode;

public class TrappingRainwater {
    public static void main(String[] args) {
        int []height={0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainwater trw=new TrappingRainwater();
        System.out.println(trw.trapRainwater(height));
    }

    private int trapRainwater(int []height)
    {
        int start=0,end=height.length-1;
        int leftMax=0,rightMax=0;
        int totalTrapped=0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                if(height[start]>=leftMax)
                    leftMax=height[start];
                else {
                    totalTrapped += leftMax - height[start];
                }
                start++;
            }
            else
            {
                if(height[end]>=rightMax)
                    rightMax=height[end];
                else{
                    totalTrapped+=rightMax-height[end];
                }
                end--;
            }
        }
        return totalTrapped;
    }
}
