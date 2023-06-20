package lezioni.designpatter.structuraldp.facade.spoiler.serviceimpl;


import lezioni.designpatter.structuraldp.facade.spoiler.service.SystemC;

public class SystemCImpl implements SystemC {
    @Override
    public void faiQualcosa() {
        System.out.println("Ho dato un'implementazione al metodo faiQualcosa() dell'interface SystemC");
    }
}
