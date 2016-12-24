The test(s) in this directory basically check that we have all of the right java libraries to build a local transaction.

To use the STM implementation from Narayana we need something similar to what will be done for Vert.x (https://issues.jboss.org/browse/JBTM-2319)
Using STM today needs annotations - a problem for Golo integration. Or inheriting from LockManager, which requires overriding a number of
methods, such as save_state and restore_state. Not exactly a simple thing for Golo developers to do.

Maybe these could be junit tests. Later ...

AtomicActionTest - starts and commits a transaction.

JTATest - starts and commits a JTA transaction. You will need to download the JTA jar from Oracle and put it into the lib directory.
