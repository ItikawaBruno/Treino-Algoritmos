public class TowPointer {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,4,6,10};
        int left = 0;
        int right = nums.length - 1;
        int expected = 8;

        while (left < right){
            if((nums[left] + nums[right]) == expected){
                break;
            }else if((nums[left] + nums[right]) > expected){
                right--;
            }else{
                left++;
            }
        }

        System.out.println("result: "+left+" - "+right);

    }
}
