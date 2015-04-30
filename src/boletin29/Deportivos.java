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
public class Deportivos extends Barcos {

    private int cv;

    public Deportivos() {
    }

    public Deportivos(String matricula, int eslora, int dias, int cv) {
        super(eslora, dias, matricula);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public int calcMod(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + cv;
        return mod;
    }

}
