package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        int resultado = 1;
        while (potencia > 0){
            resultado = resultado * base;
            potencia--;
        }
        return resultado;
    }
}
