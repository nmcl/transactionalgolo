module transactional.basic

import com.arjuna.ats.arjuna.ObjectType
import com.arjuna.ats.arjuna.AtomicAction

function main = |args| {

	 println("Recoverable type is "+RECOVERABLE())

	 let timeout = NO_TIMEOUT()

	 println("Transactional timeout value is "+timeout)

	 let transaction = AtomicAction()

	 transaction: begin()

	 println("Created transaction "+transaction: get_uid())

	 transaction: commit()

}