package chap2

object ThreadsCreation extends App {

  class MyThread extends Thread {
    override def run(): Unit = {
      println("New thread running")
    }
  }

  val thread: Thread = new MyThread()
  thread.start()
  thread.join()
  println("new thread joined")

  def thread(body: => Unit): Thread ={
    val thread = new Thread{
      override def run() = body
    }
    thread.start()
    thread
  }

  val thread2 = thread{
    Thread.sleep(1000)

  }

}
