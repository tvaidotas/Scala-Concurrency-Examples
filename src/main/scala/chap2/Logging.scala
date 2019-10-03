package chap2

trait Logging {

  def log(message: String): Unit
  def warn(message: String) = log("WARN: " + message)
  def error(message: String) = log("ERROR: " + message)
}

class PrintLogging extends Logging {
  def log(message: String) = println(message)
}