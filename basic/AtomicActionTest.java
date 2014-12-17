import com.arjuna.ats.arjuna.AtomicAction;
import com.arjuna.ats.arjuna.coordinator.BasicAction;

public class AtomicActionTest
{
    public static void main (String[] args)
    {
        AtomicAction A = new AtomicAction();

        A.begin();

        A.commit();

	System.out.println("Created and commited transaction "+A);
    }
}
