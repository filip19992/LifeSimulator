package LifeSimulatorProject.Cell;

import LifeSimulatorProject.Cell.Cell;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static LifeSimulatorProject.Config.COLS;
import static LifeSimulatorProject.Config.ROWS;


public class CellService {

    private final List<Cell> cells = new ArrayList<>();

    public CellService() {

        for (int i = 0; i < ROWS; i ++) {
            for (int j = 0; j < COLS; i++) {
                cells.add(new Cell(j, i));
            }
        }

        getByCords(3, 6).setLife(true);
        getByCords(5, 6).setLife(true);
        getByCords(3, 6).setLife(true);
        getByCords(6, 10).setLife(true);
        getByCords(2, 1).setLife(true);
        getByCords(16, 40).setLife(true);
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
