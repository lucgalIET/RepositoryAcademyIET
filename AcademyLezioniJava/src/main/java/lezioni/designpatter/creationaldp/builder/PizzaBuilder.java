package main.java.lezioni.designpatter.creationaldp.builder;

//builder astratto
public interface PizzaBuilder {
    void ingredientiPizza();
    void nomePizza();
    void prezzoPizza();
    Pizza getPizza();
}
