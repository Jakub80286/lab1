package lab1;

import javax.swing.*;

public class Obraz extends JFrame {

    Animacja animacja=new Animacja();
    public Obraz(){
        this.setSize(840,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(animacja);
        this.setVisible(true);
    }


}
