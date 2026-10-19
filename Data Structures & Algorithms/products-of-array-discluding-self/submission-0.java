class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int sleft = 1;
        int sright = 1;

        for(int i=0; i<left.length; i++) {
            left[i] = nums[i] * sleft;
            sleft = nums[i] * sleft;
        }
        for(int i=nums.length-1; i>=0; i--) {
            right[i] = nums[i] * sright;
            sright = nums[i] * sright;

        }

       System.out.println(Arrays.toString(left) + " " + Arrays.toString(right));

        int[] res = new int[n];

        for(int i=0; i<res.length; i++) {
            int leftval = i == 0? 1 : left[i-1];
            int rightval = i == res.length-1? 1:right[i+1];
            res[i] = leftval * rightval;
        }

        return res;
    }
}  
