package Arrays.advanced;

public class zigZagSearchSorted {
    public static void main(String[] args) {
        int [][]matrix={
                {1,  3,  5,  7 },
                {20, 16, 11, 10},
                {23, 30, 34, 60}};
        System.out.println(new zigZagSearchSorted().searchMatrix(matrix,100));
    }
    private boolean searchMatrix(int [][]matrix,int target)
    {
        int m=matrix.length;
        int n=matrix[0].length;

        int low=0,high=m-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int minVal=Math.min(matrix[mid][0],matrix[mid][n-1]);
            int maxVal=Math.max(matrix[mid][0],matrix[mid][n-1]);

            if(target >= minVal && target <= maxVal)
                return binarySearchInRow(matrix[mid],target);
            else if(target<minVal)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }

    private boolean binarySearchInRow(int []row,int target)
    {
        int low=0,high= row.length-1;
        boolean isLeftToRight=row[0]<row[row.length-1];

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(row[mid]==target)
                return true;
            if(isLeftToRight)
            {
                if(row[mid]<target)
                    low=mid+1;
                else
                    high=mid-1;
            }
            else
            {
                if(row[mid]>target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return false;
    }
}
