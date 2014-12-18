import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

public class JTATest
{
    public static void main (String[] args) throws Throwable
    {
        TransactionManager tm = com.arjuna.ats.jta.TransactionManager.transactionManager();

        tm.begin();

        Transaction tx1 = tm.suspend();

	System.out.println("Created and suspended transaction "+tx1);

        tm.begin();

	Transaction tx2 = tm.getTransaction();

        tm.commit();

	System.out.println("Committed transaction "+tx2);

	tm.resume(tx1);

        tm.commit();

	System.out.println("Committed transaction "+tx1);
    }
}
