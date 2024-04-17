import java.util.List;

public class Test {
    int count = 0;
    public int minimumRightShifts(List<Integer> nums) {
        
        for (int i = 0; i < nums.size(); i++) {
            
            if (nums.get(i) > nums.get((i + 1) % nums.size())) {
                count = count + 1;
            }
        }
        
        if (count == 1 && nums.get(nums.size() - 1) > nums.get(0)){
            System.out.println("Numbers are already sorted.");
            return 0;
        }
        else if (count == 1) {
            System.out.println("It can be sorted in just " + (nums.size() / 2) + " steps");
            return count;
        }
        else
            System.out.println("Impossible to sort");
            return -1;
    }
}
