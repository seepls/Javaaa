import javax.swing.*;

public class Hello extends JFrame {
    public Hello() {
        super("a JFrame view ");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(new JLabel("First JFrame window !"));
        this.pack();
        this.setVisible(true);
    }

    public static void main(final String[] args) {
        new Hello();
    }
}
