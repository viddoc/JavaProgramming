//Tommy Hudson RGBCheckBoxes program
package e20point4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RGBCheckBoxes extends JFrame 
{

    private JPanel colorPanel;
    private JCheckBox redCheckBox;
    private JCheckBox greenCheckBox;
    private JCheckBox blueCheckBox;

    public RGBCheckBoxes() 
    {
        setTitle("RGB Color Mixer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        JPanel checkBoxPanel = createCheckBoxPanel();
        add(checkBoxPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private JPanel createCheckBoxPanel() 
    {
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new FlowLayout());

        redCheckBox = new JCheckBox("Red");
        redCheckBox.addItemListener(new CheckBoxItemListener());
        checkBoxPanel.add(redCheckBox);

        greenCheckBox = new JCheckBox("Green");
        greenCheckBox.addItemListener(new CheckBoxItemListener());
        checkBoxPanel.add(greenCheckBox);

        blueCheckBox = new JCheckBox("Blue");
        blueCheckBox.addItemListener(new CheckBoxItemListener());
        checkBoxPanel.add(blueCheckBox);

        return checkBoxPanel;
    }

    private class CheckBoxItemListener implements ItemListener 
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            int red = redCheckBox.isSelected() ? 255 : 0;
            int green = greenCheckBox.isSelected() ? 255 : 0;
            int blue = blueCheckBox.isSelected() ? 255 : 0;

            Color newColor = new Color(red, green, blue);
            colorPanel.setBackground(newColor);
        }
    }

    public static void main(String[] args) 
    {
        new RGBCheckBoxes();
    }
}