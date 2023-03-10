import java.awt.*;
import javax.swing.*;
public class Ball{

    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;
    private int size;
    private int num;
    private Color color;


    public Ball(){

        x = (int)(Math.random()*600);
        y = (int)(Math.random()*400);
        xSpeed = 8;
        ySpeed = 8;
        size = (int)((Math.random()*50)+20);
        color = (new Color((int)((Math.random()*255)),(int)((Math.random()*255)),(int)((Math.random()*255))));

    }

    public void drawBall(Graphics bob){
        bob.setColor(color);
        bob.fillOval(((int)x),((int)y),size, size);



    }

    public void moveBall(){
        x+= xSpeed;
        y+= ySpeed;
    }

//    public void bounceBall(){
//
//
//    }

    public void moveRight(){
       x= x+xSpeed;
    }
    public void moveLeft(){
        x=x-xSpeed;
    }

    public void moveUp(){
        y= y-ySpeed;
    }
    public void moveDown(){
        y= y+ySpeed;
    }

    public void checkBoundry(JPanel panel2){

        if(x>=panel2.getWidth()-size || x<0){

            xSpeed = ((xSpeed *-1));
        }
        if(y >= panel2.getHeight()-size || y<0){

            ySpeed = ((ySpeed *-1));
        }

    }

}

