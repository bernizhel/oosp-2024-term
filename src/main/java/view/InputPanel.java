package view;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private final JTextArea inputTextArea;

    public InputPanel() {
        setLayout(new BorderLayout());
        JLabel inputLabel = new JLabel("Введите текст:");
        inputTextArea = new JTextArea(5, 40);
        add(inputLabel, BorderLayout.NORTH);
        add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
    }

    public String getText() {
        return inputTextArea.getText();
    }
}