public class EncontrarElemento {
    public static void main(String[] args) {

        int[] nums = new int[]{20, 12, 27,5, 9, 53};
        int choose = 5;
        int indice = 0;



        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 5){
                indice = i;
            }
        }

        System.out.println(nums[indice]);

    }
}
