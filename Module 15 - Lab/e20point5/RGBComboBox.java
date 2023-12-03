//Tommy Hudson RGBComboBox program
package e20point5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
 
class RGBComboBox extends JFrame 
{

    private JPanel colorPanel;
    private JComboBox<String> colorComboBox;

    public RGBComboBox() 
    {
        setTitle("RGB Color Changer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        JPanel comboPanel = createComboBoxPanel();
        add(comboPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private JPanel createComboBoxPanel() 
    {
        JPanel comboPanel = new JPanel();
        comboPanel.setLayout(new FlowLayout());

        String[] colorOptions = {"Red", "Green", "Blue"};
        colorComboBox = new JComboBox<>(colorOptions);
        colorComboBox.addActionListener(new ComboBoxActionListener());
        comboPanel.add(colorComboBox);

        return comboPanel;
    }

    private class ComboBoxActionListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            Color newColor = null;

            switch (selectedColor) 
            {
                case "Red":
                    newColor = Color.RED;
                    break;
                case "Green":
                    newColor = Color.GREEN;
                    break;
                case "Blue":
                    newColor = Color.BLUE;
                    break;
            }

            colorPanel.setBackground(newColor);
        }
    }

    public static void main(String[] args) 
    {
        new RGBComboBox();
    }
}