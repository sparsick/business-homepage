+++
title = "Testing and Infrastructure"
date = 2019-02-18T23:14:07+01:00  # Schedule page publish date.
draft = false

# Talk start and end times.
#   End time can optionally be hidden by prefixing the line with `#`.
time_start = 2019-05-27
#time_end = 2019-02-18T23:14:07+01:00

# Authors. Comma separated list, e.g. `["Bob Smith", "David Jones"]`.
authors = []

# Abstract and optional shortened version.
abstract = "Nowadays software don't run in isolation, but interacts with other systems. Apps communicate with each other using different infrastructure components. When testing, developers often face the question of how they can write tests in such a way that they are independent of a certain setup. In most cases this part of the software is tested rather late, often during some final end-to-end tests. However, it is very helpful to follow the paradigm 'If something goes wrong, then as fast as possible'. Developers should know as early as possible, if there are problems with infrastructure. Furthermore, infrastructure is also developed and created with the help of code. This also deserves to be tested. My talk will show how to effectively write integration tests that verify code interacting with infrastructure without requiring the same infrastructure. We will then discuss how to assure the quality of code that generates infrastructure - both for classical provisioning tool and for containers."
abstract_short = ""

# Name of event and optional event URL.
event = "GR8Conf"
event_url = "https://gr8conf.eu/talks/757"

# Location of event.
location = "Kopenhagen/DK"

# Is this a selected talk? (true/false)
selected = false

# Projects (optional).
#   Associate this talk with one or more of your projects.
#   Simply enter your project's folder or file name without extension.
#   E.g. `projects = ["deep-learning"]` references
#   `content/project/deep-learning/index.md`.
#   Otherwise, set `projects = []`.
projects = []

# Slides (optional).
#   Associate this page with Markdown slides.
#   Simply enter your slide deck's filename without extension.
#   E.g. `slides = "example-slides"` references
#   `content/slides/example-slides.md`.
#   Otherwise, set `slides = ""`.
slides = ""

# Tags (optional).
#   Set `tags = []` for no tags, or use the form `tags = ["A Tag", "Another Tag"]` for one or more tags.
tags = []

# Links (optional).
url_pdf = ""
url_slides = "https://github.com/sparsick/infra-testing-talk/blob/gr8conf19/slides/2019.05%20-%20Gr8Conf-%20Testing%20and%20Infrastructure.pdf"
url_video = ""
url_code = "https://github.com/sparsick/infra-testing-talk/tree/gr8conf19"

# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
[image]
  # Caption (optional)
  caption = ""

  # Focal point (optional)
  # Options: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight
  focal_point = ""
+++

Some tweets:

<blockquote class="twitter-tweet" data-partner="tweetdeck"><p lang="en" dir="ltr">Happy to see <a href="https://twitter.com/SandraParsick?ref_src=twsrc%5Etfw">@SandraParsick</a> talking about using <a href="https://twitter.com/testcontainers?ref_src=twsrc%5Etfw">@testcontainers</a> for database testing in her <a href="https://twitter.com/gr8conf?ref_src=twsrc%5Etfw">@gr8conf</a> talk (even with <a href="https://twitter.com/spockframework?ref_src=twsrc%5Etfw">@spockframework</a> extension example!) 😎 <a href="https://twitter.com/hashtag/swkRuhrOnTour?src=hash&amp;ref_src=twsrc%5Etfw">#swkRuhrOnTour</a> <a href="https://t.co/CeLhOrmnwk">pic.twitter.com/CeLhOrmnwk</a></p>&mdash; Kevin Wittek (@Kiview) <a href="https://twitter.com/Kiview/status/1133029010408181760?ref_src=twsrc%5Etfw">May 27, 2019</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
