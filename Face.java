import javax.swing.*;
import java.awt.*;

public class Face extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(50, 30, 150, 150);   // Face
        g.fillOval(90, 70, 15, 15);     // Eye
        g.fillOval(145, 70, 15, 15);    // Eye
        g.drawLine(125, 85, 115, 120);  // Nose
        g.drawArc(90, 110, 80, 40, 180, 180); // Mouth
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");
        f.add(new Face());
        f.setSize(280, 250);
        f.setVisible(true);
    }
}