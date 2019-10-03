package chap2

object ThreadsMain extends App {

  val thread: Thread = Thread.currentThread()
  val name = thread.getName
  println(s"Threads name is: $name")

}
