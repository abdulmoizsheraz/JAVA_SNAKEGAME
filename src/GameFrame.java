import javax.swing.*;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame  {
    GameFrame(){
this.add(new GamePanel());
this.setTitle("Snake");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.pack();
this.setVisible(true);
this.setLocationRelativeTo(null);
    }
}
