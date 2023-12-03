//Tommy Hudson RGBRadioButtons program
package e20point3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public
 
class RGBRadioButtons extends JFrame 
{

    private JPanel colorPanel;
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;

    public RGBRadioButtons() 
    {
        setTitle("RGB Color Changer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        JPanel radioPanel = createRadioPanel();
        add(radioPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private JPanel createRadioPanel() 
    {
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout());

        ButtonGroup buttonGroup = new ButtonGroup();

        redRadioButton = new JRadioButton("Red");
        redRadioButton.setSelected(true);
        redRadioButton.addItemListener(new RadioButtonItemListener());
        buttonGroup.add(redRadioButton);
        radioPanel.add(redRadioButton);

        greenRadioButton = new JRadioButton("Green");
        greenRadioButton.addItemListener(new RadioButtonItemListener());
        buttonGroup.add(greenRadioButton);
        radioPanel.add(greenRadioButton);

        blueRadioButton = new JRadioButton("Blue");
        blueRadioButton.addItemListener(new RadioButtonItemListener());
        buttonGroup.add(blueRadioButton);
        radioPanel.add(blueRadioButton);

        return radioPanel;
    }

    private class RadioButtonItemListener implements ItemListener 
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if (e.getSource() == redRadioButton) 
            {
                colorPanel.setBackground(Color.RED);
            }
            else if (e.getSource() == greenRadioButton) 
            {
                colorPanel.setBackground(Color.GREEN);
            }
            else if (e.getSource() == blueRadioButton) 
            {
                colorPanel.setBackground(Color.BLUE);
            }
        }
    }

    public static void main(String[] args) 
    {
        new RGBRadioButtons();
    }
}