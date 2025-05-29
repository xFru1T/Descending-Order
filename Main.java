import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number: ");
        int a = scanner.nextInt();
        if (a<0) {System.out.print("Number is negative");}
        else {
            char[] digits = String.valueOf(a).toCharArray();
            Arrays.sort(digits);
            for (int i = digits.length - 1; i >= 0; i--)
                System.out.print(digits[i]);
        }
    }
}
