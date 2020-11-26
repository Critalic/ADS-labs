
package Body;


public class Printer {
    public void print(double timeBubble, double timeInsert, double timeSelection) {
        System.out.print("Тривалість сортування через Bubble: ");
        System.out.println(timeBubble + " наносекунд, або " + (timeBubble/1000000.0) + " мілісекунд"); 
        
        
        System.out.print("Тривалість сортування через Insertion: ");
        System.out.println(timeInsert + " наносекунд, або " + (timeInsert/1000000.0) + " мілісекунд");
        
        
        System.out.print("Тривалість сортування через Selection: ");
        System.out.println(timeSelection + " наносекунд, або " + (timeSelection/1000000.0) + " мілісекунд");
        System.out.println(" ");
    }
}
