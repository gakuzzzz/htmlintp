# htmlintp is HTML Interpolation

## usage

```scala
import htmlintp._

val name = "<em>World</em>"

val html = html"<p>Hello $name !</p>"
html should equal ("<p>Hello &lt;em&gt;World&lt;/em&gt; !</p>")

val unescaped = html"<p>Hello ${raw(name)} !</p>"
unescaped should equal ("<p>Hello <em>World</em> !</p>")
```

You may use this for xml.
