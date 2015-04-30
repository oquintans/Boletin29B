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
public abstract class Barcos {

    private int eslora;
    private int dias;
    private String matricula;

    public Barcos() {
    }

    public Barcos(int eslora, int dias, String matricula) {
        this.eslora = eslora;
        this.dias = dias;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int calcAlq(int mod) {
        return dias * mod;
    }

    public abstract int calcMod(Barcos barco);
}
