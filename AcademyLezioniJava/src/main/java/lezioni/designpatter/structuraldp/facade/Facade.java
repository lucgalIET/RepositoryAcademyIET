package main.java.lezioni.designpatter.structuraldp.facade;

public class Facade {
    private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();

    public Facade() {
    }

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
    }

    public void operation() {
        subsystemA.logicaA();
        subsystemB.logicaB();
    }

//    public void operationA() {
//        subsystemA.logicaA();
//    }
//
//    public void operationB() {
//        subsystemB.logicaB();
//    }
}
