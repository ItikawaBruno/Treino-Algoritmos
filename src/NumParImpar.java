public class NumParImpar {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 8, 17, 24, 32, 51, 3};
        int contImp = 0;
        int contPar = 0;

        for (int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 != 0){
                    contImp++;
                }else{
                    contPar++;
                }
        }

        System.out.println("Impar: "+contImp);
        System.out.println("Par: "+contPar);

    }
}
