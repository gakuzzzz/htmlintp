import org.scalatest._
import org.scalatest.matchers._
import htmlintp._

class HtmlInterpolationSpec extends FlatSpec with ShouldMatchers {

  "A HtmlInterpolation" should "build html" in {
    val name = "World"
    val html = html"<p>Hello ${name}!</p>"
    html should equal ("<p>Hello World!</p>")
  }

  it should "escape chars" in {
    val name = """W<o>r"l&d"""
    val html = html"<p>Hello ${name}!</p>"
    html should equal ("<p>Hello W&lt;o&gt;r&quot;l&amp;d!</p>")
  }

  it should "unescape raw html" in {
    val name = """<em>World</em>"""
    val html = html"<p>Hello ${raw(name)}!</p>"
    html should equal ("<p>Hello <em>World</em>!</p>")
  }

}