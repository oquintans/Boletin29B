/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Ficheros {

    Scanner sc;
    String nombF = "BCarga.txt";
    String delim = ",";
    String linea;
    int bucle;

    public void leerBarcosC(ArrayList<Barcos> puerto) {
        String ac = "";
        try {
            sc = new Scanner(new File(nombF)).useDelimiter(delim);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] l = linea.split(",");
                for (int i = 0; i < l.length; i += 4) {
                    puerto.add(new BCarga(l[i], Integer.parseInt(l[i + 1]), Integer.parseInt(l[i + 2]), Integer.parseInt(l[i + 3])));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }
    }

}
