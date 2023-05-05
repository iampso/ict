package com.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomNumberGenerator extends JFrame implements ActionListener {
  
  private JTextField textField;
  private JButton button;
  
  public RandomNumberGenerator() {
    super("Random Number Generator");
    
    // создание и настройка текстового поля
    textField = new JTextField();
    textField.setEditable(false);
    textField.setHorizontalAlignment(JTextField.CENTER);
    
    // кнопка
    button = new JButton("Generate Random Numbers");
    button.addActionListener(this);
    
    // добавление компонентов на форму
    add(textField, BorderLayout.CENTER);
    add(button, BorderLayout.SOUTH);
    
    // размеры формы
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  // рандомайзер
  private void generateNumbers() {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<7; i++) {
      sb.append((int)(Math.random() * 100) + 1).append("\n");
    }
    textField.setText(sb.toString());
  }
  
  // обработчик для кнопки
  public void actionPerformed(ActionEvent ae) {
    generateNumbers();
  }
  
  public static void main(String[] args) {
    RandomNumberGenerator rng = new RandomNumberGenerator();
  }
}
