package main.java.OnLIneScool.entyty;

public class Singleton {
    private static Singleton instance;
    private String string;
    private Singleton() {
    }
public static Singleton getInstance (){
        if (instance == null){
            instance = new Singleton();
            return instance ;
        }

    return null;
}

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "string='" + string + '\'' +
                '}';
    }

    public void setString(String string) {
        this.string = string;
    }

}
