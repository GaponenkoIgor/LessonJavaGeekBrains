package com.company.levle1.homework5.train.gui.component;

import javax.swing.*;
import java.awt.*;

public class StatusBar extends JLabel {

    public StatusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 50));
    }

    public void setMessage(String message) {
        setText(" " + message);
    }
}