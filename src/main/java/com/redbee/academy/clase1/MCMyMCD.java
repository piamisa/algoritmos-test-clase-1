package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        Integer aux;
        while (num2 != 0){
            aux = num2;
            num2 = num1 % num2;
            num1 = aux;
        }
        return num1;
    }


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        return ((num1 * num2) / mcd (num1, num2));
    }

}
