// Figura 14.2: Addition.java 
// Programa de adição que utiliza JOptionPane para entrada e saída. import javax.swing.JOptionPane; // programa utiliza JOptionPane 
import javax.swing.JOptionPane; // programa utiliza JOptionPane 
public class mavenproject1 {
    public static void main(String[] args) { 
        // obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane 
        String firstNumber = 
        JOptionPane.showInputDialog("Digite um valor 01" ); 
        String secondNumber = 
        JOptionPane.showInputDialog("Digite um valor 02"); 
        // converte String em valores int para utilização em um cálculo 
        int number1 = Integer.parseInt(firstNumber); 
        int number2 = Integer.parseInt(secondNumber); 
        int sum = number1 + number2; // soma os números
        // exibe o resultado em um diálogo de mensagem JOptionPane 
        JOptionPane.showMessageDialog(null, "O resultado das somas sera: " + sum, "obrigado pela soma", JOptionPane. PLAIN_MESSAGE ); 
       
    } // fim do método main 
} // fim da classe Addition 
