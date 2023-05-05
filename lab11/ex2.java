package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class lab11_2 extends JFrame implements ActionListener {
    private JTextField firstNameField, lastNameField, middleNameField, birthdayField, groupField;
    private JButton saveButton, loadButton;

    public lab11_2() {
        super("Student Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        add(firstNameLabel);
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        add(lastNameLabel);
        add(lastNameField);

        JLabel middleNameLabel = new JLabel("Middle Name:");
        middleNameField = new JTextField();
        add(middleNameLabel);
        add(middleNameField);

        JLabel birthdayLabel = new JLabel("Birthday (YYYY-MM-DD):");
        birthdayField = new JTextField();
        add(birthdayLabel);
        add(birthdayField);

        JLabel groupLabel = new JLabel("Group:");
        groupField = new JTextField();
        add(groupLabel);
        add(groupField);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        add(saveButton);

        loadButton = new JButton("Load");
        loadButton.addActionListener(this);
        add(loadButton);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new lab11_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == saveButton) {
            Student student = new Student(firstNameField.getText(), lastNameField.getText(), middleNameField.getText(),
                    birthdayField.getText(), groupField.getText());
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat", true));
                out.writeObject(student);
                out.close();
                JOptionPane.showMessageDialog(this, "Student saved successfully.");
            } catch(IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if(e.getSource() == loadButton) {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"));
                Student student = (Student) in.readObject();
                firstNameField.setText(student.getFirstName());
                lastNameField.setText(student.getLastName());
                middleNameField.setText(student.getMiddleName());
                birthdayField.setText(student.getBirthday());
                groupField.setText(student.getGroup());
                in.close();
                JOptionPane.showMessageDialog(this, "Student loaded successfully.");
            } catch(IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error loading student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class Student implements Serializable {
    private String firstName, lastName, middleName, birthday, group;

    public Student(String firstName, String lastName, String middleName, String birthday, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName + ", " + birthday + ", " + group;
    }
}
