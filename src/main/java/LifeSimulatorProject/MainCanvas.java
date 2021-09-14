package LifeSimulatorProject;
import LifeSimulatorProject.cell.Cell;
import LifeSimulatorProject.cell.CellService;

import static LifeSimulatorProject.config.Config.COLS;
import static LifeSimulatorProject.config.Config.ROWS;
import static LifeSimulatorProject.config.Config.SIZE;

import java.awt.*;

public class MainCanvas extends Canvas {

   private final CellService cellService = CellService.getInstance();

   private static final MainCanvas INSTANCE = new MainCanvas();



    private MainCanvas() {
        setSize(COLS*SIZE,ROWS*SIZE);
    }

    @Override
    public void paint(Graphics g) {

        for (Cell cell : cellService.getAllCells()) {

            if(cell.isLife()) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.WHITE);
            }

            int x = cell.getX() * SIZE;
            int y = cell.getY() * SIZE;
            g.fillRect(x, y,
                    SIZE -1, SIZE-1);

        }
    }

    public static MainCanvas getInstance() {
        return INSTANCE;
    }
}
