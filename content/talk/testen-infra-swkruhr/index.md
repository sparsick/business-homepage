+++
title = "Testen von und mit Infrastruktur - Integration Testing done right ;)"
publishDate = 2018-06-13T16:09:46+02:00  # Schedule page publish publishDate.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date = 2018-08-07
#time_end = 2018-06-13T16:09:46+02:00

# Abstract and optional shortened version.
abstract = "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastrukturkomponenten. Gerade beim Testen stellt sich die Frage, wie der Entwickler Tests so schreiben kann, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma - Wenn etwas schiefläuft, dann so schnell wie möglich - möchte der Entwickler schon zu einem früheren Testzeitpunkt, zum Beispiel bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert, wie erwartet. Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfevon Third Party Librarys die Infrastruktur in den Tests der Anwendung einbinden kann ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen wie die Qualität des Infrastruktur-Codes gesichert werden kann. "
abstract_short = ""

# Name of event and optional event URL.
event = "Softwerkskammer Ruhrgebiet"
event_url = "https://www.softwerkskammer.org/activities/bo-aug-18"

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
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/swk-ruhr/slides/2018.08%20-%20SWK%20Ruhr%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"
url_video = "https://www.youtube.com/watch?v=tA1dEkk_SAQ"
url_code = "https://github.com/sparsick/infra-testing-talk/tree/swk-ruhr"

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

<blockquote class="twitter-tweet" data-lang="de"><p lang="en" dir="ltr">In August, we had our very own <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> give a talk about &quot;Integration Testing Done Right&quot; at the <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> campus in Bochum. You can now find the recording of the talk on Youtube: <a href="https://t.co/fCpyWJYuxM">https://t.co/fCpyWJYuxM</a> <a href="https://twitter.com/hashtag/swkRuhrAtHome?src=hash&amp;ref_src=twsrc%5Etfw">#swkRuhrAtHome</a></p>&mdash; Softwerkskammer.ruhr (@swk_ruhr) <a href="https://twitter.com/swk_ruhr/status/1055735517109719040?ref_src=twsrc%5Etfw">26. Oktober 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">&quot;Integration testing done right&quot; by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a>. Test your infra, drop the crippling lock in! Featuring testing methods, linters and hand crafted slides that couldn&#39;t be more perfect 😍<br>👏 for filling that room!<br>🙏 <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> <a href="https://twitter.com/jetbrains?ref_src=twsrc%5Etfw">@jetbrains</a> <a href="https://twitter.com/GitKraken?ref_src=twsrc%5Etfw">@GitKraken</a> <a href="https://t.co/4c5xUzuui1">pic.twitter.com/4c5xUzuui1</a></p>&mdash; Michael Arndt (@MeneDev) <a href="https://twitter.com/MeneDev/status/1026938500581662723?ref_src=twsrc%5Etfw">August 7, 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">. <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> has a guest appearance in our largest-yet <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> meetup. Talk is about integration tests and infrastructure tests, held by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a>! <a href="https://t.co/G7hUNks2PJ">pic.twitter.com/G7hUNks2PJ</a></p>&mdash; Matthias Rottländer (@faradaxian) <a href="https://twitter.com/faradaxian/status/1026894726836961282?ref_src=twsrc%5Etfw">August 7, 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">And no talk about testing without mentioning <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> 😎🐳 <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://t.co/pLboQLYm59">pic.twitter.com/pLboQLYm59</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1026893664474292227?ref_src=twsrc%5Etfw">August 7, 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Integration vs Integrated tests is the new hot shit nowadays 😎. <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> talking about testing at <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> at our <a href="https://twitter.com/GDataSoftwareAG?ref_src=twsrc%5Etfw">@GDataSoftwareAG</a> campus. cc <a href="https://twitter.com/holgerGP?ref_src=twsrc%5Etfw">@holgerGP</a> <a href="https://twitter.com/BenediktRitter?ref_src=twsrc%5Etfw">@BenediktRitter</a> <a href="https://t.co/cMuRuf9a4y">pic.twitter.com/cMuRuf9a4y</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1026892148959051777?ref_src=twsrc%5Etfw">August 7, 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">And now we are happy to welcome <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> at the <a href="https://twitter.com/swk_ruhr?ref_src=twsrc%5Etfw">@swk_ruhr</a> with her talk about testing of infrastructure. <a href="https://twitter.com/hashtag/testing?src=hash&amp;ref_src=twsrc%5Etfw">#testing</a> <a href="https://twitter.com/hashtag/docker?src=hash&amp;ref_src=twsrc%5Etfw">#docker</a> <a href="https://twitter.com/hashtag/workingatgdata?src=hash&amp;ref_src=twsrc%5Etfw">#workingatgdata</a> <a href="https://t.co/fn83NO8dQW">pic.twitter.com/fn83NO8dQW</a></p>&mdash; G DATA Global (@GDataSoftwareAG) <a href="https://twitter.com/GDataSoftwareAG/status/1026888336449970177?ref_src=twsrc%5Etfw">August 7, 2018</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
