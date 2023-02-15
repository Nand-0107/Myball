import java.awt.*;
import javax.swing.*;
public class Ball{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    private int size;
    private int num;
    private Color color;


    public Ball(){

        x = (int)(Math.random()*680)+1;
        y = (int)(Math.random()*480)+1;
        xSpeed = (int)((Math.random()*10));
        ySpeed = (int)((Math.random()*10));
        size = (int)((Math.random()+1)*50);
        color = (new Color((int)((Math.random()*255)),(int)((Math.random()*255)),(int)((Math.random()*255))));

    }

    public void drawBall(Graphics bob){
        bob.setColor(color);
        bob.fillOval(x,y,size, size);



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
        x++;
    }
    public void moveLeft(){
        x--;
    }

    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }

    public void checkBoundry(JPanel panel2){
        if(x>=panel2.getWidth()-size||x<0){
            xSpeed = xSpeed * -1;
        }
        if(y >= panel2.getHeight()-size||y<0){
            ySpeed = ySpeed * -1;
        }

    }

}

