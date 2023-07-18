
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;
//extends to JFrame
public class MyFirstFrame extends JFrame{
    // Create a constructor 
      public MyFirstFrame()
      {
      setTitle("My First Gui");
      setSize(200,250);
      setDefaultLookAndFeelDecorated(true);
      setResizable(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setForeground(Color.BLUE);
      setVisible(true);
      }
}
