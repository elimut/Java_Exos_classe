// public class App {
//     public static void main(String[] args) {
//         System.out.println("Salut");
//     }
// }
/*
*construction d'une classe
* création fichier .java, le nom sera donné à la classe. Chaque fichier correspond à une classe. Cela rend le code plus robuste, et maintenable
*La classe a une portée, pour la construction d'une classe, on commence toujours par préciser la **portée**:
*- **public**: classe accessible partout depuis mon application,
*- **private**: accessible que depuis le fichier,
*- ...
*suivi de class, type, qui permet de construire un objet comme étant une classe
*suivi du nom du fichier, nom de la classe
*suivi d'accolades car objet
*obligation nom de fichier et nom de classe
*void -> pour aucun type dans méthode main
c'est le point de départ du programme, le point d'entrée
*/

/*
 * compilation:
 * javac ./App.java => fichier ext .class
 */

// Création d'instances de la classe Chat
/*
 *  public class App {
    public static void main(String[] args) {
        Chat tom = new Chat();
        Chat david = new Chat();
    }
}
 */
// Exécution App.java : Le chat fait miaou-miaou Chat@372f7a8d => identifiant de l'instance de Chat. Le nom et id de l'instance sont uniques.
// Chaque instance de chat aura un emplacement dans la mémoire qui lui est dédié, d'où l'id. Ces espaces sont différents, donc chacun peut faire une action différente de l'autre en même temps.

public class App {
    public static void main(String[] args) {
        Chat c = new Chat("David", 55, true);
        Chat felix = new Chat("Felix", 44, false);
        System.out.println(c.mAge);
        // 55
        // System.out.println(c.mName);
        // error the fiel Cht.mName is not visible car en private = encapsulé
    }
}
// Le constructeur a une mission primordiale: être le patron, tous les arguements doivent être présent