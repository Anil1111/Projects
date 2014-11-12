/* **Prime Factorization** - Have the user enter a number and find all Prime Factors (if there are any) and display them. */
/* PrimeGUI.java */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PrimeGUI extends JFrame
{
   private JButton getButton;
   private JTextField timeField;
   
   public PrimeGUI()
   {
      // Call to super class constructor
      super("Prime Factorization");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      // Button to fire event and Textfield to retrieve number
      getButton = new JButton("Go");
      timeField = new JTextField(20);
      // Add components to the panel
      add(timeField);
      add(getButton);
      // Register action listener
      getButton.addActionListener(new GetButtonListener());
      // Pack and show
      pack();
      setVisible(true);
   } // end constructor
   private class GetButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //Execute Prime
         
      }// end action preformed
   } // end inner class
} // end class