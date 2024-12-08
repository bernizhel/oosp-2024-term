package view;

import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel {
    private final JTextArea outputTextArea;

    public OutputPanel() {
        setLayout(new BorderLayout());
        JLabel outputLabel = new JLabel("Отфильтрованный текст (без пунктуации):");
        outputTextArea = new JTextArea(5, 40);
        outputTextArea.setEditable(false);
        add(outputLabel, BorderLayout.NORTH);
        add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
    }

    public void setText(String text) {
        outputTextArea.setText(text);
    }
}