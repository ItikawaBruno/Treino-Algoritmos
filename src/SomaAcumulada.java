public class SomaAcumulada {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};
        int[] newList = new int[4];
        int nextResult = 0;

        for(int i = 0; i < nums.length; i++){
            nextResult += nums[i];
            newList[i] = nextResult;
        }

        for (int num : newList) {
            System.out.println(num);
        }

    }
}
