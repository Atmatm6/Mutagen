import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form1 {
    private JRadioButton Radio1;
    private JRadioButton doNot;
    private JTextPane TypeHereToPrint;
    private JButton printButton;

    public Form1() {
        printButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
}
