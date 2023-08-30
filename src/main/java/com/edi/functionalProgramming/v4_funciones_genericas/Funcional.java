package com.edi.functionalProgramming.v4_funciones_genericas;

import com.edi.functionalProgramming.v4_funciones_genericas.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Funcional {

    public static <T> List<T> filtrar(List<T> valores, Predicado<T> predicado) {
        List resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    public static <T, R> List<R> transformar(List<T> valores, Funcion<T, R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

    public static <T> void consumir(List<T> valores, Consumidor consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    public static <T>  T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionBinaria) {
        T total = identidad;
        for (T valor: valores
             ) {
            total = funcionBinaria.aplicar(total, valor);
        }
        return total;
    }
}
