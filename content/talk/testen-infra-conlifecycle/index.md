+++
title = "Integration Testing Done Right ;) - Testen von und mit Infrastruktur"
publishDate = 2018-07-13T16:09:46+02:00  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2018-11-14
all_day = true
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfevon Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "Continuous Lifecycle"
event_url = "https://www.continuouslifecycle.de/veranstaltung-7229-%22integration-testing-done-right%22-%E2%80%93-testen-von-und-mit-infrastruktur.html?source=0&id=7229"

# Location of event.
location = "Mannheim"

# Is this a selected talk? (true/false)
selected = false

# Projects (optional).
#   Associate this talk with one or more of your projects.
#   Simply enter the filename of your project file in `content/project/`.
#   E.g. `projects = ["deep-learning.md"]` references `content/project/deep-learning.md`.
#   Otherwise, set `projects = []`.
projects = []

# Tags (optional).
#   Set `tags = []` for no tags, or use the form `tags = ["A Tag", "Another Tag"]` for one or more tags.
tags = []

# Links (optional).
url_pdf = ""
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/conlifecycle18/slides/2018.11%20-%20Continuous%20Lifecycle%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/conlifecycle18"

# Does the content use math formatting?
math = false

# Does the content use source code highlighting?
highlight = true

# Featured image
# Place your image in the `static/img/` folder and reference its filename below, e.g. `image = "example.jpg"`.
[header]
image = ""
caption = ""

+++

Bilder zum Vortrag:
<a data-flickr-embed="true"  href="https://www.flickr.com/photos/dpunkt_verlag/44195118170/in/album-72157673807266017/" title="clc2018_84"><img src="https://live.staticflickr.com/4904/44195118170_fa4bfd28e1_z.jpg" width="640" height="428" alt="clc2018_84"></a><script async src="//embedr.flickr.com/assets/client-code.js" charset="utf-8"></script>

<a data-flickr-embed="true"  href="https://www.flickr.com/photos/dpunkt_verlag/44195118840/in/album-72157673807266017/" title="clc2018_81"><img src="https://live.staticflickr.com/4867/44195118840_4f05015392_z.jpg" width="640" height="427" alt="clc2018_81"></a><script async src="//embedr.flickr.com/assets/client-code.js" charset="utf-8"></script>

Tweets zum Vortrag:

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr"><a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> thinks about infrastructural testing at the <a href="https://twitter.com/hashtag/ContainerConf?src=hash&amp;ref_src=twsrc%5Etfw">#ContainerConf</a> 2018.<a href="https://twitter.com/hashtag/ConLi18?src=hash&amp;ref_src=twsrc%5Etfw">#ConLi18</a> <a href="https://twitter.com/hashtag/Conconf18?src=hash&amp;ref_src=twsrc%5Etfw">#Conconf18</a> <a href="https://t.co/X6nbE2Io8J">pic.twitter.com/X6nbE2Io8J</a></p>&mdash; Cloudibility (@cloudibility) <a href="https://twitter.com/cloudibility/status/1062727121859198978?ref_src=twsrc%5Etfw">14. November 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Some Tools for Testing Infrastructure<br>ServerSpec &amp; testInfra<br>by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a><a href="https://twitter.com/hashtag/ConConf18?src=hash&amp;ref_src=twsrc%5Etfw">#ConConf18</a> <a href="https://twitter.com/hashtag/ConLi18?src=hash&amp;ref_src=twsrc%5Etfw">#ConLi18</a> <a href="https://t.co/yqlHGayJKW">pic.twitter.com/yqlHGayJKW</a></p>&mdash; Oliver Lemm (@OliverLemm) <a href="https://twitter.com/OliverLemm/status/1062702586686595072?ref_src=twsrc%5Etfw">14. November 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Next Presentation &quot;Integration Testing done right – Testen von und mit Infrastruktur&quot;<br>Using Testcontainers for Testing with Infrastructure<br>by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://twitter.com/hashtag/ConLi18?src=hash&amp;ref_src=twsrc%5Etfw">#ConLi18</a> <a href="https://twitter.com/hashtag/ConConf18?src=hash&amp;ref_src=twsrc%5Etfw">#ConConf18</a> <a href="https://t.co/JJVANpF0Yk">pic.twitter.com/JJVANpF0Yk</a></p>&mdash; Oliver Lemm (@OliverLemm) <a href="https://twitter.com/OliverLemm/status/1062698876141010945?ref_src=twsrc%5Etfw">14. November 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Hearing an interesting talk about Integration Tests and how to do them the right way with really nice drawings at <a href="https://twitter.com/ConLifecycle?ref_src=twsrc%5Etfw">@ConLifecycle</a>. Thanks to <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a>! <a href="https://twitter.com/hashtag/ConLi18?src=hash&amp;ref_src=twsrc%5Etfw">#ConLi18</a> <a href="https://t.co/V6MHrAWsfM">pic.twitter.com/V6MHrAWsfM</a></p>&mdash; Moritz Reinwald (@MoritzReinwald) <a href="https://twitter.com/MoritzReinwald/status/1062698272526135296?ref_src=twsrc%5Etfw">14. November 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
