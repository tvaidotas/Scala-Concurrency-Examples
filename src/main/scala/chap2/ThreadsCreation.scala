package chap2

import helpers.ToRun

object ThreadsCreation extends ToRun {

  class MyThread extends Thread {
    override def run(): Unit = {
      println("New thread running")
    }
  }

  val thread: Thread = new MyThread()
  thread.start()
  thread.join()
  println("new thread joined")

}
