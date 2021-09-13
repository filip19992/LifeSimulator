package LifeSimulatorProject;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {


    public MainFrame() throws HeadlessException {

        setTitle("Life simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        MainCanvas mainCanvas = new MainCanvas();
        add(mainCanvas);
        pack();
        setLocationRelativeTo(null);
    }
}