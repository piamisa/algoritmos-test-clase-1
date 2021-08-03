package com.redbee.academy.clase1;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @param palabra
     * @return
     */
    public static Integer resolver(String texto) {
        Integer total = 0;
        if (texto.length() == 0)
            return total;

        total++;

        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c))
                total += 1;
        }
        return total;
    }
}
