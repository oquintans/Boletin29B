/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author oquintansocampo
 */
public class Veleros extends Barcos {

    private int nMastiles;

    public Veleros() {
    }

    public Veleros(String matricula, int eslora, int dias, int nMastiles) {
        super(eslora, dias, matricula);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    @Override
    public int calcMod(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + nMastiles;
        return mod;
    }

}
