import java.awt.*;
import javax.swing.*;
public class Ball{

    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;
    private int size;

    private Color color;


    public Ball(){

        x = (int)(Math.random()*600);
        y = (int)(Math.random()*400);
        xSpeed = ((Math.random()*.5)+.2);
        ySpeed = ((Math.random()*.5)+.2);
        size = (int)((Math.random()*50)+20);
        color = (new Color((int)((Math.random()*255)),(int)((Math.random()*255)),(int)((Math.random()*255))));

    }

    public void drawBall(Graphics bob){
        bob.setColor(color);
        bob.fillOval(((int)(x)),((int)(y)),size, size);



    }

    public double getXPos(){
        return x;
    }
    public double getYPos(){
        return y;
    }
    public int siz(){
        return size;
    }

    public void moveBall(){
        x+= xSpeed;
        y+= ySpeed;
    }



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

            xSpeed = xSpeed *-1;
        }
        if(y >= panel2.getHeight()-size||y<0){


            ySpeed = ySpeed * -1;
        }

    }

}
