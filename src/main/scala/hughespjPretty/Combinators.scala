package hughespjPretty

object Combinators {

  def char[A](char: Char): Doc[A] = ???

  def comma[A]: Doc[A] = char(',')

  def brackets[A](doc: Doc[A]): Doc[A] = ???

  def fsep[A](docs: List[Doc[A]]): Doc[A] = ???

  def punctuate[A](sep: Doc[A])(docs: List[Doc[A]]): List[Doc[A]] = ???

}
