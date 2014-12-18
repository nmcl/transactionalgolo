module transactional.jta

import javax.transaction.Transaction
import javax.transaction.TransactionManager

function main = |args| {

	 let tm = com.arjuna.ats.jta.TransactionManager.transactionManager()

	 tm: begin()

	 let tx1 = tm: suspend()

	 println("Created and suspended transaction "+tx1)

	 tm: begin()

	 let tx2 = tm: getTransaction()

	 tm: commit()

	 println("Committed transaction "+tx2)

	 tm: resume(tx1)

	 tm: commit()

	 println("Committed transaction "+tx1)
}