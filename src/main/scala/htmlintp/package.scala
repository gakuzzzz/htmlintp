package object htmlintp {

  def raw(value: String) = RawHtml(value)

  @inline implicit def htmlintp(s: StringContext) = new HtmlInterpolationString(s)

}
