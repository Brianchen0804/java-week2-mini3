import java.util.Scanner;

public class TinyCompiler {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        
        keyin.next(); // int
        keyin.next(); // result
        keyin.next(); // =
        
        int first = keyin.nextInt(); // 第一個整數
        keyin.next(); // +
        
        int second = keyin.nextInt(); // 第二個整數
        keyin.next(); // +
        
        int third = keyin.nextInt(); // 第三個整數
        keyin.next(); // ;
        
        System.out.println("MOVI R1, " + first); // 把 7 放進 R1。
        System.out.println("MOVI R2, " + second); // 把 3 放進 R2
        System.out.println("ADD R0, R1, R2"); // R0 = R1 + R2
        System.out.println("MOVI R2, " + third); // 把第三個數字 1 放進 R2 //原本 R2 裡面的 3 就被覆蓋掉了
        System.out.println("ADD R0, R0, R2"); // R0 = R0 + R2
        System.out.println("STORE [0], R0");
    }
}
