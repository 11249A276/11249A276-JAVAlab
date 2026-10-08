import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(20, 20, 100, 60);
        g.drawOval(150, 20, 70, 70);
        g.drawLine(20, 120, 150, 120);

        int x[] = {250, 200, 300};
        int y[] = {120, 180, 180};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");
        f.add(new Shapes());
        f.setSize(400, 250);
        f.setVisible(true);
    }
}