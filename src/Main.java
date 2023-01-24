import java.awt.*;
import javax.swing.*;
public class Main{
    public static void main(String[] args){

        JFrame myFrame = new JFrame();
        myFrame.setSize(700,500);



        BallPanel yourPanel = new BallPanel();
        yourPanel.setSize(700,500);





        //myFrame.add(myPanel);
        myFrame.add(yourPanel);
        myFrame.setVisible(true);




    }
}