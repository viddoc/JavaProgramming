//Tommy Hudson RGBIcon program
package e20point2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGBIcon extends JFrame 
{

    private JPanel colorPanel;

    public RGBIcon() 
    {
        setTitle("RGB Color Changer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        JPanel buttonPanel = createButtonsPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createButtonsPanel() 
    {
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));

        JButton redButton = new JButton("Red", new ImageIcon("red_icon.png"));
        redButton.addActionListener(new RedButtonListener());
        buttonPanel.add(redButton);

        JButton greenButton = new JButton("Green", new ImageIcon("green_icon.png"));
        greenButton.addActionListener(new GreenButtonListener());
        buttonPanel.add(greenButton);

        JButton blueButton = new JButton("Blue", new ImageIcon("blue_icon.png"));
        blueButton.addActionListener(new BlueButtonListener());
        buttonPanel.add(blueButton);

        return buttonPanel;
    }

    private class RedButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            colorPanel.setBackground(Color.RED);
        }
    }

    private class GreenButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            colorPanel.setBackground(Color.GREEN);
        }
    }

    private class BlueButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            colorPanel.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) 
    {
        new RGBIcon();
    }
}