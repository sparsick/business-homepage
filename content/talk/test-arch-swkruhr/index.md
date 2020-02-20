+++
title = "Workshop: Architekturentscheidungen automatisiert überprüfen"
publishDate = 2019-12-19  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2020-02-19
all_day = true
#time_end = 2020-03-11

# Authors. Comma separated list, e.g. `["Bob Smith", "David Jones"]`.
authors = ["Sandra Parsick", "Stefan Zörner"]

# Abstract and optional shortened version.
abstract = "Nicht-manuelle Tests stellen die Qualität einer Softwarelösung auf effiziente Weise sicher und sind Standard in der Software-Entwicklung. Auch, weil die Automatisierung in der Regel früher Rückmeldung gibt zu Fehlern und anderen Unschönheiten. Der Ansatz ist auf verschiedenen funktionalen Ebenen gängig — Unit-Tests, Modul-Tests, Integrationstests ... Wäre es nicht toll, auch Aspekte Eurer Softwarearchitektur automatisch testen zu können? Was heißt es überhaupt, Eure Architektur zu testen? In diesem Workshop diskutieren wir zunächst kurz verschiedene Ansatzpunkte und Möglichkeiten dazu. Und wir räumen mit Mythen und Missverständnissen auf. So ist eine Überprüfung, ob eine Implementierung bestimmte Vorgaben einhält, zwar für einzelne Aspekte problemlos möglich. Wenn die Vorgaben nichts taugen ist das Ergebnis gleichzeitig uninteressant (und die Tests sind Verschwendung). Konsequenterweise konzentrieren wir uns anschließend auf effektive Ansätze aus dem Chaos Engineering  und Fitness Functions. Denn diese können bei richtiger Anwendung die Wirksamkeit Eurer Architekturansätze langfristig absichern. Und sie erlauben eine zielgerichtete Weiterentwicklung Eurer Softwarelösung. Interaktive Elemente und die Anwendung der Konzepte auf Eure Softwarelösungen runden den Workshop ab."
abstract_short = ""

# Name of event and optional event URL.
event = "Softwerkskammer Ruhrgebiet"
event_url = "https://www.meetup.com/de-DE/Softwerkskammer-Ruhrgebiet/events/267291454/"

# Location of event.
location = "Dortmund"

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
url_slides = "https://www.embarc.de/wp-content/uploads/2020/02/swk-ruhr_Folien_20200219_sparsick_szoerner.pdf"
url_video = ""
#url_code = "https://github.com/sparsick/testing-architecture-demo"

# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
[image]
  # Caption (optional)
  caption = ""

  # Focal point (optional)
  # Options: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight
  focal_point = ""
+++
<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Die <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> hatte heute einen super Vortrag zum Thema Architekturentscheidungen von <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a>! Durch Fitness Functions können wir jetzt alle etwas objektiver über den Zustand unserer Architekturen reden und die Handouts waren auch klasse!</p>&mdash; Frank (@sourcemess) <a href="https://twitter.com/sourcemess/status/1230242235670761473?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Very interesting and interactive work-Talk about testing software architecture by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a> <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> ! Many thanks for the great input. <a href="https://t.co/tyhjn1g88i">pic.twitter.com/tyhjn1g88i</a></p>&mdash; Teapot-418 (@Teapot4181) <a href="https://twitter.com/Teapot4181/status/1230226905011490824?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">And also <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> of course. Got swallowed by autocorrect in my phone. Sorry Sandra</p>&mdash; Tobias Struckmeier (@tobmaster) <a href="https://twitter.com/tobmaster/status/1230225794120790016?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Konzentriertes Arbeiten im <a href="https://twitter.com/hashtag/Workgarden?src=hash&amp;ref_src=twsrc%5Etfw">#Workgarden</a> bei der <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a>! Schöner informativer Workshop! Danke <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a>! <a href="https://t.co/h3kGpHZ8Fc">pic.twitter.com/h3kGpHZ8Fc</a></p>&mdash; Sven-Torben Janus (@sventorben) <a href="https://twitter.com/sventorben/status/1230222117339308033?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Nach der ersten Übung geht es spannend weiter. <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> stellt unterschiedliche Testansätze vor. <a href="https://twitter.com/hashtag/Workgarden?src=hash&amp;ref_src=twsrc%5Etfw">#Workgarden</a> <a href="https://twitter.com/hashtag/SWKRuhr?src=hash&amp;ref_src=twsrc%5Etfw">#SWKRuhr</a> <a href="https://t.co/toY0aVBb89">pic.twitter.com/toY0aVBb89</a></p>&mdash; Sven-Torben Janus (@sventorben) <a href="https://twitter.com/sventorben/status/1230205569321046016?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Nicht nur ein Vortrag, sondern auch praxisnahe Übungen mit <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a> <br><br>Schön euch heute im <a href="https://twitter.com/hashtag/Workgarden?src=hash&amp;ref_src=twsrc%5Etfw">#Workgarden</a> <a href="https://twitter.com/ConcisoIT?ref_src=twsrc%5Etfw">@ConcisoIT</a> zu sehen! <a href="https://t.co/YW1WXC4Ea7">https://t.co/YW1WXC4Ea7</a> <a href="https://t.co/Y9H7muC27U">pic.twitter.com/Y9H7muC27U</a></p>&mdash; Sebastian Neus (@sebastianneus) <a href="https://twitter.com/sebastianneus/status/1230195476143779841?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Eröffnung des <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> Meetup mit <a href="https://twitter.com/ThomasTraude?ref_src=twsrc%5Etfw">@ThomasTraude</a>, <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und <a href="https://twitter.com/StefanZoerner?ref_src=twsrc%5Etfw">@StefanZoerner</a>! <a href="https://twitter.com/hashtag/Workgarden?src=hash&amp;ref_src=twsrc%5Etfw">#Workgarden</a> ist voll ... Spannung steigt ... <a href="https://t.co/IsoqRYZh6w">pic.twitter.com/IsoqRYZh6w</a></p>&mdash; Sven-Torben Janus (@sventorben) <a href="https://twitter.com/sventorben/status/1230193484814000129?ref_src=twsrc%5Etfw">February 19, 2020</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
