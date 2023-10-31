import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class BinarySearch extends JApplet
                          implements ActionListener {
   JLabel enterLabel, resultLabel;
   JTextField enter, result;
   JTextArea output;
   int a[];
   String display = "";
   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      enterLabel = new JLabel( "Enter key" );
      c.add( enterLabel );
      enter = new JTextField( 5 );
      enter.addActionListener( this );
      c.add( enter );
      resultLabel = new JLabel( "Result" );
      c.add( resultLabel );
      result = new JTextField( 22 );
      result.setEditable( false );
      c.add( result );
      output = new JTextArea( 6, 60 );
      output.setFont(
         new Font( "Courier", Font.PLAIN, 12 ) );
      c.add( output );
      a = new int[ 15 ];
      for ( int i = 0; i < a.length; i++ ) 
         a[ i ] = 2 * i;
   }
   public void actionPerformed( ActionEvent e )
   {
      String searchKey = e.getActionCommand();
      display = "Portions of array searched\n";
      int element =
         binarySearch( a, Integer.parseInt( searchKey ) );
      output.setText( display );
      if ( element != -1 )
         result.setText(
            "Found value in element " + element );
      else
         result.setText( "Value not found" );
   }
   public int binarySearch( int array[], int key ) 
   {
      int low = 0;               
      int high = array.length - 1; 
      int middle;                 
      while ( low <= high ) {
         middle = ( low + high ) / 2;
         buildOutput( low, middle, high ); 

         if ( key == array[ middle ] ) 
            return middle;
         else if ( key < array[ middle ] )
            high = middle - 1;  
         else
            low = middle + 1;   
      }
      return -1;  
   }
   void buildOutput( int low, int mid, int high )
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      for ( int i = 0; i < a.length; i++ ) {
         if ( i < low || i > high )
            display += "    ";
         else if ( i == mid ) // mark middle element in output
            display += twoDigits.format( a[ i ] ) + "* ";
         else                                          
            display += twoDigits.format( a[ i ] ) + "  ";
      }

      display += "\n";
   }
}
