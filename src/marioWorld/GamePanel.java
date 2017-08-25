package marioWorld;

import marioWorld.controllers.KeyController;
import marioWorld.display.MarioFrame;
import marioWorld.controllers.WorldClickController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * Created by andres on 23/08/17.
 */
public class GamePanel extends JPanel {

    private JPanel buttonPanel; // Panel for buttons
    private MarioWorld drawPanel; // Panel for

    private static final int PANEL_WIDTH = 750; // GamePanel dimensions
    private static final int PANEL_HEIGHT = 640; //

    public JButton restart; // Buttons
    public JButton menu; //

    private static final int BUTTON_WIDTH = 100; // Button dimensions
    private static final int BUTTON_HEIGHT = 75; //

    private ActionListener actionListener; // Click listener for buttons
    private KeyListener keyListener; // Key listener for game controls

    public GamePanel(MarioFrame frame){ // Constructor
        createGameDisplay(frame);
        setGameDisplay();
    }

    private void createGameDisplay(MarioFrame frame){ // Initialize panel components
        buttonPanel = new JPanel(new GridBagLayout());
        drawPanel = new MarioWorld();

        restart = new JButton("RESTART");
        restart.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        restart.setFocusable(false);
        menu = new JButton("MENU");
        menu.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        actionListener = new WorldClickController(frame, this);
        keyListener = new KeyController(drawPanel, frame);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        drawPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        buttonPanel.setBackground(Color.red);
        this.setFocusable(true);
    }

    private void setGameDisplay(){ // Set buttons positions and add components to main panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 5, 20, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(restart, gbc);
        restart.addActionListener(actionListener);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(menu, gbc);
        menu.addActionListener(actionListener);

        this.add(buttonPanel, BorderLayout.WEST);
        this.add(drawPanel, BorderLayout.CENTER);
        this.addKeyListener(keyListener);
    }

    public MarioWorld getDrawPanel() { // Getter
        return drawPanel;
    }
}
