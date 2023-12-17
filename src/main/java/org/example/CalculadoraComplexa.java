package org.example;

public class CalculadoraComplexa {
    public static String somar(Complexo num1, Complexo num2) {
        return Complexo.somar(num1, num2).toString();
    }

    public static String subtrair(Complexo num1, Complexo num2) {
        return Complexo.subtrair(num1, num2).toString();
    }

    public static String modulo(Complexo num) {
        return String.valueOf(num.modulo());
    }
}
