package main.java.lezioni.designpatter.creationaldp.methodfactory;

//creator astratto
public abstract class AnimaleCreator {

    public abstract Animale creaAnimale();

    public void faiQualcosa() {
        Animale animale = creaAnimale();
        animale.siMuove();
    }

}