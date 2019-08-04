/*1. 编写一段java程序，将一个整形数组的偶数和奇数进行分离，前面为偶数，后面为奇数；
例如：[12,3,4,2,1,1,2,323,23,44] -> [12,4,2,2,44,3,1,1,323,23]
*/

import java.util.Arrays;

public class HelloWorld4 {

    public static void main(String[] args) {
        int[] arrays = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int last_index = arrays.length - 1;

        for (int first_index = 0; first_index < last_index; first_index++) {

            int last = arrays[last_index];
            int first = arrays[first_index];
            if (last % 2 == 0 && first % 2 != 0) {
                arrays[last_index] = first;
                arrays[first_index] = last;
                last_index--;
            } else if (first % 2 == 0 && last % 2 == 0) {
                last_index--;
                first_index--;
            } else if (last % 2 != 0 && first % 2 == 0) {
                last_index--;
            } else {
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}