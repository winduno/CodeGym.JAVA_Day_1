import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số 3 chữ số thôi nhé!!");
        String input = scanner.nextLine();
        int number = 0;
        int hundreds, tens, units;
        String output = "";

        if (isStringInteger(input)){
            number = Integer.parseInt(input);
        }
        else {
            System.out.println("Điên à?? Bảo nhập số cơ mà!!!");
        }

        hundreds = number / 100;
        number = number % 100;

        tens = number / 10;
        number = number % 10;

        output += Hundreds(hundreds);
        if (tens == 1){
            output += Teens(number);
        }
        else{
            output += Tens(tens) + Unit(number);
        }

        System.out.println(output);

    }

    public static String Unit(int number){
        String result = "";
        switch (number){
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                result = "";
        }
        return result;
    }

    public static String Tens(int number){
        String result = "";
        switch (number){
            case 2:
                result = "twenty ";
                break;
            case 3:
                result = "thirty ";
                break;
            case 4:
                result = "fourty ";
                break;
            case 5:
                result = "fifty ";
                break;
            case 6:
                result = "sixty ";
                break;
            case 7:
                result = "seventy ";
                break;
            case 8:
                result = "eighty ";
                break;
            case 9:
                result = "ninety ";
                break;
            default:
                result = "";
        }
        return result;
    }

    public static String Hundreds(int number){
        String result = "";
        switch (number){
            case 1:
                result = "One hundred and ";
                break;
            case 2:
                result = "Two hundred and ";
                break;
            case 3:
                result = "Three hundred and ";
                break;
            case 4:
                result = "Four hundred and ";
                break;
            case 5:
                result = "Five hundred and ";
                break;
            case 6:
                result = "Six hundred and ";
                break;
            case 7:
                result = "Seven hundred and ";
                break;
            case 8:
                result = "Eight hundred and ";
                break;
            case 9:
                result = "Nine hundred and ";
                break;
            default:
                result = "";
        }
        return result;
    }

    public static String Teens(int number){
        String result = "";
        switch (number){
            case 1:
                result = "eleven";
                break;
            case 2:
                result = "twelves";
                break;
            case 3:
                result = "thirteen";
                break;
            case 4:
                result = "fourteen";
                break;
            case 5:
                result = "fifteen";
                break;
            case 6:
                result = "sixteen";
                break;
            case 7:
                result = "seventeen";
                break;
            case 8:
                result = "eighteen";
                break;
            case 9:
                result = "nineteen";
                break;
            default:
                result = "ten";
        }
        return result;
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
