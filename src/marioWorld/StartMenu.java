package marioWorld;

import marioWorld.display.Drawable;
import marioWorld.display.MarioFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by andres on 21/08/17.
 */
public class StartMenu extends JPanel {

    private JPanel buttonPanel;
    private JPanel drawPanel;

    private static final int PANEL_WIDTH = 750;
    private static final int PANEL_HEIGHT = 640;

    JButton play;
    JButton quit;

    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 75;

    //private ActionListener actionListener;


    public StartMenu(MarioFrame frame){
        createMenuDisplay(frame);
    }

    private void createMenuDisplay(MarioFrame frame){
        buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        drawPanel = new Drawable();

        play = new JButton("PLAY");
        play.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        quit = new JButton("QUIT");
        quit.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        //actionListener = new ClickListener(frame, this);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        drawPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        buttonPanel.setBackground(Color.red);

        gbc.insets = new Insets(20, 5, 20, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(play, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(quit, gbc);
        //play.addActionListener(actionListener);
        //quit.addActionListener(actionListener);

        this.add(buttonPanel, BorderLayout.WEST);
        this.add(drawPanel, BorderLayout.CENTER);
    }



}
