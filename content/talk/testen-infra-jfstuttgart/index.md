+++
title = "Testen von und mit Infrastruktur - Integration Testing done right"
publishDate = 2019-07-04T08:23:32+01:00  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2019-07-04
all_day = true
#time_end = 2019-02-20T08:23:32+01:00

# Authors. Comma separated list, e.g. `["Bob Smith", "David Jones"]`.
authors = []

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schrei ben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma 'Wenn etwas schief läuft, dann so schnell wie möglich' möchte der Entwickler schon zu einem früheren Testzeitpunkt, z.B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schief läuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mit Hilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mit Hilfe von 3rd-Party-Libraries die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann, angefangen bei klassischen Provisionierungswerkzeugen bis hinzu Container."
abstract_short = ""

# Name of event and optional event URL.
event = "Java Forum Stuttgart"
event_url = "https://www.java-forum-stuttgart.de/de/Vortr%E4ge+von+09.50+-+10.35+Uhr.html#C2"

# Location of event.
location = "Stuttgart"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/jfstuttgart19/slides/2019.07%20-%20Java%20Forum%20Stuttgart%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/jfstuttgart19"

# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
[image]
  # Caption (optional)
  caption = ""

  # Focal point (optional)
  # Options: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight
  focal_point = ""
+++
<blockquote class="twitter-tweet"><p lang="sv" dir="ltr">Infrastruktur testen mit Sandra Parsick <a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a> <a href="https://t.co/WhR2WJBpAn">pic.twitter.com/WhR2WJBpAn</a></p>&mdash; gerdcastan (@gerdcastan) <a href="https://twitter.com/gerdcastan/status/1146690991191154688?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet"><p lang="de" dir="ltr"><a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a> <a href="https://twitter.com/the_talll?ref_src=twsrc%5Etfw">@the_talll</a> Und der nächste Talk! Bin gespannt! <a href="https://twitter.com/hashtag/klassenfahrt?src=hash&amp;ref_src=twsrc%5Etfw">#klassenfahrt</a> <a href="https://twitter.com/hashtag/tngtech?src=hash&amp;ref_src=twsrc%5Etfw">#tngtech</a> <a href="https://twitter.com/tngtech?ref_src=twsrc%5Etfw">@tngtech</a> <a href="https://t.co/QLQrVUFgvq">pic.twitter.com/QLQrVUFgvq</a></p>&mdash; Manuel Meilinger (@MMeilinger) <a href="https://twitter.com/MMeilinger/status/1146687690986930177?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr"><a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> recommends MockServer for your tests. Trust her, she knows what she is talking about. <a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a> <a href="https://t.co/o5vY6T3iAr">https://t.co/o5vY6T3iAr</a></p>&mdash; Oliver B. Fischer (@sweblogtweets) <a href="https://twitter.com/sweblogtweets/status/1146719551679356933?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">The amazing <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> talks about testing infrastructure holistically at <a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a> with a plethora of recommendations for the audience. <a href="https://t.co/sf5hALDNhR">pic.twitter.com/sf5hALDNhR</a></p>&mdash; Frank Prechtel (@FrankPrechtel) <a href="https://twitter.com/FrankPrechtel/status/1146692954783924225?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Testing of  your Infrastructure - a well done talk by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://twitter.com/hashtag/testing?src=hash&amp;ref_src=twsrc%5Etfw">#testing</a> <a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a> <a href="https://t.co/UuJngpXw2f">pic.twitter.com/UuJngpXw2f</a></p>&mdash; marfis technologies (@marfistech) <a href="https://twitter.com/marfistech/status/1146691156278939649?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Weiter gehts mit ‚Testen von mit Infrastruktur‘ von und mit der lieben <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://t.co/nEdxhlZSmx">pic.twitter.com/nEdxhlZSmx</a></p>&mdash; Latti (@Latti_Nbg) <a href="https://twitter.com/Latti_Nbg/status/1146688901383434240?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Jetzt: Testen von und mit Infrastruktur - mit <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a><br>Ich bin sehr gespannt! <a href="https://twitter.com/hashtag/jfs2019?src=hash&amp;ref_src=twsrc%5Etfw">#jfs2019</a></p>&mdash; Skyr (@_skyr) <a href="https://twitter.com/_skyr/status/1146688619056435200?ref_src=twsrc%5Etfw">July 4, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
