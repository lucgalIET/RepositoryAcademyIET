package lezioni.designpatter.creationaldp.prototype;

//prototipo astratto
public interface Cantante extends Cloneable {

    Cantante cloneCantante();
    void canta();
}
