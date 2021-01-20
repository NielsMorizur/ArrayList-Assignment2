import java.util.ArrayList;

class Question1 {
    public static void main (String[] args) {
        int n = 100;
        primeNums(n);
    }

    public static void primeNums(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>(n);
        for (int i = 2; i <= n; i++) {
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
        System.out.print(nums);
    }
}