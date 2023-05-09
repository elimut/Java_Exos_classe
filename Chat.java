// Création de classe exemple:

/*
* public class Chat {
*    public static void main(String[] args) {
*        System.out.println("Le chat fait miaou-miaou" );
*    }
*/


// Mot clef this et contexte:

// System.out.println("Le chat fait miaou-miaou" + this); => this fait référence au contexte, dit à l'instance c'est cette instance qui est en cours. Celle que l'on appelle.
// Le mot-clé this fait référence à l’objet courant dans une méthode ou un constructeur. (https://waytolearnx.com/2020/03/java-this.html)

// Instance d'un objet chat à partir de la classe Chat:

// Instance grâce au mot clef new => voir app.java:
/*
 *  public class App {
        public static void main(String[] args) {
            Chat tom = new Chat();
        }
    }
 */


// Constructeur:

/*
 * public class Chat {
    public  Chat() {
        System.out.println("Le chat fait miaou-miaou" + " "+ this);
    }
}
 */

public class Chat {
    private String mName;
    private int mAge;
    //Encapsulation, changement en public
    private boolean mVaccin;
    // attributs et portées, private "accessible" que dans classe
    // error the fiel Cht.mName is not visible car en private = encapsulé. Encapsulation montrer ce que l'on veut montrer à partir de la classe

    public  Chat(String name, int age, boolean vaccin) {
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        // il faut placer les arguments dans la méthode
        // System.out.println("Bonjour, je m'appelle" + " " + this.mName + ", je suis un chat de "+ this.mAge + " ans, " + (this.mVaccin  ? "je suis vacciné" : "je ne suis pas vacciné"));
        
    }
    
    public String getName() {
        return mName;
    }
    // getter
 
    public void setName(String name) {
        this.mName = name;
    }

    public int getAge() {
        return mAge;
    }
 
    public void setAge(int age) {
        this.mAge = age;
        // si return: ne permet pas de maj depuis l'extérieur 
    }

    public boolean getVaccin() {
        return mVaccin;
    }

    public void setVaccin(boolean vaccin) {
        this.mVaccin = vaccin;
    }

    // Ces noms proviennent de « get » (« une méthode pour obtenir la valeur d'un champ ») et « set » (« une méthode pour définir la valeur d'un champ »). 


}

        