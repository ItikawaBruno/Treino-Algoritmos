public class SecNumOfArray {
    public static void main(String[] args) {

        int[] nums = new int[]{6, 60, 1, 50};
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if((i + 1) < nums.length){
                if(nums[n] < nums[i]){
                    n = i;
                }
            }
        }

        System.out.println("Resultado: "+nums[n]);

    }
}
