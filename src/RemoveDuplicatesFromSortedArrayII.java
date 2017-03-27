public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) nums[index++] = nums[i];
        }

        return index;
    }

    public static void main(String[] args) {
        int[] test = {3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 9};
        removeDuplicates(test);
        System.out.println("The length of new array is:" + " " + test.length);
        System.out.print("The new array is:");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

    }
}
