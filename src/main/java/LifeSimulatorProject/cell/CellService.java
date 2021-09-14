package LifeSimulatorProject.cell;

import java.util.ArrayList;
import java.util.List;

import static LifeSimulatorProject.config.Config.COLS;
import static LifeSimulatorProject.config.Config.ROWS;


public class CellService {

    private final List<Cell> cells = new ArrayList<>();

    public CellService() {

        for (int i = 0; i < ROWS; i ++) {
            for (int j = 0; j < COLS; j++) {
                cells.add(new Cell(j, i));
            }
        }

        getByCords(3, 6).setLife(true);
        getByCords(4, 6).setLife(true);
        getByCords(5, 6).setLife(true);
    }

   public Cell getByCords(int x, int y) {
       Cell cellByCords = cells.stream().filter(cell -> cell.getX() == x &&
               cell.getY() == y).findFirst().orElse(null);
   return cellByCords;
    }

    public List<Cell> getAllCells() {
        return cells;
    }
}
