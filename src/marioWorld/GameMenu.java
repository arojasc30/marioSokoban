package marioWorld;

import marioWorld.controllers.ClickController;
import marioWorld.display.GameMenuDraw;
import marioWorld.display.MarioFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by andres on 21/08/17.
 */

/**
 * Panel class for game Menu
 */
public class GameMenu extends JPanel {

    private JPanel buttonPanel; // Panel for buttons
    private static JPanel drawPanel; // Panel for game Image

    private static final int PANEL_WIDTH = 750; // GameMenu panel dimensions
    private static final int PANEL_HEIGHT = 640; //

    public JButton play; // Buttons
    public JButton quit; //

    private static final int BUTTON_WIDTH = 100; // Button dimensions
    private static final int BUTTON_HEIGHT = 75; //

    private ActionListener actionListener; // Click Listener for buttons


    public GameMenu(MarioFrame frame){ // Constructor
        createMenuDisplay(frame);
        setMenuDisplay();
    }

    private void createMenuDisplay(MarioFrame frame){ // Initialize panel components
        buttonPanel = new JPanel(new GridBagLayout());
        drawPanel = new GameMenuDraw();

        play = new JButton("PLAY");
        play.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        quit = new JButton("QUIT");
        quit.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        actionListener = new ClickController(frame, this);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        drawPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        buttonPanel.setBackground(Color.red);

    }

    private void setMenuDisplay(){ // Set buttons positions and add components to main panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 5, 20, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(play, gbc);
        play.addActionListener(actionListener);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(quit, gbc);
        quit.addActionListener(actionListener);

        this.add(buttonPanel, BorderLayout.WEST);
        this.add(drawPanel, BorderLayout.CENTER);
    }

}
