---
# Documentation: https://sourcethemes.com/academic/docs/managing-content/

title: "Testen von und mit Infrastruktur - Integration Testing done right ;)"
event: "JUG Darmstadt"
event_url: "https://www.jug-da.de/2019/12/Testen-Infrastruktur/"
location: "Darmstadt"
summary:
abstract: "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma 'Wenn etwas schiefläuft, dann so schnell wie möglich' möchte der Entwickler schon zu einem früheren Testzeitpunkt, z. B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-)Skripte etc.) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert wie erwartet.

Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfe von 3rd-Party-Libraries die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen, wie die Qualität des Infrastruktur-Codes gesichert werden kann, angefangen bei klassischen Provisionierungswerkzeugen bis hin zu Container.
"

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date: 2019-12-11T14:58:00+02:00
#date_end: 2019-06-15T14:58:00+02:00
all_day: true

# Schedule page publish date (NOT talk date).
publishDate: 2019-10-9T14:58:00+02:00

authors: []
tags: []

# Is this a featured talk? (true/false)
featured: false

# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
# Focal points: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight.
image:
  caption: ""
  focal_point: ""
  preview_only: false

# Custom links (optional).
#   Uncomment and edit lines below to show custom links.
# links:
# - name: Follow
#   url: https://twitter.com
#   icon_pack: fab
#   icon: twitter

# Optional filename of your slides within your talk's folder or a URL.
url_slides: "https://github.com/sparsick/infra-testing-talk/blob/jugda-19/slides/2019.12%20-%20JUG%20Darmstadt%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"

url_code: "https://github.com/sparsick/infra-testing-talk/tree/jugda-19"
url_pdf:
url_video:

# Markdown Slides (optional).
#   Associate this talk with Markdown slides.
#   Simply enter your slide deck's filename without extension.
#   E.g. `slides = "example-slides"` references `content/slides/example-slides.md`.
#   Otherwise, set `slides = ""`.
slides: ""

# Projects (optional).
#   Associate this post with one or more of your projects.
#   Simply enter your project's folder or file name without extension.
#   E.g. `projects = ["internal-project"]` references `content/project/deep-learning/index.md`.
#   Otherwise, set `projects = []`.
projects: []
---

<blockquote class="twitter-tweet" data-conversation="none" data-cards="hidden" data-partner="tweetdeck"><p lang="de" dir="ltr">Danke für den coolen Abend!<br>Hat Spass gemacht 😀</p>&mdash; Ralf D. Müller™ (@RalfDMueller) <a href="https://twitter.com/RalfDMueller/status/1204880724412846080?ref_src=twsrc%5Etfw">December 11, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr"><a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> präsentiert heute Infrastruktur Testing. <a href="https://twitter.com/JUG_DA?ref_src=twsrc%5Etfw">@JUG_DA</a> in <a href="https://twitter.com/TUDarmstadt?ref_src=twsrc%5Etfw">@TUDarmstadt</a> sehr lehrreich. <a href="https://t.co/MFiSyftysP">pic.twitter.com/MFiSyftysP</a></p>&mdash; Harjeet Singh (@singhffm) <a href="https://twitter.com/singhffm/status/1204836073643401216?ref_src=twsrc%5Etfw">December 11, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Und jetzt geht es weiter mit dem geselligen Teil des heutigen Abends, mit hohem Frauenanteil, und das in der IT!!! <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> <a href="https://twitter.com/aelindara?ref_src=twsrc%5Etfw">@aelindara</a> <a href="https://twitter.com/KatrinRabow?ref_src=twsrc%5Etfw">@KatrinRabow</a> (und <a href="https://twitter.com/RalfDMueller?ref_src=twsrc%5Etfw">@RalfDMueller</a>, <a href="https://twitter.com/MarcelBruch?ref_src=twsrc%5Etfw">@MarcelBruch</a>, <a href="https://twitter.com/GerdAschemann?ref_src=twsrc%5Etfw">@GerdAschemann</a> <a href="https://twitter.com/sippsack?ref_src=twsrc%5Etfw">@sippsack</a> <a href="https://twitter.com/wolkenarchitekt?ref_src=twsrc%5Etfw">@wolkenarchitekt</a> <a href="https://twitter.com/dasniko?ref_src=twsrc%5Etfw">@dasniko</a>) <a href="https://t.co/P4hM0fKaOJ">pic.twitter.com/P4hM0fKaOJ</a></p>&mdash; JUG-Darmstadt (@JUG_DA) <a href="https://twitter.com/JUG_DA/status/1204844415065509890?ref_src=twsrc%5Etfw">December 11, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">nach der <a href="https://twitter.com/hashtag/ittage?src=hash&amp;ref_src=twsrc%5Etfw">#ittage</a> ist vor der <a href="https://twitter.com/JUG_DA?ref_src=twsrc%5Etfw">@JUG_DA</a> - heute mit <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und dem <a href="https://twitter.com/embarced?ref_src=twsrc%5Etfw">@embarced</a> Architekturspicker <a href="https://t.co/Ga4LMAhXIX">pic.twitter.com/Ga4LMAhXIX</a></p>&mdash; Ralf D. Müller™ (@RalfDMueller) <a href="https://twitter.com/RalfDMueller/status/1204808222760210433?ref_src=twsrc%5Etfw">December 11, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
