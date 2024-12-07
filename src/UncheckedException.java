import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossível dividir por zero! " + e.getMessage());
        }
        finally {
            System.out.println("Chegou no final com tratamento");
        }
        System.out.println("O Código continua!");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
