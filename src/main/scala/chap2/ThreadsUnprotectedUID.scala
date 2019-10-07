package chap2

import helpers.ToRun

object ThreadsUnprotectedUID extends ToRun {

  var uidCount = 0L
  def getUniqueId() = {
    val freshUid = uidCount + 1
    uidCount = freshUid
    freshUid
  }

  def getSynchronisedUniqueId() = this.synchronized {
    val freshUid = uidCount + 1
    uidCount = freshUid
    freshUid
  }

  def printUniqueIds(n: Int) = {
    val uids = for (i<- 0 until n) yield getUniqueId()
    log(s"Generated uids: $uids")
  }

  def printSynchronisedUniqueIds(n: Int) = {
    val uids = for (i<- 0 until n) yield getUniqueId()
    log(s"Generated uids: $uids")
  }

  // race condition
  val t = thread{printUniqueIds(5)}
  printUniqueIds(5)
  t.join()

  // no race condition
  val t2 = thread{printSynchronisedUniqueIds(5)}
  printSynchronisedUniqueIds(5)
  t2.join()

}
