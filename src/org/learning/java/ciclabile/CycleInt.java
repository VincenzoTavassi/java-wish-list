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
            if (numbers != null) {
            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }
            newArray[newArray.length - 1] = number;
            numbers = newArray;
            } else {
                numbers = new int[]{number};
            }
        }

    @Override
    public String toString() {
        return "CycleInt{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
