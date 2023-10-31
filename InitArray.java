import java.awt.Container;
import javax.swing.*;

public class InitArray extends JApplet {
   JTextArea outputArea;
   public void init()
   {
      outputArea = new JTextArea();
      Container c = getContentPane();
      c.add( outputArea );
      int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };        
      int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 
      outputArea.setText( "Values in array1 by row are\n" );
      buildOutput( array1 );  
      outputArea.append( "\nValues in array2 by row are\n" );
      buildOutput( array2 );
   }
   public void buildOutput( int a[][] )
   {
      for ( int i = 0; i < a.length; i++ ) {
         for ( int j = 0; j < a[ i ].length; j++ )  
            outputArea.append( a[ i ][ j ] + "  " );
         outputArea.append( "\n" );
      }
   }
}
