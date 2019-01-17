+++
title = "Testen von und mit Infrastruktur - Integration Testing done right ;)"
date = 2018-10-25T16:09:46+02:00  # Schedule page publish date.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
time_start = 2019-01-16
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mit Hilfe von Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "Softwerkskammer Jena / DevOps Thüringen"
event_url = "https://www.meetup.com/de-DE/jenadevs/events/256142812/"

# Location of event.
location = "Jena"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/swkjena_devopsthde19/slides/2019.01%20-%20Softwerkskammer%20Jena%20-%20DevOpsThDe%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/swkjena_devopsthde19"

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

Tweets zum Vortrag:

<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">MEETUP <a href="https://twitter.com/Xceptance?ref_src=twsrc%5Etfw">@Xceptance</a> <a href="https://twitter.com/JenaDevs?ref_src=twsrc%5Etfw">@JenaDevs</a> <a href="https://twitter.com/devopsthde?ref_src=twsrc%5Etfw">@devopsthde</a> ~&gt; Die allseits versierte <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> spricht wieder über <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> Weitere Hausaufgabe: <a href="https://t.co/BlrzZ13sYs">https://t.co/BlrzZ13sYs</a> + Wer mehr über Chaos Monkey &amp; Co erfahren möchte kommt zu <a href="https://twitter.com/MrBWilms?ref_src=twsrc%5Etfw">@MrBWilms</a> <a href="https://twitter.com/jugthde?ref_src=twsrc%5Etfw">@jugthde</a> nach Ilmenau <a href="https://twitter.com/rewedigitaltech?ref_src=twsrc%5Etfw">@rewedigitaltech</a> am 31.1. <a href="https://t.co/CmWwQ5yTYF">pic.twitter.com/CmWwQ5yTYF</a></p>&mdash; Benjamin Nothdurft (@DataDuke) <a href="https://twitter.com/DataDuke/status/1085631488022986752?ref_src=twsrc%5Etfw">16. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">Woohoo! 🎉🍋 <a href="https://t.co/u5XrmquU52">https://t.co/u5XrmquU52</a></p>&mdash; Citrus Framework (@citrus_test) <a href="https://twitter.com/citrus_test/status/1085669606935674883?ref_src=twsrc%5Etfw">16. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="und" dir="ltr">&lt;3 <a href="https://twitter.com/citrus_test?ref_src=twsrc%5Etfw">@citrus_test</a> <a href="https://t.co/XFz1UobnN1">https://t.co/XFz1UobnN1</a></p>&mdash; Simon (@s1hofmann) <a href="https://twitter.com/s1hofmann/status/1085662976927920128?ref_src=twsrc%5Etfw">16. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">HEUTE geht es rund bei <a href="https://twitter.com/Xceptance?ref_src=twsrc%5Etfw">@Xceptance</a> mit René + Test Automation, Oliver <a href="https://twitter.com/ITnet_TH?ref_src=twsrc%5Etfw">@ITnet_TH</a> + Open Source Preis <a href="https://t.co/fW6PeAzTpc">https://t.co/fW6PeAzTpc</a>, <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> + Integration Testing Done Right, <a href="https://twitter.com/jonashackt?ref_src=twsrc%5Etfw">@jonashackt</a> + Test-Driven Infrastructure! Bitte amelden bei <a href="https://twitter.com/hackthde?ref_src=twsrc%5Etfw">@hackthde</a> <a href="https://twitter.com/devopsthde?ref_src=twsrc%5Etfw">@devopsthde</a> <a href="https://twitter.com/Devoxx4KidsTh?ref_src=twsrc%5Etfw">@Devoxx4KidsTh</a> <a href="https://t.co/9tcSXyVkuE">pic.twitter.com/9tcSXyVkuE</a></p>&mdash; Softwerkskammer Jena (@JenaDevs) <a href="https://twitter.com/JenaDevs/status/1085624483493396480?ref_src=twsrc%5Etfw">16. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">Weiter geht‘s mit <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und <a href="https://twitter.com/hashtag/Infrastruktur?src=hash&amp;ref_src=twsrc%5Etfw">#Infrastruktur</a> <a href="https://twitter.com/hashtag/Testing?src=hash&amp;ref_src=twsrc%5Etfw">#Testing</a> beim <a href="https://twitter.com/devopsthde?ref_src=twsrc%5Etfw">@devopsthde</a> 🤟 in <a href="https://twitter.com/jenalichtstadt?ref_src=twsrc%5Etfw">@jenalichtstadt</a> bei <a href="https://twitter.com/Xceptance?ref_src=twsrc%5Etfw">@Xceptance</a> <a href="https://t.co/eBCrxZKLKM">pic.twitter.com/eBCrxZKLKM</a></p>&mdash; Jonas Hecht (@jonashackt) <a href="https://twitter.com/jonashackt/status/1085619302244515841?ref_src=twsrc%5Etfw">16. Januar 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-lang="de"><p lang="de" dir="ltr">Beide kommen (ganz bestimmt 😇) nach <a href="https://twitter.com/hashtag/Thueringen?src=hash&amp;ref_src=twsrc%5Etfw">#Thueringen</a> zu <a href="https://twitter.com/jugthde?ref_src=twsrc%5Etfw">@jugthde</a> &amp; <a href="https://twitter.com/devopsthde?ref_src=twsrc%5Etfw">@devopsthde</a> 🎉😃 <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> ist ja schon geplant, für <a href="https://twitter.com/xeraa?ref_src=twsrc%5Etfw">@xeraa</a> bauen wir noch eine <a href="https://twitter.com/hashtag/Tour?src=hash&amp;ref_src=twsrc%5Etfw">#Tour</a>, oder <a href="https://twitter.com/maik_toepfer?ref_src=twsrc%5Etfw">@maik_toepfer</a> <a href="https://twitter.com/softwerkskammer?ref_src=twsrc%5Etfw">@softwerkskammer</a> <a href="https://twitter.com/hashtag/leipzig?src=hash&amp;ref_src=twsrc%5Etfw">#leipzig</a>, <a href="https://twitter.com/JUGNBG?ref_src=twsrc%5Etfw">@JUGNBG</a>, <a href="https://twitter.com/jugffm?ref_src=twsrc%5Etfw">@jugffm</a> ...?! 🙌 <a href="https://twitter.com/hashtag/usualsuspects?src=hash&amp;ref_src=twsrc%5Etfw">#usualsuspects</a> <a href="https://twitter.com/Container_Conf?ref_src=twsrc%5Etfw">@Container_Conf</a> 🙈 <a href="https://t.co/7E484CaWYc">pic.twitter.com/7E484CaWYc</a></p>&mdash; Jonas Hecht (@jonashackt) <a href="https://twitter.com/jonashackt/status/1062743499626463233?ref_src=twsrc%5Etfw">14. November 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
