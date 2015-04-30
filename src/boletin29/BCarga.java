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
public class BCarga extends Barcos {

    private int carga;

    public BCarga() {
    }

    public BCarga(int carga) {
        this.carga = carga;
    }

    public BCarga(String matricula, int eslora, int dias, int carga) {
        super(eslora, dias, matricula);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int calcMod(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + carga * 20;
        return mod;
    }

}
