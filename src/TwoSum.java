import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,9,11};
        int target = 9;
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; nums.length - 1; i++ ){
            int result = target - nums[i];
            if(hash.containsKey(result)){
                return;
            }
            hash.put(i,result);
        }


    }
}
