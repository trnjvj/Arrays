import java.awt.*;
import javax.swing.*;

public class BubbleSort extends JApplet {
   public void init()
   {
      JTextArea outputArea = new JTextArea();
      Container c = getContentPane();
      c.add( outputArea );
      int a[] = { 2, 6, 4, 8, 10, 12, 89, 68, 45, 37 };
      String output = "Data items in original order\n";
      for ( int i = 0; i < a.length; i++ ) 
         output += "   " + a[ i ];	
      bubbleSort( a );
      output += "\n\nData items in ascending order\n";
      for ( int i = 0; i < a.length; i++ ) 
         output += "   " + a[ i ];
      outputArea.setText( output );
   }
   public void bubbleSort( int b[] )
   {   
      for ( int pass = 1; pass < b.length; pass++ ) 
         for ( int i = 0; i < b.length - 1; i++ ) 
            if ( b[ i ] > b[ i + 1 ] )  
               swap( b, i, i + 1 ); 
   }
   public void swap( int c[], int first, int second )
   {
      int hold; 
      hold = c[ first ];         
      c[ first ] = c[ second ];  
      c[ second ] = hold;
   }
}
