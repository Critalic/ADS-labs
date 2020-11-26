/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Body;

/**
 *
 * @author START
 */
public class BubbleMethod {
    public double sort(int[] array) {
        double start = System.nanoTime();
        for(int i =1; i<array.length; i++) {
            for( int b = (array.length -1); b>= i; b-- ) {   
                if(array[b-1] >array[b]) {
                    int t  = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
                          
            } 
        }
        double finish = System.nanoTime();
        double result = (finish-start);
        return result;
    }
}
