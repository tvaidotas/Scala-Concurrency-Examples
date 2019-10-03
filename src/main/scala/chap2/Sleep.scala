package chap2

trait Sleep {

  def sleep (milliseconds: Int): Unit = {
    Thread.sleep(milliseconds)
  }

}
