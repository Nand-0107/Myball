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

        x = (int)(Math.random()*680);
        y = (int)(Math.random()*480);
        xSpeed = 5;
        ySpeed = 5;
        size = (int)(Math.random()*20); ;
    }

    public void drawBall(Graphics bob){
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



}