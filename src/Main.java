import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Калькулятор для задания каты!");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите операцию:");
        String oper = in.nextLine();
        boolean rim = false;
        int sum;

        String[] str = oper.split(" ");
        String str1 = str[0];
        String str2 = str[1];
        String str3 = str[2];
        if(str.length>3){
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return;
        }


        if(isNumeric(str1) != isNumeric(str3)) {
            System.out.println("Калькулятор умеет работать только с целыми арабскими либо римскими числами одновременно.");
            return;
        }
        if(!isNumeric(str1)) {
            rim = true;
        }

        str1 = format.rim(str1);
        str3 = format.rim(str3);

        if(format.valid(str1)){
            System.out.println("Неверный формат");
            return;
        }
        if(format.valid(str3)){
            System.out.println("Неверный формат");
            return;
        }

        int a = Integer.parseInt(String.valueOf(str1));
        int b = Integer.parseInt(String.valueOf(str3));

        if (a>10 || b>10){
            System.out.println("Согласано тз, числа не должны превышать 10");
            return;
        }


        if(Objects.equals(str2, "+")){
            sum = a+b;
            if(rim){
                System.out.println(format.RomanNumber.toRoman(sum));
            }else {
                System.out.println(sum);
            }
        }else if (Objects.equals(str2, "-")) {
            sum = a-b;
            if(rim){
                if(sum<0){
                    System.out.println("Римские цифры не могут быть отрицательными");
                    return;
                }
                System.out.println(format.RomanNumber.toRoman(sum));
            }else {
                System.out.println(sum);
            }
        }else if (Objects.equals(str2, "*")) {
            sum = a*b;
            if(rim){
                System.out.println(format.RomanNumber.toRoman(sum));
            }else {
                System.out.println(sum);
            }
        }else if (Objects.equals(str2, "/")) {
            sum = a/b;
            if(rim){
                System.out.println(format.RomanNumber.toRoman(sum));
            }else {
                System.out.println(sum);
            }
        } else{
            System.out.println("Введен неизвестный оператор!");
            return;
        }


    }

    public static boolean isNumeric(String str) {
        int intValue;

        try {
            intValue = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}