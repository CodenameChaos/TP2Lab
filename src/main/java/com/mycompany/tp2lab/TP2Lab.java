package com.mycompany.tp2lab;

import javax.swing.*;

public class TP2Lab {

       public static void main(String[] args) {
        JFrame frame = new JFrame("Ingresar Nombre");
        
        // Esto es para configurar el tamaño de la interfaz
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Por favor, ingresa tu nombre:");
        JTextField textField = new JTextField(20);
        
        JButton button = new JButton("Aceptar");
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.add(panel);
        
        frame.setVisible(true);
        
        button.addActionListener(e -> {
            String nombre = textField.getText();
            JOptionPane.showMessageDialog(null, "Hola, " + nombre + "! Bienvenid@ a esta interfaz grafica.");
        });
    }
}