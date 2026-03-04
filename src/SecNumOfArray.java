public class SecNumOfArray {
    public static void main(String[] args) {

        int[] nums = new int[]{6, 50, 1, 60};
        int max = 0;
        int sec = 0;

        for (int i = 0; i < nums.length; i++) {
                if(nums[max] < nums[i]){
                    max = i;
                }
        }

        System.out.println("Resultado: "+nums[sec]);

    }
}
