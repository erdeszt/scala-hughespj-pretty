package object hughespjPretty {

  sealed trait TextDetails
  case class Chr(char: Char) extends TextDetails
  case class Str(str:  String) extends TextDetails

  sealed trait AnnotationDetails[A]
  case class AnnotStart[A]() extends AnnotationDetails[A]
  case class NoAnnot[A](textDetails: TextDetails, index: Int) extends AnnotationDetails[A]
  case class AnnotEnd[A](value:      A) extends AnnotationDetails[A]

  sealed trait Doc[A]
  case class Empty[A]() extends Doc[A]
  case class NilAbove[A](doc:                 Doc[A]) extends Doc[A]
  case class TextBeside[A](annotationDetails: AnnotationDetails[A], doc: Doc[A]) extends Doc[A]
  case class Nest[A](level:                   Int, doc: Doc[A]) extends Doc[A]
  case class Union[A](left:                   Doc[A], right: Doc[A]) extends Doc[A]
  case class NoDoc[A]() extends Doc[A]
  case class Beside[A](left: Doc[A], insertSpace: Boolean, right:  Doc[A]) extends Doc[A]
  case class Above[A](top:   Doc[A], overlap:     Boolean, bottom: Doc[A]) extends Doc[A]

}
