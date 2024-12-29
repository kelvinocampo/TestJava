import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterUser {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame register = new JFrame("Registrar Usuario");
        register.setSize(900, 600);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        register.setLayout(null);
        register.setLocationRelativeTo(null); // Centrar el marco en la pantalla
        register.setVisible(true);

        // Configuración de fuente
        Font titleFont = new Font("Arial", Font.BOLD, 24);
        Font labelFont = new Font("Arial", Font.PLAIN, 16);
        Font inputFont = new Font("Arial", Font.PLAIN, 14);
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        // Crear y configurar el título
        JLabel title = new JLabel("Registrar Usuario");
        title.setFont(titleFont);
        title.setBounds(350, 50, 300, 50); // Posición y tamaño del título
        register.add(title);

        // Crear y configurar la etiqueta de entrada de nombre
        JLabel inputNameLabel = new JLabel("Ingrese su nombre:");
        inputNameLabel.setFont(labelFont);
        inputNameLabel.setBounds(300, 150, 200, 30); // Posición y tamaño de la etiqueta
        register.add(inputNameLabel);

        // Crear y configurar el campo de entrada de nombre
        JTextField inputName = new JTextField(20);
        inputName.setFont(inputFont);
        inputName.setBounds(500, 150, 200, 30); // Posición y tamaño del campo de entrada
        register.add(inputName);

        // Crear y configurar la etiqueta de entrada de edad
        JLabel inputAgeLabel = new JLabel("Ingrese su edad:");
        inputAgeLabel.setFont(labelFont);
        inputAgeLabel.setBounds(300, 200, 200, 30); // Posición y tamaño de la etiqueta
        register.add(inputAgeLabel);

        // Crear y configurar el campo de entrada de edad
        JTextField inputAge = new JTextField(20);
        inputAge.setFont(inputFont);
        inputAge.setBounds(500, 200, 200, 30); // Posición y tamaño del campo de entrada
        register.add(inputAge);

        // Crear y configurar el botón de envío
        JButton submit = new JButton("Crear");
        submit.setFont(buttonFont);
        submit.setBounds(400, 300, 100, 40); // Posición y tamaño del botón
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inputName.getText();
                String ageText = inputAge.getText();
                try {
                    byte age = Byte.parseByte(ageText);
                    JOptionPane.showMessageDialog(register, "Usuario " + name + " registrado exitosamente!,"+ age);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(register, "Por favor, ingrese una edad válida (0-127).", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        register.add(submit);

        // Establecer color de fondo
        register.getContentPane().setBackground(new Color(240, 248, 255)); // Color de fondo azul claro
    }
}
