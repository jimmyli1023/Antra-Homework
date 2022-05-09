import java.util.Arrays;

public class MergeTwoArray {
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                k++;
                i++;
            } else {
                result[k] = array2[j];
            }
        }
        while (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{6,7,8,9,10};
        int[] result = mergeArray(array1, array2);
        System.out.println(Arrays.toString(result));

    }
}
