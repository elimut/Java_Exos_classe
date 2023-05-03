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

/*public class MainApp 
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
// "index" appelé, exécuté, la méthode main sera exécutée, c'est l'index de l'index
*/


/*public class MainApp 
{
    public static void main (String[] args)
    {
        final int MAVARIABLE = 36;
        System.out.println(MAVARIABLE); 
        /*MAVARIABLE = 37;
        *System.out.println(MAVARIABLE);
        *error because const
    }
*}
*/

public class MainApp 
{
    public static void main (String[] args)
    {
        // final float PI = 3.14;
        // error
        // final double PI = 3.14;
        final float PI = 3.14f;
        System.out.println(PI);
        // https://www.sololearn.com/Discuss/749938/in-java-float-a-1-1f-what-is-this-f-stands-for
        // . Attribuez une valeur à la variable. Lorsque vous affectez un nombre à virgule flottante à un `float`, ajoutez un `f` ou `F` au nombre pour indiquer au compilateur qu'il s'agit d'une valeur à virgule flottante simple précision.
    }
}
