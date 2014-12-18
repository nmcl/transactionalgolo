/*
 * This class does a lot. Of course it could be refactored into a number of
 * other classes and interfaces, but it's really not that important at this
 * stage.
 */

public class Dummy
{
    public static final int VALUE = 666;

    public Dummy ()
    {
	System.out.println("Dummy constructor called in Java.");
    }

    public String toString ()
    {
	return "Dummy.toString called in Java.";
    }

    public boolean foobar (boolean res)
    {
	return false;
    }

    public static final void doDummy ()
    {
	System.out.println("Dummy.doDummy called in Java.");
    }


    public static void callFoobar (Dummy d)
    {
	System.out.println("Dummy.callFoobar returned "+d.foobar(true));
    }

    protected void someMethod ()
    {
	System.out.println("Dummy.someMethod called");
    }
}