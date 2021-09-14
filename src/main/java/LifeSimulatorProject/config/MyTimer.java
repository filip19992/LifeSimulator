package LifeSimulatorProject.config;
import javax.swing.Timer;

public class MyTimer {

    private Timer timer;

    public MyTimer() {
        timer = new Timer(500, g -> {

        }

        );
    }

    public void start() {
        timer.start();
    }
}
