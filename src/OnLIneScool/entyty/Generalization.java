package OnLIneScool.entyty;

public class Generalization <T> {

    T [] generalization ;

    public Generalization(T[] generalization) {
        this.generalization = generalization;
    }

    public Generalization() {

    }

    public T[] getGeneralization() {
        return generalization;
    }

    public void setGeneralization(T[] generalization) {
        this.generalization = generalization;
    }
}
