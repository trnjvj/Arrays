import java.awt.*;
import javax.swing.*;

public class WhatDoesThisDo extends JApplet {
   int result;
   public void init()
   {
      int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      result = whatIsThis( a, a.length );
      Container c = getContentPane();
      JTextArea output = new JTextArea();
      output.setText( "Result is: " + result );
      c.add( output );
   }
   public int whatIsThis( int b[], int size )
   {
      if ( size == 1 )
         return b[ 0 ];
      else
         return b[ size - 1 ] + whatIsThis( b, size - 1 );
   }
}
