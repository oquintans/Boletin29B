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
public class Yates extends Barcos {

    private int cv;
    private int nCam;

    public Yates() {
    }

    public Yates(String matricula, int eslora, int dias, int cv, int nCam) {
        super(eslora, dias, matricula);
        this.cv = cv;
        this.nCam = nCam;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getnCam() {
        return nCam;
    }

    public void setnCam(int nCam) {
        this.nCam = nCam;
    }

    @Override
    public int calcMod(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + cv + nCam;
        return mod;
    }

}
