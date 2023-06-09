package org.learning.java.ciclabile;

public class Main {
    public static void main(String[] args) {

CycleInt ciao = new CycleInt(new int[]{1, 2, 3, 4, 5, 6, 7});

        System.out.println(ciao.getElementoSuccessivo());
        System.out.println(ciao.getElementoSuccessivo());
        System.out.println(ciao.getElementoSuccessivo());

            System.out.println(ciao.hasAncoraElementi());

            System.out.println(ciao);
            ciao.addElemento(8);

            System.out.println(ciao);
            ciao.addElemento(18);

            System.out.println(ciao);

            ciao.addElemento(20);

            System.out.println(ciao);

            CycleInt nah = new CycleInt();
            nah.addElemento(2);
            System.out.println(nah);
            nah.addElemento(3);
            System.out.println(nah);
            nah.addElemento(8);
            System.out.println(nah);
            nah.addElemento(9);
            System.out.println(nah);
    }
}
