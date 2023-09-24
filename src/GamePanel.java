import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
  static final int SCREEN_WIDTH=600;
 static final int SCREEN_HEIGHT=600;
 static final int UNIT_SIZE=25;
 static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
 static final int DELAY=75;
 final int x[]=new int[GAME_UNITS];  // I think this is lenghth of our snake and max it can be lemght of our GameBoard
 final int y[]=new int[GAME_UNITS];
int bodyparts=6;
int ApplesEaten=0;
int AppleX;
int AppleY;
char directioninwhichSnakeisMoving='R';  // and by defualt it is moving Right
 boolean running=false;
 Timer timer;
 Random random;
    GamePanel(){
random=new Random();
this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
this.setBackground(Color.BLACK);
this.setFocusable(true);
this.addKeyListener(new MyKeyAdapter());
     StartGame();
    }
   public void StartGame(){
newApple();
running=true;
timer=new Timer(DELAY,this);
timer.start();
    }

    public void PaintComponet(Graphics g){

    }
    public void Draw(Graphics g){

    }
 public void newApple(){

 }
    public void Move(){

    }
    public void CheckApple(){

    }
    public void CheckCollision(){

    }
    public void GameOver(Graphics g){

    }
    public void ActionPerformed(ActionEvent e){

    }
   public class MyKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
     super.keyPressed(e);
    }
   }

    @Override
public void actionPerformed(ActionEvent a){

}
}
