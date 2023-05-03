/*
*class MainApp {
*}
*ou
*class MainApp 
*{
*}
*/




/*
*En langage orienté objet nous sommes obligé d'avoir au minimum une classe (classe minimale). Le code ne pourrait s'exécuter.
*class MainApp 
*{
*    public static void main (String[] args)
*    {
*     //Signature, publique: accessible partout, la JVM peut y avoir accès. Recherchée par Java:les arguments ou paramètres Liste de String
*    //Ce qui est dans la méthode sont des arguments
*    //Dans méthode main de type void, on peut placer des arguments. Mais Java doit reconnaître la signature.
*    //static est accessible ici
*        System.out.println("Hello You!!!");
*        System.out.println('Hello You !!!');
*    //équivalent de console.log, on doit indiquer la sortie
*    //System est un objet auquel on applique la méthode println
    }
*}
*/


/*
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        System.out.println("Hello You!!!");
*    }
*}
*/


/* 
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        System.out.println("36!!!");
*    }
*}
*/

/*
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        int maVariable = 36;
*        // décla d'une variable entier
*        // déclaration variable pas d'espace, accent, espace. Commence par une lettre ou underscore. camelCase ou snake_case
*        System.out.println(maVariable);
*        maVariable = 37;
*        System.out.println(maVariable);
*        maVariable = maVariable + 1;
*        System.out.println(maVariable);
*        autreMethode();
*        // ne fonctionne pas car dans la methode autreMethode pas de static
*    }
*    // public void autreMethode()
*    public static void autreMethode()
*    {
*        System.out.println("test");
*        // rien ne s'affiche car pas invoqué dans main, il faut l'invoquer dans la méthode main
*    }
*}
* // "index" appelé, exécuté, la méthode main sera exécutée, c'est l'index de l'index
*/


/*
*public class MainApp 
*{
*   public static void main (String[] args)
*    {
*        final int MAVARIABLE = 36;
*        System.out.println(MAVARIABLE); 
*        //MAVARIABLE = 37;
*        //System.out.println(MAVARIABLE);
*        //error because const
*    }
*}
*/

/*
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        // final float PI = 3.14;
*        // error
*        // final double PI = 3.14;
*        final float PI = 3.14f;
*        System.out.println(PI);
*        // https://www.sololearn.com/Discuss/749938/in-java-float-a-1-1f-what-is-this-f-stands-for
*        // Attribuez une valeur à la variable. Lorsque vous affectez un nombre à virgule flottante à un `float`, ajoutez un `f` ou `F` au nombre pour indiquer au compilateur qu'il s'agit d'une valeur à virgule flottante simple précision.
*    }
*}
*/

// Conditions:
/*
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        boolean value = (24 == 24);
*        System.out.println(value);
*        //renvoie true
*
*       boolean value1 = (24 === 24);
*       System.out.println(value);
*       // renvoie true
*       //comparaison d'expression
*
*        int age = 24;
*        int age1 = 20;
*        boolean value = (age == age1);
*        System.out.println(value);
*        // envoie false
*
*        int age2 = 24;
*        int age3 = 24;
*        boolean value1 = (age2 === age3);
*        System.out.println(value1);
*        // renvoie true
*        int value4 = 24;
*        if (value4 == 24){
*            System.out.println(value4);
*        }
*        // renvoie 24
*        if (value4 == 24){
*            System.out.println(value4);
*        }
*        // ne renvoie rien
*
*        int ageAd = 20;
*        if (ageAd >= 18 && ageAd < 64){
*            System.out.println(ageAd);
*        }else{
*            System.out.println("non");
*        }
*        ou
*        if (ageAd >= 18 && ageAd < 64)
*           System.out.println(ageAd);
*        else
*            System.out.println("non");
*        ou
*        String result = (ageAd >= 18 && ageAd < 64) ? "ageAd" : "non"; 
*        System.out.println(result);
*
*        //S'il est majeur, on vérifie qu'il a la majorité internationale
*        if (ageAd >= 18 && ageAd < 64){
*           System.out.println("Vous êtes majeur");
*            if(ageAd >= 21){
*                System.out.println("Vous êtes majeur dans tous les pays");   
*            }else{
*                System.out.println(" en France seulement");
*            }
*        }else{
*            System.out.println("mineur");
*        }
*
*       switch (ageAd){
*            case 17:
*                System.out.println("mineur");
*                break;
*            case 18, 19, 20:
*                System.out.println("majeur en France");
*                break;
*            default:
*                System.out.println("majeur dans tous les pays");
*                break;
*        }
*    }
*}
*/



// Boucles
/*
public class MainApp 
{
    public static void main (String[] args)
    {
        int i = 0;
        while(i != 20){
            System.out.println(i);
            // i != 2 => boucle infinie, aucune condition d'arrêt: ajout d'incrémentation ou valeur pour en sortir
            // i+=2;
            // si l'on met un break à la place de i+=2 => une seule exécution
            if (i == 10){
                break;
            }
            i++;
            // si i différent de 20, je renvoie i et si i == 10 stop
        }
        int i = 0;
        while(i != 20){
            if (i == 10){
                continue;
                // continueinstruction interrompt une itération (dans la boucle), si une condition spécifiée se produit, et continue avec l'itération suivante dans la boucle.
            }
            i++;
            System.out.println(i);
        }
    }
}
*/

/*
*public class MainApp 
*{
*    public static void main (String[] args)
*    {
*        int i = 0;
*        do{
*            i++;
*            if (i == 10){
*                continue;
*            }
*            System.out.println(i);
*        }
*        while(i != 20);
*    }
*}
*/

/*
*public class MainApp 
*{
    public static void main (String[] args)
    {
        int i = 0;
        do{
            i++;
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        while(i != 20);
    }
    // affiche les nombres pairs, continu bloque les impairs suite à la condition if
}
*/

//afficher saisie user: scanner. Pour que Java puisse lire ce que vous tapez au clavier, vous allez devoir utiliser un objet de type Scanner. Cet objet peut prendre différents paramètres. !import -> toujours en haut du code
/*import java.util.Scanner;
public class MainApp 
{
    public static void main (String[] args)
    {
        Scanner valeurDebut = new Scanner(System.in);
        // instance de scanner
        System.out.println("Veuillez saisir un entier :");
        int i = valeurDebut.nextInt();
        Scanner valeurFin = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier :");
        int fin = valeurFin.nextInt();
        valeurDebut.close();
        valeurFin.close();
        // attention à la fermeture du scanner
        
        if (i > fin){
            System.out.println("la valeur de début doit être plus petite que celle de fin");
        }
        else{
            System.out.println("Vous avez choisi: " + i +" "+ fin + ",les valeurs paires entre ces chiffres sont:");
            do{
                i++;
                if (i % 2 != 0){
                    continue;
                }
                System.out.println(i);
            }
            while(i != fin);
        }
    }
}
*/

public class MainApp 
{
    public static void main (String[] args)
    {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
