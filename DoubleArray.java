import java.awt.*;
import javax.swing.*;

public class DoubleArray extends JApplet {
   int grades[][] = { { 77, 68, 86, 73 }, 
                      { 96, 87, 89, 81 },
                      { 70, 90, 86, 81 } };
   int students, exams;
   String output;
   JTextArea outputArea;
   public void init()
   {
      students = grades.length;
      exams = grades[ 0 ].length;
      outputArea = new JTextArea();
      Container c = getContentPane();
      c.add( outputArea );
      output = "The array is:\n";
      buildString();
      output += "\n\nLowest grade: " + minimum() +
                "\nHighest grade: " + maximum() + "\n";
      for ( int i = 0; i < students; i++ ) 
         output += "\nAverage for student " + i + " is " +
                   average( grades[ i ] );
      outputArea.setFont(
         new Font( "Courier", Font.PLAIN, 12 ) );
      outputArea.setText( output );
   }
   public int minimum()
   { 
      int lowGrade = 100;
      for ( int i = 0; i < students; i++ ) 
         for ( int j = 0; j < exams; j++ ) 
            if ( grades[ i ][ j ] < lowGrade )
               lowGrade = grades[ i ][ j ];

      return lowGrade;
   }
   public int maximum()
   { 
      int highGrade = 0;
      for ( int i = 0; i < students; i++ ) 
         for ( int j = 0; j < exams; j++ ) 
            if ( grades[ i ][ j ] > highGrade )
               highGrade = grades[ i ][ j ];

      return highGrade;
   }
   public double average( int setOfGrades[] )
   {
      int total = 0;
      for ( int i = 0; i < setOfGrades.length; i++ )
         total += setOfGrades[ i ];
      return ( double ) total / setOfGrades.length;
   }
   public void buildString()
   {
      output += "           ";  
      for ( int i = 0; i < exams; i++ ) 
         output += "[" + i + "]  ";
      for ( int i = 0; i < students; i++ ) {
         output += "\ngrades[" + i + "]   ";
         for ( int j = 0; j < exams; j++ ) 
            output += grades[ i ][ j ] + "   ";
      }
   }
}
