import javax.swing.JOptionPane;

public class SumaNumerosNaturales {
    public static void main(String[] args) {
        int entradaUsuario = 0;
        int suma = 0;

        // Obtener la entrada del usuario y validarla
        while (true) {
            String entrada = JOptionPane.showInputDialog("Ingrese el número que desea calcular");
            try {
                entradaUsuario = Integer.parseInt(entrada);
                if (entradaUsuario > 0) {
                    break; // Salir del bucle si la entrada es válida
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.");
            }
        }

        // Calcular la suma usando la fórmula
        suma = entradaUsuario * (entradaUsuario + 1) / 2;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La suma de los primeros " + entradaUsuario + " naturales es igual a " + suma);
    }
}