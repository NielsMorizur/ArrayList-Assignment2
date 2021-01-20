import java.util.ArrayList;

class Question3 {
 public static void main(String[] args) {
     ArrayList<Integer> bigInt1 = new ArrayList<Integer>();
     ArrayList<Integer> bigInt2 = new ArrayList<Integer>();
     bigInt1.add(9);
     bigInt1.add(5);
     bigInt1.add(4);
     bigInt1.add(2);
     
     bigInt2.add(9);
     bigInt2.add(5);
     bigInt2.add(2);
     bigInt2.add(3);
     ArrayList<Integer> ans = add(bigInt1, bigInt2);
     System.out.print(ans);
 }
 
 public static ArrayList add(ArrayList<Integer> bigInt1, ArrayList<Integer> bigInt2) {
     ArrayList<Integer> ans = new ArrayList<Integer>();
     int digit1 = bigInt1.size()-1;
     int digit2 = bigInt2.size()-1;
     int carry = 0;
     while (digit1 >= 0 || digit2 >= 0) {
         int sum = 0;
         if (digit1 >= 0 && digit2 >= 0) {
             sum = bigInt1.get(digit1) + bigInt2.get(digit2) + carry;
         }else if (digit1 >= 0) {
             sum = bigInt1.get(digit1) + carry;
         }else if (digit2 >= 0) {
             sum = bigInt2.get(digit2) + carry;
         }
         
         if (sum >= 10) {
             carry = 1;
             sum-=10;
         }else {
             carry = 0;
         }
         
         digit1--;
         digit2--;
         ans.add(0,sum);
     }
     if (carry > 0) ans.add(0,carry);
     return ans;
 }
}