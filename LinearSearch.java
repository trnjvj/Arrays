import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinearSearch extends JApplet
                          implements ActionListener {
   JLabel enterLabel, resultLabel;
   JTextField enter, result;
   int a[];
   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      enterLabel = new JLabel( "Enter integer search key" );
      c.add( enterLabel );
      enter = new JTextField( 10 );
      enter.addActionListener( this );
      c.add( enter );
      resultLabel = new JLabel( "Result" );
      c.add( resultLabel );
      result = new JTextField( 20 );
      result.setEditable( false );
      c.add( result );
      a = new int[ 100 ];
      for ( int i = 0; i < a.length; i++ )
         a[ i ] = 2 * i;
   }
   public int linearSearch( int array[], int key ) 
   {   
      for ( int n = 0; n < a.length; n++ ) 
         if ( array[ n ] == key )
            return n;

      return -1;
   }
   public void actionPerformed( ActionEvent e )
   {
      String searchKey = e.getActionCommand();
      int element =
         linearSearch( a, Integer.parseInt( searchKey ) );
      if ( element != -1 )
         result.setText( "Found value in element " +
                         element );
      else
         result.setText( "Value not found" );
   }
}
