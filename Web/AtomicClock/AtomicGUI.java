/* AtomicGUI.java */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
//import java.awt.*;
//import java.awt.event.*;

public class AtomicGUI extends JFrame
{
   private JButton getButton;
   private JTextField timeField;
   
   public AtomicGUI()
   {
      // Call to super class constructor
      super("Atomic NTP Retriever");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      // Button to fire event and Textfield to display retrieve time
      getButton = new JButton("Get Time");
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
            // Retrieve the time and display it in the text field.
         timeField.setText(GetAtomicNTP.retrieveTime());
      }// end action preformed
   } // end inner class
} // end class