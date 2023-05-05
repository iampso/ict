package com.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class lab11_1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public lab11_1() {
        super("My window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label1 = new JLabel("Enter text (max - 25 characters):");
        panel.add(label1);

        textField1 = new JTextField(25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Specify the path to the file:");
        panel.add(label2);

        textField2 = new JTextField();
        panel.add(textField2);

        button = new JButton("Save");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                String fileName = textField2.getText();

                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(fileName);
                    fileWriter.write(text);
                    fileWriter.close();
                    JOptionPane.showMessageDialog(null, "The data is written to a file.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error writing to file!");
                }
            }
        });
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        lab11_1 window = new lab11_1();
    }
}
