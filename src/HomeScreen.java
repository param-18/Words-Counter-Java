import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {
    HomeScreen(){
        setVisible(true);
        setLayout(null);
        setSize(1980,1080);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //items on page
        JLabel title = new JLabel("Words Counter");
        JTextArea input = new JTextArea();
        input.setRows(7);
        input.setColumns(8);
        input.setLineWrap(true);
        input.setToolTipText("Enter Paragraph");
        JButton calBut = new JButton("Calculate");
        JLabel res = new JLabel();

        //performed logic
        calBut.addActionListener(e -> {
            if(e.getSource() == calBut){
                int words = input.getText().split(" ").length;
                System.out.println(words);
                res.setText(words+" words");
            }
        });

        //setting the bounds
        title.setBounds(10,20,100,50);
        input.setBounds(10,90,300,200);
        calBut.setBounds(60,310,100,40);
        res.setBounds(10,360,100,50);

        //adding to frame
        add(title);
        add(input);
        add(calBut);
        add(res);
    }
}
