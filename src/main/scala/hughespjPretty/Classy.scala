package hughespjPretty

import spire.math.Rational
import hughespjPretty.Combinators._

object Classy {

  case class PrettyLevel(value: Int) extends AnyVal

  object PrettyLevel {
    val Normal: PrettyLevel = PrettyLevel(0)
  }

  trait Pretty[A] {

    def pPrintPrec[Ann](prettyLevel: PrettyLevel, precedence: Rational, value: A): Doc[Ann] = {
      pPrint(value)
    }

    def pPrint[Ann](value: A): Doc[Ann] = {
      pPrintPrec(PrettyLevel.Normal, 0, value)
    }

    def pPrintList[Ann](prettyLevel: PrettyLevel, values: List[A]): Doc[Ann] = {
      val printListStructure = punctuate[Ann](comma).andThen(fsep).andThen(brackets)
      val prettyValues       = values.map(pPrintPrec[Ann](prettyLevel, 0, _))

      printListStructure(prettyValues)

    }
  }

}
