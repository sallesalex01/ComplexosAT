package org.example;

public class Complexo {
    private double parteReal;
    private double parteImaginaria;

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public Complexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }


    // Métodos de operação
    public static Complexo somar(Complexo num1, Complexo num2) {
        return new Complexo(num1.parteReal + num2.parteReal, num1.parteImaginaria + num2.parteImaginaria);
    }

    public static Complexo subtrair(Complexo num1, Complexo num2) {
        return new Complexo(num1.parteReal - num2.parteReal, num1.parteImaginaria - num2.parteImaginaria);
    }

    public double modulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }

    public String toString() {
        if (parteImaginaria >= 0) {
            return parteReal + " + " + parteImaginaria + "i";
        } else {
            return parteReal + " - " + Math.abs(parteImaginaria) + "i";
        }
    }
}
