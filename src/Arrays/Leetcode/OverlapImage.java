package Arrays.Leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class OverlapImage {
    public static void main(String[] args) {

    }

    private int maxOverlap(int [][]img1,int[][]img2)
    {
        List<int[]> one1=new ArrayList<>();
        List<int[]> one2=new ArrayList<>();

        int n=img1.length;
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(img1[row][col] == 1)
                    one1.add(new int[]{row,col});
                if(img2[row][col] == 1)
                    one2.add(new int[]{row,col});
            }
        }

        int maxOverlap=-(int)9e9;
        HashMap<String,Integer> map=new HashMap<>();
        for(int cord1[]:one1)
        {
            for(int cord2[]:one2)
            {
                int rowdiff=cord1[0]-cord2[0];
                int coldiff=cord1[1]-cord2[1];
                String key=rowdiff+","+coldiff;
                map.put(key,map.getOrDefault(key,0)+1);
                maxOverlap=Math.max(maxOverlap,map.get(key));
            }
        }
        return maxOverlap;
    }
}
