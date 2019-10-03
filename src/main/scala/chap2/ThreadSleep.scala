package chap2

import chap2.ThreadsCreation.log

object ThreadSleep extends App with Logging {

  def thread(body: => Unit): Thread ={
    val thread = new Thread{
      override def run() = body
    }
    thread.start()
    thread
  }

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
