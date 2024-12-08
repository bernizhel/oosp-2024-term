package view;

import javax.swing.*;

public class ErrorWindow extends JFrame {
    public ErrorWindow(String errorMessage) {
        super("Произошла ошибка!");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel errorLabel = new JLabel(errorMessage);
        errorLabel.setHorizontalAlignment(JLabel.CENTER);
        add(errorLabel);
    }
}