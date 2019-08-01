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

public class HelloWorld3 {



    public static String[] strs = new String[3];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < strs.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个单词:");
            String str = input.nextLine();
            strs[i] = str;
        }


        show(getMaxValuesAndIndexes(getLengths()));

    }

    public static int[] getLengths(){
        int[] index = new int[3];
        for(int i = 0;i<strs.length;i++){
            index[i]=strs[i].length();
        }
        return index;
    }
    public static String[] getMaxValuesAndIndexes(int[] arr) {
        Map<String, Object> map = new HashMap<>();
        int max = arr[0];
        map.put("indexes", 0);
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            if (max == temp) {
                map.put("indexes", map.get("indexes") + "," + i);
            } else if (max < temp) {
                max = temp;
                map.put("indexes", i);
            }
        }
        String[] indexesArray = map.get("indexes").toString().split(",");
        return indexesArray;
    }

    public static void show(String[] args){
        System.out.println("Result:");
        for (int i = 0; i <args.length ; i++) {

            System.out.println(strs[Integer.parseInt(args[i])]);
        }

    }
}


/*
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
*/
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


