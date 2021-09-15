package LifeSimulatorProject;

import LifeSimulatorProject.animation.MainFrame;
import LifeSimulatorProject.config.MyTimer;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);


            MyTimer myTimer = new MyTimer();
            myTimer.start();

        });
    }
}
