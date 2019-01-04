+++
title = "Testen von und mit Infrastruktur - Integration Testing done right ;)"
date = 2018-10-25T16:09:46+02:00  # Schedule page publish date.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
time_start = 2018-10-25
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfevon Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "DevOps Ruhr"
event_url = "https://www.meetup.com/de-DE/DevOps-Ruhr/events/254611963/"

# Location of event.
location = "Bochum"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/devopsruhr-18/slides/2018.10%20-%20DevOpsRuhr%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/devopsruhr-18"

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

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Test your Infrastructure with <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://twitter.com/dockerbochum?ref_src=twsrc%5Etfw">@dockerbochum</a> <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> 👍 <a href="https://t.co/U8Wt47wmEU">pic.twitter.com/U8Wt47wmEU</a></p>&mdash; Peter Rossbach (@PRossbach) <a href="https://twitter.com/PRossbach/status/1055506509923258373?ref_src=twsrc%5Etfw">25. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Happy to welcome <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> again at our <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> campus, giving a talk about integration testing <a href="https://twitter.com/hashtag/swkRuhrOnTour?src=hash&amp;ref_src=twsrc%5Etfw">#swkRuhrOnTour</a> <a href="https://twitter.com/dockerbochum?ref_src=twsrc%5Etfw">@dockerbochum</a> <a href="https://twitter.com/bee42solutions?ref_src=twsrc%5Etfw">@bee42solutions</a> <a href="https://t.co/Vv0gBKTjKz">pic.twitter.com/Vv0gBKTjKz</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1055511278427561985?ref_src=twsrc%5Etfw">25. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">It&#39;s always a joy to see <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> talking about <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> 😍 <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> <a href="https://twitter.com/bee42solutions?ref_src=twsrc%5Etfw">@bee42solutions</a> <a href="https://twitter.com/dockerbochum?ref_src=twsrc%5Etfw">@dockerbochum</a> <a href="https://t.co/mBNVJg0EuW">pic.twitter.com/mBNVJg0EuW</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1055512785294163968?ref_src=twsrc%5Etfw">25. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">Unser heutiges <a href="https://twitter.com/hashtag/Docker?src=hash&amp;ref_src=twsrc%5Etfw">#Docker</a> MeetUp auf dem <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> Campus! Mit dabei unsere Experten des heutigen Abends: <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> &amp; <a href="https://twitter.com/mZapfDE?ref_src=twsrc%5Etfw">@mZapfDE</a> 🤓 <a href="https://twitter.com/bee42solutions?ref_src=twsrc%5Etfw">@bee42solutions</a> <a href="https://t.co/cves1di1mn">pic.twitter.com/cves1di1mn</a></p>&mdash; Docker Bochum (@dockerbochum) <a href="https://twitter.com/dockerbochum/status/1055510215871922176?ref_src=twsrc%5Etfw">25. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">...und in naher Zukunft besuchen <a href="https://twitter.com/mZapfDE?ref_src=twsrc%5Etfw">@mZapfDE</a> und <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> uns unabhängig in Thüringen. Das wird (wieder) klasse! 😎🎉</p>&mdash; Benjamin Nothdurft (@DataDuke) <a href="https://twitter.com/DataDuke/status/1055584231152369664?ref_src=twsrc%5Etfw">25. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
