package LifeSimulatorProject.cell;

import java.util.ArrayList;
import java.util.List;

import static LifeSimulatorProject.config.Config.COLS;
import static LifeSimulatorProject.config.Config.ROWS;


public class CellService {

    private final List<Cell> cells = new ArrayList<>();

    private static final CellService INSTANCE = new CellService();

    private CellService() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                cells.add(new Cell(j, i));
            }
        }

        getByCords(4, 6).setLife(true);
        getByCords(4, 7).setLife(true);
        getByCords(4, 8).setLife(true);

    }

    public static CellService getInstance() {
        return INSTANCE;
    }

    public Cell getByCords(int x, int y) {
        return cells.stream()
                .filter(cell -> cell.getX() == x &&
                        cell.getY() == y)
                .findFirst().orElse(null);
    }

    public List<Cell> getAllCells() {
        return cells;
    }

    public void update() {
        List<Cell> newCells = new ArrayList<>();
        List<Cell> deadCells = new ArrayList<>();

        for (Cell cell : cells) {
            long aliveNeighborCells = cells.stream()
                    .filter(cell::isNeighbor)
                    .filter(Cell::isLife)
                    .count();

            if (cell.isLife()) {
                if (aliveNeighborCells < 2 || aliveNeighborCells > 3) {
                    deadCells.add(cell);
                }
            } else {
                if (aliveNeighborCells == 3) {
                    newCells.add(cell);
                }
            }
        }

        for (Cell cell : deadCells) {
            cell.setLife(false);
        }
        for (Cell cell : newCells) {
            cell.setLife(true);
        }
    }
}
