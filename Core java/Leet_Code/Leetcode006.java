public class Leetcode006 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
    public static void main(String[] args) {
       
        Leetcode006 leetcode006 = new Leetcode006();
        
  
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        
      
        int length = leetcode006.removeDuplicates(nums);
        
      
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}