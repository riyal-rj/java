package Arrays.basic;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mno=new MissingNumber();
        System.out.println(mno.findMissingNo(new int []{1,2,3,4},5));
    }
    //Brute Force Approach
//    public int findMissingNo(int []nums,int N)
//    {
//        int flag=0;
//        for(int i=1;i<=N;i++)
//        {
//            flag=0;
//            for(int j=0;j< nums.length;j++)
//            {
//                if(nums[j] == i)
//                    flag=1;
//            }
//            if(flag==0)
//                return i;
//        }
//        return -1;
//    }


    //Better Approach
//    public int findMissingNo(int []nums,int N)
//    {
//        int []hash=new int[N+1];
//        for(int i=0;i< nums.length;i++)
//        {
//           hash[nums[i]]++;
//        }
//        for(int i=1;i<=N;i++)
//          if(hash[i]==0)
//              return i;
//        return -1;
//    }


    //Most Optimal Approach
    public int findMissingNo(int []nums,int N)
    {
        int xor1=0,xor2=0;
        for(int i=0;i< nums.length;i++)
        {
            xor1=xor1 ^ (i+1);
            xor2=xor2^nums[i];
        }

        xor1=xor1^N;
        return xor1 ^ xor2;
    }


}
