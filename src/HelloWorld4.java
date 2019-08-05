/*1. 编写一段java程序，将一个整形数组的偶数和奇数进行分离，前面为偶数，后面为奇数；
例如：[12,3,4,2,1,1,2,323,23,44] -> [12,4,2,2,44,3,1,1,323,23]
*/

import java.util.Arrays;

public class HelloWorld4 {

    public static void main(String[] args) {
        int[] arrays = { 12,3,4,2,1,1,2,323,23,44 };

        int last_number = arrays.length - 1;

        for (int first_number = 0; first_number < last_number; first_number++) {

            int last = arrays[last_number];
            int first = arrays[first_number];
            if (last % 2 == 0 && first % 2 != 0) {
                arrays[last_number] = first;
                arrays[first_number] = last;
                last_number--;
            } else if (first % 2 == 0 && last % 2 == 0) {
                last_number--;
                first_number--;
            } else if (last % 2 != 0 && first % 2 == 0) {
                last_number--;
            } else {
                
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
