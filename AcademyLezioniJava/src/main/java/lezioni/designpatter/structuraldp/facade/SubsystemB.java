package main.java.lezioni.designpatter.structuraldp.facade;

import main.java.lezioni.designpatter.structuraldp.facade.spoiler.serviceimpl.SystemCImpl;

public class SubsystemB {
    public void logicaB() {
        System.out.println("Subsystem B operations");
    }

    public static void main(String[] args) {
        SystemCImpl systemC = new SystemCImpl();
        systemC.faiQualcosa();
    }

}
