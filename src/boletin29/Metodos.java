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
public class Metodos {

    public String pedirMatricula() {
        String mat = JOptionPane.showInputDialog("Introducir Matrícula");
        return mat;
    }

    public int pedirNDias() {
        int nDias;
        do {
            nDias = Integer.parseInt(JOptionPane.showInputDialog("Introducir dias"));
            if (nDias <= 0) {
                JOptionPane.showMessageDialog(null, "No válido");
            }
        } while (nDias <= 0);
        return nDias;
    }

    public int pedirEslora() {
        int eslora;
        do {
            eslora = Integer.parseInt(JOptionPane.showInputDialog("Introducir eslora"));
            if (eslora <= 0) {
                JOptionPane.showMessageDialog(null, "No válido");
            }
        } while (eslora <= 0);
        return eslora;
    }

    public int pedirNMastiles() {
        int nMast;
        do {
            nMast = Integer.parseInt(JOptionPane.showInputDialog("Introducir número de mástiles"));
            if (nMast <= 0) {
                JOptionPane.showMessageDialog(null, "No válido");
            }
        } while (nMast <= 0);
        return nMast;
    }

    public int pedirCV() {
        int cv;
        do {
            cv = Integer.parseInt(JOptionPane.showInputDialog("Introducir potencia (CV)"));
            if (cv <= 0) {
                JOptionPane.showMessageDialog(null, "No válido");
            }
        } while (cv <= 0);
        return cv;
    }

    public int pedirNCamarotes() {
        int nCam;
        do {
            nCam = Integer.parseInt(JOptionPane.showInputDialog("Introducir número de camarotes"));
            if (nCam <= 0) {
                JOptionPane.showMessageDialog(null, "No válido");
            }
        } while (nCam <= 0);
        return nCam;
    }

    public void addVel(ArrayList puerto) {
        puerto.add(new Veleros(this.pedirMatricula(), this.pedirEslora(), this.pedirNDias(), this.pedirNMastiles()));
    }

    public void addDep(ArrayList puerto) {
        puerto.add(new Deportivos(this.pedirMatricula(), this.pedirEslora(), this.pedirNDias(), this.pedirCV()));
    }

    public void addYat(ArrayList puerto) {
        puerto.add(new Yates(this.pedirMatricula(), this.pedirEslora(), this.pedirNDias(), this.pedirCV(), this.pedirNCamarotes()));
    }

    public void imprimir(Barcos barco) {
        if (barco instanceof Veleros) {
            JOptionPane.showMessageDialog(null, "Velero\n" + "Matrícula: " + barco.getMatricula() + "\n" + "Dias: " + barco.getDias() + "\n" + "Eslora: " + barco.getEslora() + "\nMástiles: " + ((Veleros) barco).getnMastiles() + "\n" + "Precio: " + barco.calcAlq(barco.calcMod(barco)));
        } else {
            if (barco instanceof Deportivos) {
                JOptionPane.showMessageDialog(null, "Deportivo\n" + "Matrícula: " + barco.getMatricula() + "\n" + "Dias: " + barco.getDias() + "\n" + "Eslora: " + barco.getEslora() + "\nPotencia (CV): " + ((Deportivos) barco).getCv() + "\nPrecio: " + barco.calcAlq(barco.calcMod(barco)));
            } else {
                if (barco instanceof Yates) {
                    JOptionPane.showMessageDialog(null, "Yate\n" + "Matrícula: " + barco.getMatricula() + "\n" + "Dias: " + barco.getDias() + "\n" + "Eslora: " + barco.getEslora() + "\nPotencia (CV): " + ((Yates) barco).getCv() + "\nCamarotes: " + ((Yates) barco).getnCam() + "\nPrecio: " + barco.calcAlq(barco.calcMod(barco)));
                } else {
                    if (barco instanceof BCarga) {
                        JOptionPane.showMessageDialog(null, "Barco de Carga\n" + "Matrícula: " + barco.getMatricula() + "\n" + "Dias: " + barco.getDias() + "\n" + "Eslora: " + barco.getEslora() + "\nCarga (tn): " + ((BCarga) barco).getCarga() + "\n" + "Precio: " + barco.calcAlq(barco.calcMod(barco)));
                    }
                }
            }
        }
    }
}
