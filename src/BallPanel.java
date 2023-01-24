import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class BallPanel extends JPanel{
//    int x = 100;
//    int y = 50;
//    int xSpeed = 1;
//    int ySpeed = 1;

    Ball noel;

    public BallPanel(){
      noel = new Ball();
        setBackground(new Color(215,12,82));
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

//        g.fillOval(x,y,20,20);
//        x= x + xSpeed;
//        y= y + ySpeed;
//
//        if(x >= getWidth()-20|| x <= 0){
//            xSpeed=xSpeed*-1;
//
//        }
//        if(y >= getHeight()-20|| y <= 0) {
//            ySpeed=ySpeed*-1;
//
//        }
        try{
            Thread.sleep(2);
        }
        catch(Exception e){
            System.out.println(e);
        }




            noel.drawBall(g);
//            noel.moveBall();


        repaint();
    }



}
