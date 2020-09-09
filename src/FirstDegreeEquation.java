import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Nghiệm là: %f!", solution);
        }
        else{
            if (b == 0){
                System.out.println("Vô nghiệm cmn rồi");
            }
            else{
                System.out.println("Vô cmn số nghiệm luôn");
            }
        }
    }
}
