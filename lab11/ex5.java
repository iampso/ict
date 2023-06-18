import javax.swing.*;
import java.awt.*;

public class rer extends JFrame {
    public static void main(String args[]){
        new rer("Задание 5");
    }
    public rer(String s){
        super(s);
        setSize(800, 550);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics chart) {


        Graphics2D g2d = (Graphics2D) chart;
        chart.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,
                1, new float[]{5f, 5f}, 0f));

       
        chart.drawLine(150, 50, 150, 505);
        chart.drawLine(250, 50, 250, 505);
        chart.drawLine(350, 50, 350, 505);
        chart.drawLine(450, 50, 450, 505);
        chart.drawLine(550, 50, 550, 505);
        chart.drawLine(650, 50, 650, 505);
        chart.drawLine(750, 50, 750, 505);


        chart.setFont(new Font("Serif", Font.ROMAN_BASELINE, 14));

        chart.drawString("-6", 40, 523);
        chart.drawString("-4", 143, 523);
        chart.drawString("-2", 245, 523);
        chart.drawString("0", 345, 523);
        chart.drawString("2", 445, 523);
        chart.drawString("4", 545, 523);
        chart.drawString("6", 645, 523);
        chart.drawString("8", 745, 523);


        chart.drawLine(45, 50, 750, 50);
        chart.drawLine(45, 100, 750, 100);
        chart.drawLine(45, 150, 750, 150);
        chart.drawLine(45, 200, 750, 200);
        chart.drawLine(45, 250, 750, 250);
        chart.drawLine(45, 300, 750, 300);
        chart.drawLine(45, 350, 750, 350);
        chart.drawLine(45, 400, 750, 400);
        chart.drawLine(45, 450, 750, 450);
        chart.drawLine(45, 500, 750, 500);

        chart.drawString("-3", 27, 503);
        chart.drawString("-2", 27, 453);
        chart.drawString("-1", 27, 403);
        chart.drawString("0", 27, 353);
        chart.drawString("1", 27, 303);
        chart.drawString("2", 27, 253);
        chart.drawString("3", 27, 203);
        chart.drawString("4", 27, 153);
        chart.drawString("5", 27, 103);
        chart.drawString("6", 27, 53);

        g2d.setStroke(new BasicStroke(2));
        chart.drawLine(50, 50, 50, 505);
        chart.drawLine(45, 500, 750, 500);
        g2d.setStroke(new BasicStroke(4));


        chart.drawLine(150,450,100,250);
        chart.drawLine(100,250,200,200);
        chart.drawArc(200,100,200,200,0,180);
        chart.drawLine(400,200,550,150);
        chart.drawLine(550,150,350,400);
        chart.drawLine(350,400,150,450);


        chart.drawLine(550,250,650,150);
        chart.drawLine(650,150,700,350);
        chart.drawArc(500,250,200,200,180,180);
        chart.drawLine(500,350,600,400);
        chart.drawLine(600,400,550,250);
    }

}
