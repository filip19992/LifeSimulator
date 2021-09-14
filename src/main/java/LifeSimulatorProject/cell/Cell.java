package LifeSimulatorProject.cell;

public class Cell {
    private final int x;
    private final int y;
    private boolean life;


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public boolean isNeighbor(Cell cell) {

        if(cell.getX() == x && cell.getY() == y) {
            return false;
        }

        if(cell.getX() >= x + 1 && cell.getX() >= x - 1 &&
                cell.getY() >= x + 1 && cell.getY() >= x - 1) {
            return true;
        } else {
            return false;
        }
    }

}
