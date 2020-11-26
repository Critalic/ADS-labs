
package Body;


public class DataProcessor {
    private BubbleMethod bubble;
    private InsertionMethod insert;
    private Printer printer;
    private SelectionMethod selection;

    public DataProcessor(BubbleMethod bubble, InsertionMethod insert, Printer printer, SelectionMethod selection) {
        this.bubble = bubble;
        this.insert = insert;
        this.printer = printer;
        this.selection = selection;
    }

    
    
    public void arrayManager (int[] array) {
        int [] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, (array.length-1));
        
        int[] array3 = new int[array.length];
        System.arraycopy(array, 0, array3, 0, (array.length-1));
        
        
        printer.print(bubble.sort(array), insert.sort(array2), selection.sort(array3));
    }
    
    
    

}
