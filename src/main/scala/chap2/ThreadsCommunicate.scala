package chap2

import helpers.ToRun

object ThreadsCommunicate extends ToRun {

  var result: String = null
  val t: Thread = thread{
    result = "\ntitle\n" + "=" * 5
  }
  t.join()
  log(result)
}
