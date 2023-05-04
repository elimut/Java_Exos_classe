/*
 * création de classe exemple
 */
public class Chien {
    public  Chien(String name, int age, boolean vaccin) {
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        // il faut placer les arguments dans la méthode
        System.out.println("Bonjour, je m'appelle" + " " + this.mName + ", je suis un chien de "+ this.mAge + " ans, " + (this.mVaccin  ? "je suis vacciné" : "je ne suis pas vacciné"));
        
    }
    private String mName;
    private int mAge;
    //Encapsulation, changement en public
    private boolean mVaccin;
    // attributs et portées, private "accessible" que dans classe
    // error the fiel Cht.mName is not visible car en private = encapsulé. Encapsulation montrer ce que l'on veut montrer à partir de la classe

    public String getName() {
        return mName;
    }
 
    public void setName(String name) {
        this.mName = name;
    }
    public int getAge() {
        return mAge;
    }
 
    public void setName(int age) {
        this.mAge = age;
    }
    // Ces noms proviennent de « get » (« une méthode pour obtenir la valeur d'un champ ») et « set » (« une méthode pour définir la valeur d'un champ »). 
}

        
