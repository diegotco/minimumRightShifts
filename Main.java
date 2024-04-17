import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Integer> nums = Arrays.asList(2,1,4);
        Test test = new Test();
        int answer = test.minimumRightShifts(nums);
        System.out.println("The answer is: " + answer);
        
    }
}
