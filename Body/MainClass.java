
package Body;


public class MainClass {
    public static void main(String[] args) {
        int[] arraySorted100 = new int [100];
        for(int i=0; i<arraySorted100.length; i++) {
            arraySorted100[i] = i;
        }
        
        int[] arraySorted1000 = new int [1000];
        for(int i=0; i<arraySorted1000.length; i++) {
            arraySorted1000[i] = i;
        }
        
        int[] arraySorted10000 = new int [10000];
        for(int i=0; i<arraySorted10000.length; i++) {
            arraySorted10000[i] = i;
        }
        
        int [] arrayUnSorted100 = new int[100];
        for(int i=0; i<arrayUnSorted100.length; i++) {
            arrayUnSorted100[i] = (int) (Math.random()*100);
        }
        int [] arrayUnSorted1000 = new int[1000];
        for(int i=0; i<arrayUnSorted1000.length; i++) {
            arrayUnSorted1000[i] = (int) (Math.random()*100);
        }
        int [] arrayUnSorted10000 = new int[10000];
        for(int i=0; i<arrayUnSorted10000.length; i++) {
            arrayUnSorted10000[i] = (int) (Math.random()*100);
        }
        
        DataProcessor process = new DataProcessor(new BubbleMethod(), new InsertionMethod(), new Printer(), new SelectionMethod());
        System.out.println("Впорядкований масив з " + arraySorted100.length);
        process.arrayManager(arraySorted100);
        System.out.println("Впорядкований масив з " + arraySorted1000.length);
        process.arrayManager(arraySorted1000);
        System.out.println("Впорядкований масив з " + arraySorted10000.length);
        process.arrayManager(arraySorted10000);
        
        System.out.println("Не впорядкований масив з " + arrayUnSorted100.length);
        process.arrayManager(arrayUnSorted100);
        System.out.println("Не впорядкований масив з " + arrayUnSorted1000.length);
        process.arrayManager(arrayUnSorted1000); 
        System.out.println("Не впорядкований масив з " + arrayUnSorted10000.length);
        process.arrayManager(arrayUnSorted10000);

    }
}
