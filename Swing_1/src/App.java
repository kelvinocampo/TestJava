import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Mi Aplicación Estilizada");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        // Crear y estilizar la etiqueta de bienvenida
        JLabel label = new JLabel("Bienvenido.", SwingConstants.CENTER);
        label.setBounds(50, 50, 400, 50);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.BLUE);
        frame.add(label);

        // Crear y estilizar la etiqueta del contador
        JLabel counterLabel = new JLabel("Has presionado el botón 0 veces.", SwingConstants.CENTER);
        counterLabel.setBounds(50, 120, 400, 50);
        counterLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        counterLabel.setForeground(Color.DARK_GRAY);
        frame.add(counterLabel);

        // Crear y estilizar el botón
        JButton button = new JButton("Presióname");
        button.setBounds(150, 200, 200, 50);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);
        frame.add(button);

        // Acción del botón
        button.addActionListener(new ActionListener() {
            int count = 0;

            public void actionPerformed(ActionEvent e) {
                count++;
                counterLabel.setText("Has presionado el botón " + count + " veces.");
            }
        });
    }
}
