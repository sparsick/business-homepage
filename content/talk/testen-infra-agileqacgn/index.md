+++
title = "Testen von und mit Infrastruktur - Integration Testing done right ;)"
publishDate = 2019-07-16T16:09:46+02:00  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2019-07-16
all_day = true
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfevon Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "Agile QA Cologne"
event_url = "https://www.meetup.com/de-DE/agileqa-cologne/events/260724155/"

# Location of event.
location = "Köln"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/agileqacgn-19/slides/2019.07%20-%20Agile%20QA%20Cologne%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/agileqacgn-19"

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

Tweets:
<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Danke für den kurzweiligen Vortrag. Bin gespannt, was die Teamkollegen morgen dazu meinen.</p>&mdash; JK (@jaekae42) <a href="https://twitter.com/jaekae42/status/1151228139638591493?ref_src=twsrc%5Etfw">July 16, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">First talk of the evening by  <a href="https://twitter.com/groundbreakers?ref_src=twsrc%5Etfw">@groundbreakers</a> <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> at the <a href="https://twitter.com/qa_agile?ref_src=twsrc%5Etfw">@qa_agile</a> in cologne, talking about integration testing. <a href="https://t.co/60zrdRRM9d">pic.twitter.com/60zrdRRM9d</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1151168098529107971?ref_src=twsrc%5Etfw">July 16, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Full house being vierten Meetup zu Infrastruktur &amp; Testing mit <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> &amp; <a href="https://twitter.com/Kiview?ref_src=twsrc%5Etfw">@Kiview</a> 👍 <a href="https://t.co/UCAVFQAOyp">pic.twitter.com/UCAVFQAOyp</a></p>&mdash; Agile QA Cologne (@qa_agile) <a href="https://twitter.com/qa_agile/status/1151167880207245312?ref_src=twsrc%5Etfw">July 16, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Just realized, this is also a <a href="https://twitter.com/groundbreakers?ref_src=twsrc%5Etfw">@groundbreakers</a> double feature 😁 <a href="https://t.co/tcA1C5yiXJ">https://t.co/tcA1C5yiXJ</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1151167608072396800?ref_src=twsrc%5Etfw">July 16, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Again a <a href="https://twitter.com/hashtag/swkRuhrOnTour?src=hash&amp;ref_src=twsrc%5Etfw">#swkRuhrOnTour</a> double feature with <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a>, this time in cologne at the <a href="https://twitter.com/qa_agile?ref_src=twsrc%5Etfw">@qa_agile</a>! <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> <a href="https://t.co/Rm8CI9eqFq">pic.twitter.com/Rm8CI9eqFq</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1151166805232291840?ref_src=twsrc%5Etfw">July 16, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
