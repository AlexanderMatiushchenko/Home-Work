import java.util.SimpleTimeZone;

public class Punkt1 {
    public static void main(String[] args) {
        zero ();
        first();
        second();
        third ();
        fourth();
        fifth();
    }

    public static void zero() {

        int number = 333;
        int result = (3 * 16 * 16) + (3 * 16) + (3 * 1);
        System.out.println("Переводим 333 из шестнадцатиричной в десятичную");
        System.out.println(result);
    }

    public static void first() {
        System.out.println("Раскладываем число 200345 на разряды в десятичной системе.");
        System.out.println("Разряды считаем с права на лево начиная с нуля:");
        System.out.println("2 это 5 разряд");
        System.out.println("0 это 4 разряд");
        System.out.println("0 это 3 разряд");
        System.out.println("3 это 2 разряд");
        System.out.println("4 это 1 разряд");
        System.out.println("5 это 0 разряд");
}
    public static void second(){
        System.out.println( "Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).");
        int number = 637;
        int number1  = 16;
        int result1 = number % number1;
        System.out.println(result1);
        System.out.println("В шестнадцетиричной системе цыфра 13");
        System.out.println("будет соответствовать букве D латинского алфавита.");
        int result2 = number / number1;
        int result3 = result2 % number1;
        int result4 = result2 / number1;
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("Складываем числа с права на лево:");
        System.out.println("27D");
        System.out.println("Переводим число 637 из");
        System.out.println("шестнадцетиричной в десятичную");
        int number2 = 16 * 16;
        int number3 = 16;
        int number4 = 1;
        int result5 = (6 * number2) + (3 * number3) + (7 * number4);
        System.out.println ("Результат:");
        System.out.println (result5);
    }
    public static void third(){
        System.out.println("Перевести 637 из десятичной в двоичную.");
        int number = 637;
        int number1 = 2;
        int result = 637 % 2;
        int result1 = 637 / 2 % 2;
        int result2 = ((637 / 2) /2) % 2;
        int result3 = (((637 / 2) /2) / 2) % 2;
        int result4 = ((((637 / 2) /2) / 2) /2) % 2;
        int result5 = (((((637 / 2) /2) / 2) /2) /2) % 2;
        int result6 = ((((((637 / 2) /2) / 2) /2) /2) / 2) % 2;
        int result7 = (((((((637 / 2) /2) / 2) /2) /2) / 2) /2) % 2;
        int result8 = ((((((((637 / 2) /2) / 2) /2) /2) / 2) /2) / 2) % 2;
        int result9 = (((((((((637 / 2) /2) / 2) /2) /2) / 2) /2) / 2) / 2) % 2;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println("Складываем справа на лево и получается:");
        System.out.println("1001111101");
    }
    public static void fourth (){
        System.out.println("11100111 перевести в десятичную.");
        int number = 11100111;
        int number2In7 = 2*2*2*2*2*2*2;
        int number3In6 = 2*2*2*2*2*2;
        int number4In5 = 2*2*2*2*2;
        int number5In4 = 2*2*2*2;
        int number6In3 = 2*2*2;
        int number7In2 = 2*2;
        int number8In1 = 2;
        int number9In0 = 1;
        int result = (1 * number2In7) + (1 * number3In6) + (1 * number4In5) +
                + (0 * number5In4) + (0 * number6In3) + (1 * number7In2) +
                + (1 * number8In1) + (1 * number9In0);
        System.out.println(result);
    }
        public static void fifth (){
        System.out.println("Перевести 637 из десятичной в троичную.");
        int number = 637;
        int number1 = 3;
        int result = (637 / 3);
        int result1 =  637 % 3;
        int result2 = (637 / 3) / 3;
        int result3 = result % 3;
        int result4 = result2 / 3;
        int result5 = result2 % 3;
        int result6 = result4 / 3;
        int result7 = result4 % 3;
        int result8 = result6 / 3;
        int result9 = result6 % 3;
        int result10 = result8 / 3;
        int result11 = result8 % 3;
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result5);
        System.out.println(result7);
        System.out.println(result9);
        System.out.println(result11);
        System.out.println("Выходит число: 212121");
        }
}
