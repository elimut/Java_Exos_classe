/**class MainApp {
*}
*ou
*class MainApp 
*{
*}
*/




/*En langage orienté objet nous sommes obligé d'avoir au minimum une classe (classe minimale). Le code ne pourrait s'exécuter.
*class MainApp 
*{
*    public static void main (String[] args)
*    {
    *Signature, publique: accessible partout, la JVM peut y avoir accès. Recherchée par Java:les arguments ou paramètres Liste de String
    *Ce qui est dans la méthode sont des arguments
    *Dans méthode main de type void, on peut placer des arguments. Mais Java doit reconnaître la signature.
    *static est accessible ici
        *System.out.println("Hello You!!!");
        *System.out.println('Hello You !!!');
    *équivalent de console.log, on doit indiquer la sortie
    *System est un objet auquel on applique la méthode println
    }
*}
*/

/*
*\n retour à la ligne
*\t tabulation
*\f nouvelle page (file)
*\r retour chariot avec saut de ligne
*\b retour en arrière
*\00 
*/

/*
public class MainApp 
{
    public static void main (String[] args)
    {
        System.out.println("Hello You!!!");
    }
}
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

public class MainApp 
{
    public static void main (String[] args)
    {
        int maVariable = 36;
        // décla d'une variable entier
        // déclaration variable pas d'espace, accent, espace. Commence par une lettre ou underscore. camelCase ou snake_case
        System.out.println(maVariable);
        // attention dans méthode main -> argument de type String attendu, affiche 36
        maVariable = 37;
        System.out.println(maVariable);
        maVariable = maVariable + 1;
        System.out.println(maVariable);
        autreMethode();
        // ne fonctionne pas car dans la methode autreMethode pas de static
    }
    // public void autreMethode()
    public static void autreMethode()
    {
        System.out.println("test");
        // rien ne s'affiche car pas invoqué dans main, il faut l'invoquer dans la méthode main
    }
}
// "index" appelé, exécuté, la méthode main sera exécuté, c'est l'index de l'index