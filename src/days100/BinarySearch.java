package days100;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(findElement(nums,9));
    }

    public static int findElement(int[] nums, int target){

        int start = 0;
        int end = nums.length -1;

            while(start <= end){
                int mid = (start+end)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        return -1;
    }
}
