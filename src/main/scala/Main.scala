import scala.concurrent.{Future}
import cps.monads.FutureAsyncMonad
import cps.monads.FutureAsyncMonadAPI
import cps.async
import scala.concurrent.ExecutionContext

def hello: Future[?] = {

  given ExecutionContext = ExecutionContext.global
  given printCode: cps.macros.flags.PrintCode.type = cps.macros.flags.PrintCode;

  async {
    val a: Seq[Generic[?]] = null
    a
      .foreach { to =>
        to.mthd()
      }
  }
}

trait Generic[+T] {
  def mthd(): Generic[T] = this
}
