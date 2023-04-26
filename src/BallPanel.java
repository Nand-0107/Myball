import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import javax.swing.*;
public class BallPanel extends JPanel{
//    int x = 100;
//    int y = 50;
//    int xSpeed = 1;
//    int ySpeed = 1;


    ArrayList<Ball> bal = new ArrayList<Ball>();

    public BallPanel(){

        bal.add(new Ball());

        JButton jon = new JButton("Add BALL");
        this.add(jon);
        jon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == jon){
                    bal.add(new Ball());
                }


            }





        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                for(int i = 0; i < bal.size(); i++){

                    if ( ((e.getX()) > (bal.get(i)).getXPos() && (e.getX()) < ((bal.get(i)).getXPos()+(bal.get(i)).siz()))
                            &&
                            ((e.getY()) > (bal.get(i)).getYPos() && (e.getY()) < ((bal.get(i)).getYPos()+(bal.get(i)).siz()))
                    ){
                        bal.remove(i);
                        break;
                    }




                }
                System.out.println(e.getPoint());
            }
        });







        setBackground(new Color((int)(Math.random()*250+1),(int)(Math.random()*250+1),(int)(Math.random()*250+1)));
        setFocusable(true);








//        addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
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


        for(int i = 0; i < bal.size();i++){
            (bal.get(i)).drawBall(g);
            (bal.get(i)).moveBall();
            (bal.get(i)).checkBoundry(this);}


        repaint();
    }



}

