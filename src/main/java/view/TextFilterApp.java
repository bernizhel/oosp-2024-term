package view;

import model.TextFilter;

import javax.swing.*;
import java.awt.*;

public class TextFilterApp {
    private JFrame frame;
    private InputPanel inputPanel;
    private OutputPanel outputPanel;
    private final TextFilter textFilter;

    public TextFilterApp() {
        textFilter = new TextFilter();
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Фильтратор пунктуации");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        inputPanel = new InputPanel();
        outputPanel = new OutputPanel();

        JButton filterButton = new JButton("Фильтровать");
        filterButton.addActionListener(e -> {
            String inputText = inputPanel.getText();

            if (!inputText.isEmpty()) {
                String filteredText = textFilter.removePunctuation(inputText);
                outputPanel.setText(filteredText);
                return;
            }

            ErrorWindow errorWindow = new ErrorWindow("Введенный текст не может быть пустым.");
            errorWindow.setVisible(true);
        });

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, BorderLayout.CENTER);
        frame.add(filterButton, BorderLayout.SOUTH);
    }

    public void run() {
        frame.setVisible(true);
    }
}