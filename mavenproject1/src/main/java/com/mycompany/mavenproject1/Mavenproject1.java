// Figura 14.2: Addition.java 
// Programa de adição que utiliza JOptionPane para entrada e saída.

import javax.swing.JOptionPane; // programa utiliza JOptionPane 

public class Mavenproject1  {
    public static void main(String[] args) { 
        // Obtém a entrada do usuário via JOptionPane
        String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número:");
        String secondNumber = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converte String em valores inteiros para o cálculo
        int number1 = Integer.parseInt(firstNumber); 
        int number2 = Integer.parseInt(secondNumber); 
        int sum = number1 + number2; // Soma os números

        // Exibe o resultado em um diálogo de mensagem
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + sum, 
                                      "Obrigado pela soma", JOptionPane.PLAIN_MESSAGE);
    } // fim do método main 
} // fim da classe Addition
