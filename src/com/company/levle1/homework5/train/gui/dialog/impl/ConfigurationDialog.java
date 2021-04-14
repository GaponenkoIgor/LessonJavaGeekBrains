package com.company.levle1.homework5.train.gui.dialog.impl;

import com.company.levle1.homework5.train.enums.DotType;
import com.company.levle1.homework5.train.gui.dialog.Configurable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ConfigurationDialog extends JDialog implements Configurable {

    public static final int MARGIN_VALUE = 10;


    public DotType playerType = DotType.X;
    public int mapSize = 3;

    public ConfigurationDialog(JFrame parentFrame) {
        super(parentFrame, "Конфигурация игры", true);

        setBounds(300, 300, 400, 200);

        // Создаем поле для ввода размера игровой карты
        JTextField mapSizeTextField = new JTextField(String.valueOf(mapSize));

        JPanel commonPanel = getConfigurationPanel(mapSizeTextField);

        JButton applyButton = createApplyButton(mapSizeTextField);

        setLayout(new BorderLayout());
        add(commonPanel, BorderLayout.CENTER);
        add(applyButton, BorderLayout.SOUTH);


        commonPanel.setBorder(BorderFactory.createEmptyBorder(MARGIN_VALUE, MARGIN_VALUE, MARGIN_VALUE, MARGIN_VALUE));

        setVisible(true);
    }


    private JPanel getConfigurationPanel(JTextField mapSizeTextField) {
        int gridSize = 2;
        int horizontalGap = 10;
        int verticalGap = 20;

        JPanel commonPanel = new JPanel(new GridLayout(gridSize, gridSize, horizontalGap, verticalGap));
        commonPanel.add(new JLabel("Выберите за кого вы будете играть?"));
        commonPanel.add(createChoiceButtonPanel());
        commonPanel.add(new JLabel("Укажите размер игрового поля"));
        commonPanel.add(mapSizeTextField);

        return commonPanel;
    }


    private JButton createApplyButton(JTextField mapSizeTextField) {
        JButton applyButton = new JButton("Принять");

        WindowEvent closeEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mapSize = Integer.parseInt(mapSizeTextField.getText());
                dispatchEvent(closeEvent);
            }
        });

        return applyButton;
    }

    private JPanel createChoiceButtonPanel() {
        JRadioButton xButtonChoice = getRadioButton("X", DotType.X, true);
        JRadioButton oButtonChoice = getRadioButton("O", DotType.O, false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(xButtonChoice);
        buttonPanel.add(oButtonChoice);

        ButtonGroup group = new ButtonGroup();
        group.add(xButtonChoice);
        group.add(oButtonChoice);

        return buttonPanel;
    }

    private JRadioButton getRadioButton(String text, DotType buttonDotType, boolean selected) {
        JRadioButton choiceBtn = new JRadioButton(text, selected);
        choiceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerType = buttonDotType;
            }
        });

        return choiceBtn;
    }

    @Override
    public DotType getPlayerType() {
        return playerType;
    }

    @Override
    public int getMapSize() {
        return mapSize;
    }

}
