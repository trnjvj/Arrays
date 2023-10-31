import java.awt.*;
import javax.swing.*;

public class WhatDoesThisDo2 extends JApplet {
   public void init()
   {
      int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      JTextArea outputArea = new JTextArea();
      someFunction( a, 0, outputArea );
      Container c = getContentPane();
      c.add( outputArea );
   }
   public void someFunction( int b[], int x, JTextArea out )
   {
      if ( x < b.length ) {
         someFunction( b, x + 1, out );
         out.append( b[ x ] + "  " );
      }
   }
}
