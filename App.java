/*
 * public class App {
    public static void main(String[] args) {
        System.out.println("Salut");
    }
 }
 */

/*
 * construction d'une classe:
création fichier .java, le nom sera donné à la classe. Chaque fichier correspond à une classe. Cela rend le code plus robuste, et maintenable
La classe a une portée, pour la construction d'une classe, on commence toujours par préciser la **portée**:
- **public**: classe accessible partout depuis mon application,
- **private**: accessible que depuis le fichier,
- ...
suivi de class, type, qui permet de construire un objet comme étant une classe
suivi du nom du fichier, nom de la classe
suivi d'accolades car objet
obligation nom de fichier et nom de classe
void -> pour aucun type dans méthode main
c'est le point de départ du programme, le point d'entrée
 */

/*
 * Compilation:
 * javac ./App.java => fichier extension .class
 */


// Création d'instances de la classe Chat:
/*
*public class App {
*    public static void main(String[] args) {
*        Chat tom = new Chat();
*        Chat david = new Chat();
*    }
*}
*/
// Exécution App.java : Le chat fait miaou-miaou Chat@372f7a8d => identifiant de l'instance de Chat. Le nom et id de l'instance sont uniques.
// Chaque instance de chat aura un emplacement dans la mémoire qui lui est dédié, d'où l'id. Ces espaces sont différents, donc chacun peut faire une action différente de l'autre en même temps.

import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Chat c = new Chat("David", 55, true);
        Chat felix = new Chat("Felix", 44, false);
        // System.out.println(c.mAge);
        // 55
        // System.out.println(c.mName);
        // error the fiel Cht.mName is not visible car en private = encapsulé
        name(c);
        user(c);
    }

    public static void name(Chat chat)
    {
        // System.out.println(c.mAge);
        // System.out.println(c.mName);
        // public. erreur, n'affiche pas la donnée
        // String cName = c.getName();
        System.out.println("c.mName: "+ chat.getName());
        // https://codegym.cc/fr/groups/posts/getters-et-setters-en-java
        // https://www.w3schools.com/java/java_encapsulation.asp
    }

    public static void user(Chat chat)
    {
        Scanner saisieUser = new Scanner(System.in);
        System.out.println("Veuillez saisir m pour faire miauler le chat sinon y pour faire aboyer le chien");
        String i = saisieUser.nextLine();
        String miaule = "m";
        System.out.println((i.equals(miaule)) ? "Le chat "+ chat.getName() +" fait miaou-miaou"  : "Le chien fait ouaf_ouaf");
        // La equals()méthode compare deux chaînes et renvoie true si les chaînes sont égales et false sinon.
    }
}
// Le constructeur a une mission primordiale: être le patron, tous les arguments doivent être présent

/*
 * public static void presentation(Chat chat) {
    String question = "Voulez vous que je miaule? (y/n)";
    boolean continuePresentation = true;
    do {
        System.out.println(question);
        Scanner saisieUtilisateur = new Scanner(System.in);
        String resp = saisieUtilisateur.next();

        if (resp.equals("y")) {
            System.out.println(chat.getName() + "miaou");
            continuePresentation = false;
            saisieUtilisateur.close();
        } else if (resp.equals("n")) {
                System.out.println("bye");
                continuePresentation = false;
                saisieUtilisateur.close();
        } else {
            question = "Je n'ai pas compris, y ou n?;
            continuePresentation = true;
        }       
    }
    while(continuePresentation);
}
 */