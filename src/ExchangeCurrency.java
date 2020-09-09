import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        int rate = 230000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD: ");
        String input = scanner.nextLine();

        if (isStringInteger(input)){
            System.out.println("VND: " + Integer.parseInt(input) * 23000);
        }
        else{
            System.out.println("Thôi nghỉ đi, nhập thế ai mà tính.");
        }

    }
    public static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
