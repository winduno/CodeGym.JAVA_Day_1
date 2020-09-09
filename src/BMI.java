import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Cân nặng (kg nhé!!): ");
        weight = scanner.nextDouble();

        System.out.print("Chiều cao (met luôn nhé!!): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "BMI", "Phân tích\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gầy vãi!!");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Béo rồi!!");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo vãi chưởng!!");
    }
}
