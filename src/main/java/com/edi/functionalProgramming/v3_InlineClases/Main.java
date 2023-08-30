package com.edi.functionalProgramming.v3_InlineClases;

import com.edi.functionalProgramming.v3_InlineClases.interfaces.*;

import java.util.List;
import java.util.Random;

//************************************************************************************************************************//
//*********************** En esta version se crean las clases sobre la marcha por ejemplo new Proveedor() *************** //
//************************************ Aplica para Java 7 en java 8 se introducenlas funciones lambda ********************//
//************************************************************************************************************************//

public class Main {
    public static void main(String[] args) {
        // QUE QUEREMOS HACER?
        // 1. - Crear una lista de enteros

        List<Integer> numeros = Funcional.proveer(10, new Proveedor() {
            Random random = new Random();

            @Override
            public Integer obtener() {
                return random.nextInt(1, 10);
            }
        });
        System.out.println("Numeros " + numeros);

        // 2. - Obtener pares de una lista
        List<Integer> filtrados = Funcional.filtrar(numeros, new Predicado() {
            @Override
            public Boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println("Filtrados " + filtrados);

        // 3. - Obtener cuadrado de los pares
        List<Integer> transformados = Funcional.transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println("Transformación " + transformados);

        // 4. - Mostrar cada cuadrado por pantalla

        Consumidor impresor = new Consumidor() {    // Se puede almacenar una funcion en una variable
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        Funcional.consumir(transformados, impresor);

        // 5. - Obtener la suma de los cuadrados
        Integer total = Funcional.reducir(transformados, 1, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 * valor2;
            }
        });
        System.out.println("total:  " + total);
    }
}
