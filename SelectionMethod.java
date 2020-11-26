
package Body;


public class SelectionMethod {
    public static double sort(int[] array) {
        double start = System.nanoTime();
            int inputLength = array.length;
            for (int i = 0; i < inputLength - 1; i++) {
                int min = i;
                for (int j = i + 1; j < inputLength; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        double finish = System.nanoTime();
        double result = (finish-start);
        return result;
    }
}
