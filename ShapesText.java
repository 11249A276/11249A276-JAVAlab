import javax.swing.*;
import java.awt.*;

public class ShapesText extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(30, 30, 120, 60);

        g.setColor(Color.BLUE);
        g.fillOval(180, 30, 100, 60);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Java Applets are fun!", 50, 140);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes Text");
        f.add(new ShapesText());
        f.setSize(350, 220);
        f.setVisible(true);
    }
}
