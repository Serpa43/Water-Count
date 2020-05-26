package classes;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Negativo extends RuntimeException {
    public Negativo() {
        //JOptionPane.showMessageDialog(null, "Favor verificar as informações, possuem dados negativos ou zerados!", "Erro de dados!", ERROR_MESSAGE);
    }
}
