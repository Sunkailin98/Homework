/*
3. 编写一段java程序，输出一组字符串中，最长的字符串：

        例如：
        {
        "cat",
        "dog",
        "red",
        "is",
        "am"
        }
        Result: "cat", "dog", "red"
*/

import java.util.*;
import java.lang.String ;

public class HelloWorld3 {
    public static void main(String[] args) {

        String[] strs = new String[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < strs.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个单词:");
            String str = input.next();
            strs[i] = str;

        }
        int index = 0;
        for (int i = 1; i <= strs.length - 1; i++) {
            if (strs[i].length() > strs[index].length()) {
                index = i;
            }
        }
        System.out.println(strs[index]);


    }

}
    /*
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一组字符串:");

        String count = scanner.nextLine();

        char [] ch = count.toCharArray();

        char max = ch[0];

        for(int i = 0;i < ch.length;i++){

            if(ch[i] <= max){

                max = max;

            }else{

                max = ch[i];

            }

        }

        System.out.println("最长的字符串是:" +max);
*/


