import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

class Main {
 public static void main(String[] args) {
  JFrame f = new JFrame();
  JLabel I2, I3, I4;
  JTextArea text;
  JLabel I1;
  JButton submit, clear;
  text = new JTextArea("");
  submit = new JButton("SUBMIT");
  clear = new JButton("CLEAR");
  I1 = new JLabel("Enter the text: ");
  I2 = new JLabel("Character with Spaces: ");
  I3 = new JLabel("Character without Spaces: ");
  I4 = new JLabel("Word Count: ");
  Font txtFont = new Font(Font.SERIF, Font.PLAIN, 16);
  I1.setFont(txtFont);
  I2.setFont(txtFont);
  I3.setFont(txtFont);
  I4.setFont(txtFont);
  I1.setBounds(10, 25, 200, 30);
  text.setBounds(18, 60, 450, 300);
  I2.setBounds(10, 400, 200, 30);
  I3.setBounds(10, 450, 200, 30);
  I4.setBounds(10, 500, 200, 30);
  submit.setBounds(100, 550, 100, 30);
  clear.setBounds(250, 550, 100, 30);
  text.setLineWrap(true);
  // ...

  submit.addActionListener((ActionEvent e) -> {
   String str = text.getText();
   int len = str.length();
   int count = 0;
   for (int i = 0; i < len; i++) {
    if (str.charAt(i) != ' ') {
     count++;
    }
   }
   String str1 = text.getText();
   int len1 = str1.length();
   int count1 = 0;
   for (int i = 0; i < len1; i++) {
    if (str1.charAt(i) == ' ') {
     count1++;
    }
   }
   I2.setText("Character with Spaces: " + count);
   I3.setText("Character without Spaces: " + (count - count1));
   I4.setText("Word Count: " + (count1 + 1));
  });

  // ...
  f.add(I1);
  f.add(text);
  f.add(I2);
  f.add(I3);
  f.add(I4);
  f.add(submit);
  f.add(clear);
  f.setSize(500, 650);
  f.setLayout(null);
  f.setVisible(true);
 }
}
