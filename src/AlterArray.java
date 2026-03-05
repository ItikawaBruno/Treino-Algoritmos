import java.util.Arrays;

public class AlterArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,7,15,21};
        int ini = 0;
        int fim = nums.length - 1;

        while(ini < fim){
            int aux = nums[ini];
            nums[ini] = nums[fim];
            nums[fim] = aux;
            ini++;
            fim--;
        }

    }
}
