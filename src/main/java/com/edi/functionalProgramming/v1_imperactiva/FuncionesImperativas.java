package com.edi.functionalProgramming.v1_imperactiva;

import java.util.ArrayList;
import java.util.List;

public class FuncionesImperativas {
    // QUE QUEREMOS HACER?
    // 1. - Crear una lista de enteros
    public List<Integer> crearLista() {
        return List.of(0, 1, 2, 4, 5, 6, 7, 8, 9);
    }

    // 2. - Quedarme sólo con los pares
    public List<Integer> crearPares(List<Integer> numeros) {

        List<Integer> resultado = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        return resultado;
    }
    // 3. - Pasar cada número al cuadrado
    public List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero : numeros) {
            resultado.add(numero * numero);
        }
        return resultado;
    }
    // 4. - Mostrar cada cuadrado por pantalla
    public void mostrarLista(List<Integer> numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
    // 5. - Obtener la suma de los cuadrados
    public Integer sumarLista(List<Integer> numeros) {
        Integer suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        return suma;
    }

}
