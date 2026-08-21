class A // super class
{
    int i;
    A(String str) //superclass constructor
    {
        System.out.println(" Welcome to "+str);
    }
    void show() //superclass method
    {
        System.out.println(" Thank You!");
    }
}
class B extends A
{
    int i; // hides the superclass variable 'i'.
    B(int a, int b) // subclass constructor
    {
        super("Java Programming"); // invoking superclass constructor
        super.i=a; //accessing superclass member variable
        i=b;
    }
    void show()
    {
        System.out.println(" i in superclass : "+super.i);
        System.out.println(" i in subclass : "+i);
        super.show(); // invoking superclass method
    }
}

public class superclass_const1
{
    public static void main(String[] args)
    {
        B obj = new B(10, 20);
        obj.show();
    }
}