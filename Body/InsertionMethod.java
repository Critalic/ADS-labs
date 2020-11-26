
package Body;


public class InsertionMethod {
    public double sort(int[] arr) {
         double start = System.nanoTime(); 
        for (int i = 1; i < arr.length; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        double finish = System.nanoTime();
        double result = (finish-start);
        return result;
    }
}
