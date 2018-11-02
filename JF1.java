import javax.swing.*;

public class Hello extends JFrame {
    public Hello() {
        super("hello");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(new JLabel("Hello, world!"));
        this.pack();
        this.setVisible(true);
    }

    public static void main(final String[] args) {
        new Hello();
    }
}
