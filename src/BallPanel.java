import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;
public class BallPanel extends JPanel{


    Ball noel = new Ball();


    public BallPanel(){





        setBackground(new Color(24,255,82));
        setFocusable(true);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int key = e.getKeyCode();
                if(key == 68||key==39){
                    noel.moveRight();
                }
                if(key == 65||key==37){
                    noel.moveLeft();
                }
                if(key == 87||key==38){
                    noel.moveUp();
                }
                if(key == 83||key==40){
                    noel.moveDown();
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

            noel.drawBall(g);

            noel.checkBoundry(this);

            try{
                Thread.sleep(20);
            }
            catch(Exception e){
                System.out.println(e);
            }
        repaint();
    }



}
