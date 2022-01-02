+++
title = "Workshop: Die Wirksamkeit Eurer Architektur automatisiert testen"
publishDate = 2019-12-08  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2020-03-09
all_day = true
time_end = 2020-03-11

# Authors. Comma separated list, e.g. `["Bob Smith", "David Jones"]`.
authors = ["Sandra Parsick", "Stefan Zörner"]

# Abstract and optional shortened version.
abstract = "Nicht-manuelle Tests stellen die Qualität einer Softwarelösung auf effiziente Weise sicher und sind Standard in der Software-Entwicklung. Auch weil die Automatisierung in der Regel zu Fehlern und anderen Unschönheiten früher Rückmeldung gibt. Der Ansatz ist auf verschiedenen funktionalen Ebenen gängig — Unit-Tests, Modul-Tests, Integrationstests…  Wäre es nicht toll, auch Aspekte Eurer Softwarearchitektur automatisch testen zu können? Was heißt es überhaupt, Eure Architektur zu testen? In diesem Workshop diskutieren wir zunächst kurz verschiedene Ansatzpunkte und Möglichkeiten dazu. Und wir räumen mit Mythen und Missverständnissen auf. So ist eine Überprüfung, ob eine Implementierung bestimmte Vorgaben einhält, zwar für einzelne Aspekte problemlos möglich, wenn aber die Vorgaben nichts taugen ist das Ergebnis gleichzeitig uninteressant (und die Tests sind Verschwendung). Konsequenterweise konzentrieren wir uns anschließend auf effektive Ansätze aus dem Chaos Engineering und Fitness Functions. Denn diese können bei richtiger Anwendung die Wirksamkeit Eurer Architekturansätze langfristig absichern. Sie erlauben zudem eine zielgerichtete Weiterentwicklung Eurer Softwarelösung. Anders als typische Literatur über Evolutionäre Architekturen hören wir nicht da auf, wo es konkret wird, sondern zeigen Real World-Beispiele und Implementierungsoptionen im Freiflug. Interaktive Elemente und die Anwendung der Konzepte auf Eure Softwarelösungen runden den Workshop ab."
abstract_short = ""

# Name of event and optional event URL.
event = "Software Architecture Summit"
event_url = "https://software-architecture-summit.de/domain-driven-design/die-wirksamkeit-eurer-architektur-automatisiert-testen/"

# Location of event.
location = "München"

# Is this a selected talk? (true/false)
selected = false

# Projects (optional).
#   Associate this talk with one or more of your projects.
#   Simply enter your project's folder or file name without extension.
#   E.g. `projects = ["deep-learning"]` references
#   `content/project/deep-learning/index.md`.
#   Otherwise, set `projects = []`.
projects = []

# Slides (optional).
#   Associate this page with Markdown slides.
#   Simply enter your slide deck's filename without extension.
#   E.g. `slides = "example-slides"` references
#   `content/slides/example-slides.md`.
#   Otherwise, set `slides = ""`.
slides = ""

# Tags (optional).
#   Set `tags = []` for no tags, or use the form `tags = ["A Tag", "Another Tag"]` for one or more tags.
tags = []

# Links (optional).
url_pdf = ""
url_slides = "https://www.embarc.de/wirksamkeit-architektur-automatisiert-testen-sandra-parsick-stefan-zoerner/"
url_video = ""
url_code = "https://github.com/sparsick/testing-architecture-demo/tree/archsummitmunich20"

# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
[image]
  # Caption (optional)
  caption = ""

  # Focal point (optional)
  # Options: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight
  focal_point = ""
+++


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Thank you very much <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a> for your interesting Workshop about architecture test-automation at <a href="https://twitter.com/SoftwArchSummit?ref_src=twsrc%5Etfw">@SoftwArchSummit</a> ! And many thanks for giving me the opportunity to do live <a href="https://twitter.com/hashtag/sketchnotes?src=hash&amp;ref_src=twsrc%5Etfw">#sketchnotes</a> in maxi size 😊 <a href="https://t.co/82eliAOls9">pic.twitter.com/82eliAOls9</a></p>&mdash; Teapot-418 (@Teapot4181) <a href="https://twitter.com/Teapot4181/status/1237418641689399297?ref_src=twsrc%5Etfw">March 10, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Wow! Amazing <a href="https://twitter.com/hashtag/GraphicalRecording?src=hash&amp;ref_src=twsrc%5Etfw">#GraphicalRecording</a> by <a href="https://twitter.com/Teapot4181?ref_src=twsrc%5Etfw">@Teapot4181</a>. Thank you for making <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a> experience available beyond the conference with your <a href="https://twitter.com/hashtag/sketchnotes?src=hash&amp;ref_src=twsrc%5Etfw">#sketchnotes</a>. <a href="https://twitter.com/hashtag/sharingIsCaring?src=hash&amp;ref_src=twsrc%5Etfw">#sharingIsCaring</a> <a href="https://t.co/O6pBu0XCbU">https://t.co/O6pBu0XCbU</a></p>&mdash; Cosima Laube (@gazebo_c) <a href="https://twitter.com/gazebo_c/status/1237438279026343936?ref_src=twsrc%5Etfw">March 10, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Wie steht es um die Qualität Eurer Architektur? Wie ihr sie ganz automatisch testen lassen könnt, zeigen Euch <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> &amp; <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a> im Nachmittagsworkshop! <a href="https://twitter.com/hashtag/SoftwareArchitectureSummit?src=hash&amp;ref_src=twsrc%5Etfw">#SoftwareArchitectureSummit</a> <a href="https://t.co/qfzzICHnmu">pic.twitter.com/qfzzICHnmu</a></p>&mdash; Softw. Arch. Summit (@SoftwArchSummit) <a href="https://twitter.com/SoftwArchSummit/status/1237404107884896257?ref_src=twsrc%5Etfw">March 10, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
