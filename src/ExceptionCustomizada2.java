import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int indice = 0; indice < denominador.length; indice++) {
            try {
                if (numerador[indice] % 2 != 0) throw new DivisaoNaoExataException("Divisao não exata", numerador[indice], denominador[indice]);
                int resultado = numerador[indice] / denominador[indice];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não permitida. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: Índice fora dos limites do array. " + e.getMessage());
            }
        }

        System.out.println("O programa continua....");
    }
}


