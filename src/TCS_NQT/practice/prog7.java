package TCS_NQT.practice;

public class prog7 {
    //abbba   abbb

    public static void main(String[] args) {
        String s1="abbbaabbb";
        int L1=5;
        System.out.println(countMaxAquaCurtains(s1,L1));
        String s2="bbbaaababa";
        int L2=3;
        System.out.println(countMaxAquaCurtains(s2,L2));
    }

    private static int countMaxAquaCurtains(String str,int L)
    {
        int len=str.length();
        int count=0;
        int maxCount=0;
        for(int i=0;i<len;i++)
        {
            if(i % L ==0)
            {
                maxCount=Math.max(maxCount,count);
                count=0;
            }
            char ch=str.charAt(i);
            if(ch == 'a')
                count++;
        }
        return maxCount;
    }
}
