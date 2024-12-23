import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Imprimir/Mostrar
        System.out.println("Start.");
        JOptionPane.showMessageDialog(null, "Bienvenido.");

        // Pedir datos
        String name = JOptionPane.showInputDialog("Introduce tu nombre:");

        Object[] genres = { "Masculino", "Femenino", "Croissant" };
        int genre = JOptionPane.showOptionDialog(
                null, // No hay componente padre
                "Elige una opción:", // Mensaje que se muestra
                "Cuadro de Opciones", // Título del cuadro de diálogo
                JOptionPane.DEFAULT_OPTION, // Tipo de opciones
                JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje
                null, // Sin ícono
                genres, // Las opciones de botones
                genres[2] // Valor inicial seleccionado (Opción 1)
        );

        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a evaluar."));
        ArrayList<Double> notes = new ArrayList<Double>(quantity);

        // Ciclo While
        int i = 0;
        while (i < quantity) {
            double inputNote = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (i + 1)));
            notes.add(inputNote);
            i++;
        }

        // Argumentos
        double note = calcFinalNote(notes);

        JOptionPane.showMessageDialog(null,
                "Estudiante " + name + ", Genero " + genres[genre] + ", Nota Final " + note);

        System.out.println("End.");
    }

    // Funcion/Metodo - Parametros
    public static double calcFinalNote(ArrayList<Double> notes) {
        double sumNotes = 0;

        // Ciclo Foreach
        for (double note : notes) {
            sumNotes += note;
        }

        return sumNotes / notes.size();
    }
}
