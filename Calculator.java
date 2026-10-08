import java.awt.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setLayout(new GridLayout(4, 4, 5, 5));

        String[] b = {"7","8","9","+",
                      "4","5","6","-",
                      "1","2","3","*",
                      "0","=","C","/"};

        for (String s : b)
            f.add(new JButton(s));

        f.setSize(300, 300);
        f.setVisible(true);
    }
}