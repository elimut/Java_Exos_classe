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
    public  Chat(String name, int age, boolean vaccin) {
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        // il faut placer les arguments dans la méthode
        System.out.println("Bonjour, je m'appelle" + " " + this.mName + ", je suis un chat de "+ this.mAge + " ans, " + (this.mVaccin  ? "je suis vacciné" : "je ne suis pas vacciné"));
        
    }
    private String mName;
    public int mAge;
    //Encapsulation, changement en public
    private boolean mVaccin;
    // attributs et portées, private "accessible" que dans classe
    // error the fiel Cht.mName is not visible car en private = encapsulé. Encapsulation montrer ce que l'on veut montrer à partir de la classe
}

        