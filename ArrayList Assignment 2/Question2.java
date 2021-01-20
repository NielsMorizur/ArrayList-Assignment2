import java.util.ArrayList;

class Question2 {
 public static void main (String[] args) {
        for (int i = 4; i <= 100; i+=2) {
           primeNums(i);
        }
    }

 public static void primeNums(int evenNum) {
        ArrayList<Integer> nums = new ArrayList<Integer>(100);
        for (int i = 2; i <= 100; i++) {
            nums.add(i);
        }
        for (int p = 0; p < nums.size(); p++) {
            for (int i = p+1; i < nums.size(); i++) {
                if (nums.get(i) % nums.get(p) == 0) {
                 nums.remove(i);
                 i--;
                }
            }
        }
        int j = 0;
        int primeTest = 0;
        while (j < nums.size() ){
            primeTest = evenNum - nums.get(j);
            if (nums.contains(primeTest)) break;
            j++;
        }
        System.out.println(evenNum + " = " + primeTest + " + " + nums.get(j));
    }
}