class Solution {
    public int getSecondLargest(int[] arr) {
      
        int max = -1;
        int ans = -1;
        for(int i: arr)
        {
            if(i> max)
            {
                ans = max;
                max = i;
            }
            else if(i < max && i > ans)
            {
                ans = i;
            }
        }
        return ans;
    }
}
