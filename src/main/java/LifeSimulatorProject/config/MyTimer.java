package LifeSimulatorProject.config;
import LifeSimulatorProject.animation.MainCanvas;
import LifeSimulatorProject.cell.CellService;

import javax.swing.Timer;

public class MyTimer {

    private final CellService cellService = CellService.getInstance();
    private final MainCanvas mainCanvas = MainCanvas.getInstance();

    private Timer timer;
    public MyTimer() {
        timer = new Timer(500, g -> {
            cellService.update();
            mainCanvas.repaint();

        }

        );
    }

    public void start() {
        timer.start();
    }
}
