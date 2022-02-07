package com.company;

public class Class {
    private String name;
    private int nomer;
    private int[] massiva;

    public Class() {

    }

    public Class(String name, int nomer, int[] massiva) {
        this.name = name;
        this.nomer = nomer;
        this.massiva = massiva;
        System.out.print(name + " " + nomer + " ");
        for (int a : massiva) {
            System.out.print(a + " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int[] getMassiva() {

        return massiva;
    }

    public void setMassiva(int[] massiva) {
        this.massiva = massiva;
    }
}


