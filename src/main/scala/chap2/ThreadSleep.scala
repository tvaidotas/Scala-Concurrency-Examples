package chap2

object ThreadSleep extends ToRun {

  val thread2 = thread {
    Thread.sleep(1000)
    log("New thread running")
    Thread.sleep(1000)
    log("Still running")
    Thread.sleep(1000)
    log("Completed")
  }
  thread2.join()
  log("New Thread Joined")

}
