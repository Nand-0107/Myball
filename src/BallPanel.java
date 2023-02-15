import java.awt.*;
import java.util.*;
import javax.swing.*;
public class BallPanel extends JPanel{


    Ball noel = new Ball();
    ArrayList<Ball> bal = new ArrayList<>();

    public BallPanel(){



          for(int i =0; i<20; i++){
              bal.add(new Ball());
          }


        setBackground(new Color(24,255,82));
        setFocusable(true);

//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }

//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyCode());
//                int key = e.getKeyCode();
//                if(key == 68||key==39){
//                    noel.moveRight();
//                }
//                if(key == 65||key==37){
//                    noel.moveLeft();
//                }
//                if(key == 87||key==38){
//                    noel.moveUp();
//                }
//                if(key == 83||key==40){
//                    noel.moveDown();
//                }
//
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });


    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Ball ball: bal){
            ball.drawBall(g);
            ball.moveBall();
            ball.checkBoundry(this);
        }
            try{
                Thread.sleep(3);
            }
            catch(Exception e){
                System.out.println(e);
            }
        repaint();
    }



}
