
package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class multiplactionTable extends JFrame
{
    multiplactionTable()
    {
        //Font
        Font font = new Font("Cambria",Font.BOLD,18);
        Font fontArea = new Font("Cambria",Font.BOLD,16);
          Border border = BorderFactory.createLineBorder(Color.gray, 2);
        //Making Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,400,900);
        this.setResizable(false);
        
        // Making COntainer
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        
        //JLabel and set Image
        ImageIcon icon = new ImageIcon(getClass().getResource("kid.jpg"));
        JLabel label = new JLabel(icon);
        label.setBounds(0,0,400,280);
        c.add(label);
        
        //JLabel
        JLabel labelMassege = new JLabel("Please Enter Table Number:");
        labelMassege.setBounds(5,283,300,20);
        labelMassege.setFont(fontArea);
        c.add(labelMassege);
        //JTextField
        JTextField field = new JTextField();
        field.setBounds(24,310,180,30);
        field.setBackground(Color.LIGHT_GRAY);
        field.setFont(font);
        c.add(field);
        
        //Making Clear Button 
        Cursor mouse = new Cursor(Cursor.HAND_CURSOR);
        JButton goButton = new JButton("GO");
        goButton.setBounds(220,310,60,30);
        goButton.setBackground(Color.GREEN);
        goButton.setCursor(mouse);
        goButton.setFont(font);
        c.add(goButton);
        
        //Making Clear Button 
        JButton button = new JButton("Clear");
        button.setBounds(290,310,80,30);
        button.setCursor(mouse);
        button.setFont(font);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setBorder(border);
        c.add(button);
        
        //ActionListener For Clear Button
        button.addActionListener(new ActionListener(){       
         public void actionPerformed(ActionEvent e)
         {
             field.setText("");
         }
        });     
        
        //TestArea
         JTextArea area = new JTextArea();
         area.setBounds(55,360,280,360);
         area.setFont(fontArea);
         c.add(area);
         
        goButton.addActionListener(new ActionListener()
        {       
         public void actionPerformed(ActionEvent e)
         {
             int Number = Integer.parseInt(field.getText());
             
             for(int i=1; i<=10; i++)
             {
                 int Result = Number*i;
                 String N = String.valueOf(Number);
                 String I = String.valueOf(i);
                 String R = String.valueOf(Result);
                 
                 area.append("  "+I+" X "+N+" = "+R+"\n");
             }
         }
        });   
        
        JButton buttonArea = new JButton("ClearArea");
        buttonArea.setBounds(210,730,118,30);
        buttonArea.setCursor(mouse);
        buttonArea.setFont(font);
         buttonArea.setBackground(Color.RED);
        buttonArea.setForeground(Color.WHITE);
        c.add(buttonArea);
        
         buttonArea.addActionListener(new ActionListener(){       
         public void actionPerformed(ActionEvent e)
         {
             area.setText("");
         }
        }); 
         
    }
    public static void main(String[] args) 
    {
         multiplactionTable frame = new  multiplactionTable();
         frame.setVisible(true);
    }
}
