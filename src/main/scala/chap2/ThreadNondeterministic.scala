package chap2

import helpers.ToRun

object ThreadNondeterministic extends ToRun {

  val t = thread{log("New Thread Running")}

  log("...")
  log("...")

  t.join()
  log("New Thread Joined")

}
