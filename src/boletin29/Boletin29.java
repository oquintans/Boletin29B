/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barcos> puerto = new ArrayList();
        Metodos met = new Metodos();
        Ficheros fich = new Ficheros();
        int op;
        JOptionPane.showMessageDialog(null, "Bienvenido");
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n1 --> Añadir Velero\n2 --> Añadir Deportivo\n3 --> Añadir Yate\n4 --> Añadir Carguero (fichero)\n5 --> Visualizar\n6 --> Salir"));
            switch (op) {
                case 1:
                    met.addVel(puerto);
                    break;
                case 2:
                    met.addDep(puerto);
                    break;
                case 3:
                    met.addYat(puerto);
                    break;
                case 4:
                    fich.leerBarcosC(puerto);
                    JOptionPane.showMessageDialog(null, "Operación realizada con éxito");
                    break;
                case 5:
                    for (Barcos barco : puerto) {
                        met.imprimir(barco);
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios");
                    System.exit(0);
            }
        } while (op != 0 && op != 6);
    }
}
