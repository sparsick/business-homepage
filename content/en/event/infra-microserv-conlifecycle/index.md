---
# Documentation: https://sourcethemes.com/academic/docs/managing-content/

title: "Infrastructure as Microservices - Alternativen zum Monolithen Kubernetes"
event: "Continuous Lifecycle"
event_url: "https://www.continuouslifecycle.de/lecture.php?id=9177&source=0"
location: "Mannheim"
summary:
abstract: "Es ist en Vogue Anwendungen in fachlich geschnittene Microservices zu unterteilen und in Kubernetes-Clustern zu betreiben. Streng genommen ist ein Kubernetes-Cluster ein monolithisches System, bestehend aus untrennbaren Services. Damit ist gemeint, dass die einzelnen Services nicht unabhängig voneinander betrieben bzw. ausgeschaltet werden können. Dieses Konzept erinnert stark an die 90’er mit dem Konzept großer Application-Server. Konsequent wäre es, das Betriebskonzept der Software-Architektur anzupassen: Unabhängig betreibbare Infrastruktur-Services anbieten. Wie z.B. Service-Registry, Deployment-Verteilung, Load-Balancing…

In diesem Vortrag möchten wir zeigen, wie man den Microservice-Gedanken – kleiner, abgeschlossener, spezialisierter Bausteine – auch in Infrastruktur Services umsetzen kann und dabei Alternativen zu Kubernetes aufzeigen und zu diskutieren. Wir wollen Use-Case-orientiert Lösungsskizzen vorstellen."

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date: 2019-11-13T14:48:43+02:00
#date_end: 2019-06-15T14:48:43+02:00
all_day: true

# Schedule page publish date (NOT talk date).
publishDate: 2019-06-15T14:48:43+02:00

authors: ["Sandra Parsick", "Nils Bokermann"]
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
url_slides: "https://github.com/sanddorn/InfrastructureAsMicroservice/blob/conlifecycle-19/slides/2019.11%20-%20Continuous%20Lifecycle%20-%20Infrastructure%20As%20Microservices.pdf"

url_code: "https://github.com/sanddorn/InfrastructureAsMicroservice/tree/conlifecycle-19"
url_pdf:
url_video: "https://vimeo.com/ondemand/continuouslifecycle2019/437795541"

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

Blog post, der diesen Vortrag erwähnt: https://blog.codecentric.de/en/2020/01/brave-new-container-world/

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Kicking of the next <a href="https://twitter.com/Container_Conf?ref_src=twsrc%5Etfw">@Container_Conf</a> <a href="https://twitter.com/hashtag/conli19?src=hash&amp;ref_src=twsrc%5Etfw">#conli19</a> day with <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> &amp; <a href="https://twitter.com/sanddorn?ref_src=twsrc%5Etfw">@sanddorn</a> about <a href="https://twitter.com/hashtag/infrastructure?src=hash&amp;ref_src=twsrc%5Etfw">#infrastructure</a> as <a href="https://twitter.com/hashtag/microservices?src=hash&amp;ref_src=twsrc%5Etfw">#microservices</a> w/ &amp; w/o <a href="https://twitter.com/kubernetesio?ref_src=twsrc%5Etfw">@kubernetesio</a> monolith 🤘 You need to visit <a href="https://twitter.com/devopsthde?ref_src=twsrc%5Etfw">@devopsthde</a> 😇 <a href="https://t.co/HSZGbZhAJ8">pic.twitter.com/HSZGbZhAJ8</a></p>&mdash; Jonas Hecht (@jonashackt) <a href="https://twitter.com/jonashackt/status/1194923198296539136?ref_src=twsrc%5Etfw">November 14, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="de" dir="ltr">Kubernetes einführen, das kann schiefgehen — so die Erfahrung von <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> und Nils Bokermann. Wie es erfolgreich geht und dass man am Ende sogar ohne Kubernetes auskommen kann zeigen sie in ihrem Talk auf <a href="https://twitter.com/hashtag/ConLi19?src=hash&amp;ref_src=twsrc%5Etfw">#ConLi19</a> / <a href="https://twitter.com/hashtag/ConConf19?src=hash&amp;ref_src=twsrc%5Etfw">#ConConf19</a> <a href="https://t.co/PAKOufmJ3U">pic.twitter.com/PAKOufmJ3U</a></p>&mdash; René Schönfeldt (@reneschoenfeldt) <a href="https://twitter.com/reneschoenfeldt/status/1194930317196431360?ref_src=twsrc%5Etfw">November 14, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
