package lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animacja extends JPanel implements ActionListener {

    JLabel jLabel;
    Timer timer = new Timer(1, this);
    int sloncex = 3;
    int sloncey = 0;
    int predkoscSlonca = 1;
    int pszczolax=278;
    int pszczolay=650;
    int skrzydlox=268;
    int skrzydloy=650;
    int predkoscpszczola=1;
    int ptakx=415;
    int ptaky=100;
    int predkoscptaka=1;



    public Animacja() {
        jLabel=new JLabel(new ImageIcon("ptak2.png"));
        jLabel.setSize(199,113);
        jLabel.setLocation(ptakx,ptaky);
        this.setLayout(null);
        this.add(jLabel);
        timer.start();
    }


    public void paintComponent(Graphics g) {
        int xdach[] = {600, 700, 800};
        int ydach[] = {400, 250, 400};
        int xpoints[] = {10, 50, 90};
        int ypoints[] = {590, 520, 590};
        int kwatekx[]={272,283,290};
        int kwiateky[]={670,683,670};
        int npoints = 3;

        super.paintComponent(g);
        this.setBackground(new Color(50, 255, 255));

        Graphics2D rysowanie = (Graphics2D) g;

        rysowanie.setColor((Color.YELLOW));
        rysowanie.fillOval(sloncex, sloncey, 100, 100);
        rysowanie.setColor((Color.GREEN));
        rysowanie.fillRect (0, 700, 840, 80);
        rysowanie.setColor((Color.ORANGE));
        rysowanie.fillRect (600, 400, 200, 300);
        rysowanie.setColor((Color.RED));
        g.fillPolygon(xdach, ydach, npoints);
        rysowanie.setColor((Color.BLUE));
        rysowanie.fillRect (630, 465, 40, 80);
        rysowanie.fillRect (730, 465, 40, 80);
        rysowanie.setColor(new Color(200,100,90));
        rysowanie.fillRect (670, 600, 60, 100);
        rysowanie.fillRect (10, 590, 80, 100);
        rysowanie.fillRect (20, 690, 8, 10);
        rysowanie.fillRect (70, 690, 8, 10);
        rysowanie.setColor(new Color(200,100,1));
        g.fillPolygon(xpoints, ypoints, npoints);
        rysowanie.setColor((Color.BLACK));
        rysowanie.fillOval(30, 635, 40, 40);
        rysowanie.setColor((Color.GREEN));
        rysowanie.fillRect (280, 680, 5, 20);
        rysowanie.setColor((Color.RED));
        g.fillPolygon(kwatekx, kwiateky, npoints);
        rysowanie.setColor((Color.YELLOW));
        rysowanie.fillOval(pszczolax, pszczolay, 13, 13);
        rysowanie.setColor((Color.GRAY));
        rysowanie.fillOval(skrzydlox, skrzydloy, 13, 8);
        rysowanie.fillOval(skrzydlox+2, skrzydloy+10, 10, 5);
        rysowanie.fillOval(skrzydlox+19, skrzydloy, 13, 8);
        rysowanie.fillOval(skrzydlox+19, skrzydloy+10, 10, 5);
        rysowanie.drawLine(skrzydlox+12,skrzydloy,skrzydlox+9,skrzydloy-5);
        rysowanie.drawLine(skrzydlox+17,skrzydloy,skrzydlox+22,skrzydloy-5);
        rysowanie.drawLine(skrzydlox+15,skrzydloy+13,skrzydlox+15,skrzydloy+20);
        rysowanie.setColor(new Color(200,100,60));
        rysowanie.fillRect (350, 500, 50, 200);
        rysowanie.setColor((Color.GREEN));
        rysowanie.fillOval(300, 350, 150, 150);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(sloncex<0 || sloncex>=730) predkoscSlonca =-predkoscSlonca;
        sloncex = sloncex +predkoscSlonca;
        if(pszczolax<=40 || pszczolax>=279) predkoscpszczola=-predkoscpszczola;
        skrzydlox=skrzydlox-predkoscpszczola;
        pszczolax=pszczolax-predkoscpszczola;

        repaint();
        jLabel.setLocation(ptakx,ptaky);
        if(ptaky>=600|| ptaky<=99) predkoscptaka=-predkoscptaka;
        ptaky=ptaky+predkoscptaka;

    }
}
