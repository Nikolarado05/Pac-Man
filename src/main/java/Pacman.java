
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        Model model = new Model();
        model.setLevel(2);
        add(model);
    }

    public static void main(String[] args) {
        Pacman pac = new Pacman();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380,420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
    }
}