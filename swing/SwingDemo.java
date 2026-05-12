import javax.swing.*;

public class SwingDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Example");

        JPanel panel = new JPanel();

        JLabel label =
            new JLabel("Name:");

        JTextField tf =
            new JTextField(15);

        JButton btn =
            new JButton("Submit");

        panel.add(label);
        panel.add(tf);
        panel.add(btn);

        frame.add(panel);

        frame.setSize(400, 200);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}