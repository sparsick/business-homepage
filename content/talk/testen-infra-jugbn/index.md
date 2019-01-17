+++
title = "Testen von und mit Infrastruktur - Integration Testing done right ;)"
date = 2018-10-25T16:09:46+02:00  # Schedule page publish date.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
time_start = 2019-01-08
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfevon Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "JUG Bonn"
event_url = "https://www.meetup.com/de-DE/JUG-Bonn/events/255097835/"

# Location of event.
location = "Bonn"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/jugbonn-19/slides/2019.01%20-%20JUG%20Bonn%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/jugbonn-19"

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

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Thx to <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and <a href="https://twitter.com/berndruecker?ref_src=twsrc%5Etfw">@berndruecker</a> for coming &amp; your great talks and to <a href="https://twitter.com/leanix_net?ref_src=twsrc%5Etfw">@leanix_net</a> for the fantastic hosting. Thx to the 59 (!) guests (counted by me). Hope to see you all at the 20th of march for our <a href="https://twitter.com/JavaLandConf?ref_src=twsrc%5Etfw">@JavaLandConf</a> Afterparty, again <a href="https://twitter.com/leanix_net?ref_src=twsrc%5Etfw">@leanix_net</a></p>&mdash; JUG Bonn (@JUGBonn) <a href="https://twitter.com/JUGBonn/status/1085253712426254336?ref_src=twsrc%5Etfw">15. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Great JUG meetup at <a href="https://twitter.com/JUGBonn?ref_src=twsrc%5Etfw">@JUGBonn</a> with talks from <a href="https://twitter.com/berndruecker?ref_src=twsrc%5Etfw">@berndruecker</a> and <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a>, thanks for the shortwhile and instructive evening :)</p>&mdash; Markus Schlichting (@madmas) <a href="https://twitter.com/madmas/status/1082756204974276608?ref_src=twsrc%5Etfw">8. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Testing distributed systems is easy said no one ever. Next talk about <a href="https://twitter.com/hashtag/testing?src=hash&amp;ref_src=twsrc%5Etfw">#testing</a> with and without infrastructure by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> during <a href="https://twitter.com/JUGBonn?ref_src=twsrc%5Etfw">@JUGBonn</a> <a href="https://twitter.com/hashtag/Meetup?src=hash&amp;ref_src=twsrc%5Etfw">#Meetup</a> at <a href="https://twitter.com/leanix_net?ref_src=twsrc%5Etfw">@leanix_net</a> office. <a href="https://twitter.com/hashtag/Bonn?src=hash&amp;ref_src=twsrc%5Etfw">#Bonn</a> <a href="https://twitter.com/hashtag/Startup?src=hash&amp;ref_src=twsrc%5Etfw">#Startup</a> <a href="https://twitter.com/hashtag/Tech?src=hash&amp;ref_src=twsrc%5Etfw">#Tech</a> <a href="https://t.co/K6QkNrN2f8">pic.twitter.com/K6QkNrN2f8</a></p>&mdash; André Christ (@christ_andre) <a href="https://twitter.com/christ_andre/status/1082728705317916672?ref_src=twsrc%5Etfw">8. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
