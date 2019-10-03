package helpers

trait Sleep {

  def sleep (milliseconds: Int): Unit = {
    Thread.sleep(milliseconds)
  }

}
