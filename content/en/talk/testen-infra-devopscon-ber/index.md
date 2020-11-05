---
# Documentation: https://sourcethemes.com/academic/docs/managing-content/

title: "Testen von und mit Infrastruktur - Integration Testing done right ;)"
event: "DevOpsCon Berlin"
event_url: "https://devopscon.io/continuous-delivery-automation/testen-von-und-mit-infrastuktur-integration-testing-done-right/"
location: "Remote"
summary:
abstract: "Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma 'Wenn etwas schiefläuft, dann so schnell wie möglich' möchte der Entwickler schon zu einem früheren Testzeitpunkt, z. B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-)Skripte etc.) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert wie erwartet.

Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfe von 3rd-Party-Libraries die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen, wie die Qualität des Infrastruktur-Codes gesichert werden kann, angefangen bei klassischen Provisionierungswerkzeugen bis hin zu Container.
"

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date: 2020-10-13T00:00:00 # - 2020-06-11
#date_end: 2020-10-15T14:58:00+02:00
all_day: true

# Schedule page publish date (NOT talk date).
publishDate: 2020-01-15T00:58:00+02:00

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
url_slides: "https://github.com/sparsick/infra-testing-talk/blob/devopsconberlin-20/slides/2020.10%20-%20DevOpsCon%20Berlin%20-%20Testen%20von%20und%20mit%20Infrastruktur.pdf"

url_code: "https://github.com/sparsick/infra-testing-talk/tree/devopsconberlin-20"
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
