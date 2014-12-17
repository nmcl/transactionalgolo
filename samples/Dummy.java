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

    public static final void doDummy ()
    {
	System.out.println("Dummy.doDummy called in Java.");
    }
}