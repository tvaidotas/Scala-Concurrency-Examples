package chap2

trait Logging {
  def log(message: String): Unit = println(message)
  def warn(message: String): Unit = log("WARN: " + message)
  def error(message: String): Unit = log("ERROR: " + message)
}
