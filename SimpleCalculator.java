import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] arge) {

        // เขียนโปรแกรมที่รับตัวเลขจำนวนเต็มจากผู้ใช้ 2 ตัว แล้วแสดงผลลัพธ์ของการบวก ลบ
        // คูณ และ หารของตัวเลขทั้งสอง
        Scanner keyboard = new Scanner(System.in);

        System.out.println("_________________SimpleCalculator______________________");

        System.out.print("ป้อนตัวเลขจำนวนเต็มที่ 1 : ");
        int number1 = keyboard.nextInt();

        System.out.print("ป้อนตัวเลขจำนวนเต็มที่ 2 : ");

        int number2 = keyboard.nextInt();

        System.out.println("__________________คำตอบ_____________________");
        // การบวก
        int plus = number1 + number2;
        System.out.println("ผลบวกของ " + number1 + " และ " + number2 + " = " + plus);

        // การลบ
        int delete = number1 - number2;
        System.out.println("ผลลบของ " + number1 + " และ " + number2 + " = " + delete);

        // การคูณ
        int multiply = number1 * number2;
        System.out.println("ผลคูณของ " + number1 + " และ " + number2 + " = " + multiply);

        // การหาร
        if (number2 != 0) {
            double divide = number1 / number2;
            System.out.println("ผลหารของ " + number1 + " และ " + number2 + " = " + divide);

        } else {
            System.out.println("ไม่สามารถหารด้วยศูนย์ได้");

        }

        System.out.println("################################################");

    }

}
