---
# Documentation: https://sourcethemes.com/academic/docs/managing-content/

title: "Integration-Testing richtig gemacht: Testen von und mit Infrastruktur"
event: "IT Tage 2019"
event_url: "https://www.ittage.informatik-aktuell.de/programm/2019/integration-testing-richtig-gemacht-testen-von-und-mit-infrastruktur/"
location: "Frankfurt am Main"
summary:
abstract: "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma 'Wenn etwas schiefläuft, dann so schnell wie möglich' möchte der Entwickler schon zu einem früheren Testzeitpunkt, z. B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-)Skripte etc.) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert wie erwartet.

Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfe von 3rd-Party-Libraries die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen, wie die Qualität des Infrastruktur-Codes gesichert werden kann, angefangen bei klassischen Provisionierungswerkzeugen bis hin zu Container.
"

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date: 2019-12-10T14:58:00+02:00
#date_end: 2019-06-15T14:58:00+02:00
all_day: true

# Schedule page publish date (NOT talk date).
publishDate: 2019-06-15T14:58:00+02:00

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
url_slides: "https://github.com/sparsick/infra-testing-talk/blob/ittage-19/slides/2019.12%20-%20IT-Tage%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"

url_code: "https://github.com/sparsick/infra-testing-talk/tree/ittage-19"
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
<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">...mal sehen, ob ich meine bewährte Test-Strategie jetzt ändern werde 😇 <a href="https://t.co/LXEfz6KHK4">pic.twitter.com/LXEfz6KHK4</a></p>&mdash; Nils Hartmann 🌻 (@nilshartmann) <a href="https://twitter.com/nilshartmann/status/1204352863650140160?ref_src=twsrc%5Etfw">December 10, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
