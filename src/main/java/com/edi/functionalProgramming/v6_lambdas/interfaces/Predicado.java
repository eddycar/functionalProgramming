package com.edi.functionalProgramming.v6_lambdas.interfaces;

@FunctionalInterface
public interface Predicado<T>  {
    Boolean test(T valor);
}
