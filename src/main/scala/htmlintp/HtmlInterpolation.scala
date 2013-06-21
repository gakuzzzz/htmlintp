package htmlintp

private[htmlintp] case object LastParameter

case class RawHtml(value: String)

class HtmlInterpolationString(val s: StringContext) extends AnyVal {

  import scala.xml.Utility.escape
  def html(params: Any*) = {
    s.parts.zipAll(params, "", LastParameter).foldLeft(new StringBuilder((s.parts.map(_.length).sum * 1.5).toInt)) {
      case (builder, (previousPart, LastParameter))  => builder ++= previousPart
      case (builder, (previousPart, RawHtml(param))) => builder ++= previousPart ++= param
      case (builder, (previousPart, param))          => builder ++= previousPart ++= escape(param.toString)
    }.toString
  }
}
