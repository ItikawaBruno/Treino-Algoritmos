public class MaiorMenor {
    public static void main(String[] args) {

        int[] nums = new int[]{10,30,15,50,20,2,27};
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[maior] < nums[i]){
                maior = i;
            }else if(nums[menor] > nums[i]){
                menor = i;
            }
        }

        System.out.println("Menor : "+nums[menor]);
        System.out.println("Maior : "+nums[maior]);


    }
}