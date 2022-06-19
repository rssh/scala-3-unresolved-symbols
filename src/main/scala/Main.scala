package x

//import scala.concurrent.{Future}
//import cps.async
//import cps.CpsMonad
//import cps.CpsMonadInstanceContext
//import scala.concurrent.ExecutionContext
//import scala.concurrent.ExecutionContext.Implicits.global


//given CpsMonad[Future] with CpsMonadInstanceContext[Future] with
//  def pure[A](a:A):Future[A] = ???
//  def map[A,B](fa:Future[A])(f:A=>B):Future[B] = ???
//  def flatMap[A,B](fa:Future[A])(f:A=>Future[B]):Future[B] = ???

//given printCode: cps.macros.flags.PrintCode.type = cps.macros.flags.PrintCode;
//given printTree: cps.macros.flags.PrintTree.type = cps.macros.flags.PrintTree;

//def hello: Future[?] = {
def hello = {
  //async1[Future] {
  xtransform {
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
