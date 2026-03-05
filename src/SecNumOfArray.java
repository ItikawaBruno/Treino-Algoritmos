public class SecNumOfArray {
    public static void main(String[] args) {

        int[] nums = new int[]{6, 50, 1, 60, 55, 57};
        int max = 0;
        int sec = 0;
        int aux = 0;

        for (int i = 0; i < nums.length; i++) {
            aux = 0;
            if(i == 0)max = i;


            if(nums[i] > nums[max]){
                aux = max;
                max = i;
                sec = aux;
            }else if(nums[sec] < nums[i]){
                sec = i;
            }

        }

        System.out.println(sec);

    }
}
