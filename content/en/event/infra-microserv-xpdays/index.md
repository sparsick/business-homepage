---
# Documentation: https://sourcethemes.com/academic/docs/managing-content/

title: "Infrastructure as Microservices - Alternativen zum Monolithen Kubernetes"
event: "XP Days Germany"
event_url: "https://www.xpdays.de/2019/sessions/139-infrastructure-as-microservices-alternativen-zum-monolithen-kubernetes.html"
location: "Filderstadt/Stuttgart"
summary:
abstract: "Es ist en Vogue Anwendungen in fachlich geschnittene Microservices zu unterteilen und in Kubernetes-Clustern zu betreiben. Streng genommen ist ein Kubernetes-Cluster ein monolithisches System, bestehend aus untrennbaren Services. Damit ist gemeint, dass die einzelnen Services nicht unabhängig voneinander betrieben bzw. ausgeschaltet werden können. Dieses Konzept erinnert stark an die 90’er mit dem Konzept großer Application-Server. Konsequent wäre es, das Betriebskonzept der Software-Architektur anzupassen: Unabhängig betreibbare Infrastruktur-Services anbieten. Wie z.B. Service-Registry, Deployment-Verteilung, Load-Balancing…

In diesem Vortrag möchten wir zeigen, wie man den Microservice-Gedanken – kleiner, abgeschlossener, spezialisierter Bausteine – auch in Infrastruktur Services umsetzen kann und dabei Alternativen zu Kubernetes aufzeigen und zu diskutieren. Wir wollen Use-Case-orientiert Lösungsskizzen vorstellen."

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
date: 2019-11-07T14:48:43+02:00
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
url_slides: "https://github.com/sanddorn/InfrastructureAsMicroservice/blob/xpdays-19/slides/2019.11%20-%20XP%20Days%20Germany%20-%20Infrastructure%20As%20Microservices.pdf"

url_code: "https://github.com/sanddorn/InfrastructureAsMicroservice/tree/xpdays-19"
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
<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Alternatives to Kubernetes by <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and <a href="https://twitter.com/sanddorn?ref_src=twsrc%5Etfw">@sanddorn</a> at <a href="https://twitter.com/hashtag/xpdays19?src=hash&amp;ref_src=twsrc%5Etfw">#xpdays19</a> <a href="https://t.co/MYEo7EvIwQ">pic.twitter.com/MYEo7EvIwQ</a></p>&mdash; Thorsten Brunzendorf (@thbrunzendorf) <a href="https://twitter.com/thbrunzendorf/status/1192396841939349505?ref_src=twsrc%5Etfw">November 7, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>


<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr"><a href="https://twitter.com/hashtag/xdde19?src=hash&amp;ref_src=twsrc%5Etfw">#xdde19</a> .<a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> and her colleague on why you don&#39;t need k8s everytime 😁 &quot;just use the building Blocks you really need&quot;. Happy to have her a <a href="https://twitter.com/softwerkskammer?ref_src=twsrc%5Etfw">@softwerkskammer</a> Nuremberg tonight. <a href="https://twitter.com/hashtag/swknbg?src=hash&amp;ref_src=twsrc%5Etfw">#swknbg</a> <a href="https://t.co/YVHrqio2vz">pic.twitter.com/YVHrqio2vz</a></p>&mdash; Marco Emrich (@marcoemrich) <a href="https://twitter.com/marcoemrich/status/1192396553669021696?ref_src=twsrc%5Etfw">November 7, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
