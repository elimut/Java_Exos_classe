public class Chevre extends Animal {
    private boolean aChauve;
    
    public Chevre(String type, String cri, int patte, boolean queue, boolean chauve ){
        super(type, cri, patte, queue);
    }
}
// The extends keyword extends a class (indicates that a class is inherited from another class).In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:subclass (child) - the class that inherits from another classsuperclass (parent) - the class being inherited fromTo inherit from a class, use the extends keyword.

// The super keyword refers to superclass (parent) objects.It is used to call superclass methods, and to access the superclass constructor.The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.