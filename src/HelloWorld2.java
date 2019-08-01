
    /*2. 编写一段java程序，计算一段字符串中字母，空格，数字，其他字符分别的数量：

    例如：
    字符串 :  "Cop tasers old woman for fleeing from an $80 ticket"
    输出：
    letter: 39
    space: 9
    number: 2
    other: 1
*/
import java.util.*;

public class HelloWorld2{

    public static void main(String[] args) {

            int letter = 0;

            int space = 0;

            int number = 0;

            int other = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入一组字符串：");

            String count = scanner.nextLine();

            char[] ch = count.toCharArray();

            for(int i = 0;i < ch.length;i++){

                if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z'){

                    letter++;

                }else if((' ' == ch[i])){

                    space++;

                }else if(ch[i] >= '0' && ch[i] <='9'){

                    number++;

                }else{

                    other++;

                }

            }

            System.out.println("letter:" +letter);

            System.out.println("space:" +space);

            System.out.println("number:" +number);

            System.out.println("other:" +other);

        }

    }

