package org.learning.java.ciclabile;

import java.util.Arrays;

public class CycleInt {
        private int[] numbers;
        private static int lastPosition = 0;

        public CycleInt(int[] numbers) {
            this.numbers = numbers;
        }

    public CycleInt() {
    }

        public int getElementoSuccessivo() {
             if (lastPosition < numbers.length) {
                int number = numbers[lastPosition];
                 lastPosition++;
                return number;
            } else throw new ArrayIndexOutOfBoundsException("Numero fuori dal bound");
        }

        public boolean hasAncoraElementi() {
            return lastPosition < numbers.length;
        }

        public void addElemento(int number) {
            if (numbers != null) { // Se l'array esiste già
            int[] newArray = new int[numbers.length + 1]; // Creo un nuovo array con lunghezza +1
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i]; // Copio i numeri dell'array precedente
            }
            newArray[newArray.length - 1] = number; // Inserisco il numero dell'utente all'ultima posizione
            numbers = newArray; // Aggiorno array
            } else {
                numbers = new int[]{number}; // Altrimenti creo il nuovo array con il numero dell'utente
            }
        }

    @Override
    public String toString() {
        return "CycleInt{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
