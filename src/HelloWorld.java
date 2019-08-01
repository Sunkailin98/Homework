/*
1、写一段java程序，允许输入两个数字，然后逐行输出两个数字的加、减、乘、除、取余的结果：
例如: 第一个输入的数字: 125
第二个输入的数字: 24
 期望的结果:
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5.2083333333
 125 mod 24 = 5
 */

import java.util.*;


public class HelloWorld{

    public static void main(String[] args) {
        int number1;

        int number2;

        HelloWorld hello = new HelloWorld();

        hello.count();

    }

    public void count(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("第一个输入的数字：");

        int number1 = scanner.nextInt();

        System.out.println("第二个输入的数字：");

        int number2 = scanner.nextInt();

        System.out.println("期望的结果：");

        System.out.println("两者之和："+(number1+number2));

        System.out.println("两者之差："+(number1-number2));

        System.out.println("两者之积："+(number1*number2));

        System.out.println("两者之商："+(number1/number2));

        System.out.println("两者取余："+(number1%number2));
    }

}

