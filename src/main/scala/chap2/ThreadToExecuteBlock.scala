package chap2

trait ThreadToExecuteBlock {

  def thread(body: => Unit): Thread ={
    val thread = new Thread{
      override def run() = body
    }
    thread.start()
    thread
  }

}
