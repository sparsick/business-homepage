---
title: Portfolio
summary:
date: "2020-10-01T00:00:00Z"

subtitle: " Meine Vortrags- und Workshop-Themen"
widget:  "custom"

share: false

---
{{% toc %}}

## Vorträge

### Dev Env Reloaded - Die lokale Entwicklungsumgebung neu gedacht

Yeah, eine neue Kollegin kommt ins Team. Mäh, das Onboarding wird wieder ewig dauern.
Yeah, du bekommst einen neuen Arbeitslaptop. Mäh, das Aufsetzen wird wieder ewig dauern.
Yeah, cool, ich darf einen neuen Technologiestack benutzen. Mäh, wie bekomme ich das lokal mit meinem bisherigen Stack verheiratet.

Situationen, die jede Entwicklerin innerlich zusammen zucken lassen. Oft behilft sich das Team mit Dokumentation, die nicht immer aktuell ist oder für neue Kontexte gar nicht vorhanden ist.

Dieser Vortrag stellt anhand eines gemischten Technologiestacks (Java und JavaScript) vor, wie das Team, mit bestehendem Tooling aus dem jeweiligen Stack, die Schmerzen verkleinern kann. Ausgehend davon zeigt es, wie neue Werkzeuge wie Devcontainer (basierend auf Container) und Devshell (basierend auf Nix) lokale Entwicklungsumgebungen schmerzfrei pflegbar machen können.

### Kubernetes, das unbekannte Wesen - Der Schnelleinstieg für Entwickler

Kubernetes ist omnipräsent. Entweder laufen die Anwendungen in Kubernetes oder sollen in Kubernetes laufen. Entwickler mögen sich jetzt denken "Aber was hat die Kubernetes-Infrastruktur mit mir als Entwickler zu tun?"

Mit der Einführung von Kubernetes bekommen die Entwickler aber oft die Aufgabe, neben dem Anwendungscode jetzt auch noch Deployment-Skripte in Form von Kubernetes Deskriptoren zu schreiben. Dafür brauchen sie ein Grundverständnis der Kubernetes-Komponenten.

Dieser Vortrag gibt eine Kurzeinführung, was Kubernetes ist und aus welchen Komponenten es besteht. Beim Durchgehen der Kompontenten und Konzepte steht die Sichtweise eines Entwicklers im Vordergrund. Am Ende nehmen die Zuhörer Good Practices anhand von Beispielen mit nach Hause.

### Community - Heimat für alle Nerds oder elitärer Zirkel?

Community hier, Commnity da. Viele reden von "der" Community und finden sie super toll. Für andere ist sie ein Mythos, mit dem sie nichts anfangen können, der wie ein Eliteclub von Event-Organisatoren wirkt, wo nur Auserwählte reindürfen. Kriterien für die Aufnahme: Unklar!

Was ist denn nun diese "Community" eigentlich?

Sandra Parsick engagiert sich seit mehreren Jahren in verschiedenster Art und Weise in der Community. Sie erzählt welche Formen ihr Engagement hatte und welche Erfahrungen sie dabei gemacht hat - gute wie schlechte. Auch muss Community-Arbeit nicht immer etwas mit IT zu tun haben.

### Raus aus der Wartungshölle ... zumindest ein bißchen
Irgendwann trifft es mal jeden. Anwendungen veralten automatisch, egal, ob ein oder zehn Jahre alt, ob sie "fertig" entwickelt sind oder nicht. Die Gründe sind vielschichtig: Die Programmiersprache entwickelt sich weiter, Bibliotheken brauchen ein Update, Good Practices entwickeln sich weiter. Diese Wartungsarbeiten werden nicht gerne gemacht, da sie zum Schein unnötige Aufwände erzeugen und zum Teil recht stupide sind. Ignoriert die Entwicklerin sie, dann sammelt sie automatisch technische Schulden und die Aufwände sind in der Zukunft höher und bei Sicherheitslücken schmerzhafter.

Dieser Vortrag zeigt, was alles unter Wartungsarbeiten zu verstehen ist und in welche Probleme Unternehmen laufen können, wenn sie es unterlassen. Außerdem stellt es Vorgehensweise und Werkzeuge vor, die bei Wartungsarbeiten helfen können und somit zumindest den stupiden Teil reduzieren.

### Kubernetes Developer Survival Kit
Immer mehr Entwicklerinnen schreiben Anwendungen, die später in einem Kubernetes Cluster laufen sollen. Was kann dabei so schwierig sein? Angefangen "Wie strukturiere ich meine Repositories?", "Wo lege ich meinen Code für das Deployment ab (Containerfiles, Helm Charts, Config Values)?",  "Was muss bei der Entwicklung der Anwendung beachtet werden?",  "Wie bekomme ich den Code lokal getestet?", "Wie bekomme ich mit,  was im Test-Cluster passiert?"

Dieser Vortrag geht am Beispiel einer Java-Anwendung die typischen Entwicklungschritte von der Ablage im VCS bis hin zum Deployment auf einem Cluster aus Sicht einer Entwicklerin durch.

### Per Shell durch die Techie-Galaxie / A Guide to the Shell Galaxy
*Deutsch*

Die Shell ist oft die schnellere Antwort auf viele Probleme im Techie-Alltag. Dieser Vortrag geht typische Techie Alltagsituationen durch und zeigt wie die Shell da helfen kann. Angefangen, bei der Auswahl von Shell und Terminal-Emulator bis hin zur Demonstration einiger Werkzeuge für die Shell. Dieser Talk ist für Techies aller Erfahrungsstufen. Ich zeige euch mein Setup, das sich seit einiger Zeit bewährt hat. Am Ende ist auch noch etwas Zeit für Tool-Austausch mit euch.

*English*

The shell is often the quicker answer to many problems in everyday techie life. This lecture goes through typical everyday techie situations and shows how the shell can help. Starting with the selection of shell and terminal emulator up to the demonstration of some tools for the shell.

This talk is for techies of all experience levels. I will show you my setup, which has proven itself for some time.

### Infrastructure as Code - Muss man nicht testen, Hauptsache es läuft
Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und
automatisiert. Klassische Betriebsabteilungen mutieren auf einen Schlag zu Entwicklungsabteilungen und müssen programmieren, um an ihre
Infrastruktur zu kommen.
Doch ist auch allen Beteiligten klar, dass sie zu professionellen Programmierern geworden sind? Wenn man sich Entwicklungsprozess und Code
anschaut, erinnern beide stark an die Fricklermentalität der 2000er: Juhuu, es läuft irgendwie, kein VCS, keine Qualitätssicherung mit Test oder
Review.
Wenn es sich stark nach “normaler” Softwareentwicklung anfühlt, warum dann auch nicht die Best Practices und Lessons Learned der letzten 30
Jahren auf Infrastructure as Code adaptieren und somit die Qualität erhöhen? Müssen die frisch gebackenen OpsDevs die alten Fehler der Devs
wiederholen? Kann man Infrastruktur-Code vielleicht sogar testgetrieben entwickeln?
Dieser Vortrag lädt zu einer Zeitreise ein, welche Best Practices in der Softwareentwicklung zur einer
höheren Qualtität geführt haben und wie diese Erkenntisse helfen können, die Entwicklung von Infrastruktur-Code qualitativ hochwertiger zu
machen

### Ich packe meinen Testtoolkoffer und nehme mit... - Testwerkzeuge für den Entwickleralltag
Tests sind das Hauptkommunikationsmittel von Entwicklern über den Code. Mit Tests kommuniziert man auch noch mit dem nächsten Entwickler, nachdem man das Projekt verlassen hat. Tests sind eine lebende Spezifikation des Codes, den sie testen. Man sollte sie mindestens so sauber halten, wie den Produktionscode - wenn nicht sauberer.

Doch wer hat die Aussage "Das kann man nicht testen" oder "Den Test kann man nicht schöner schreiben" noch nicht gehört? Oft basieren diese Aussagen darauf, dass man den Großteil des Arsenals der Testwerkzeuge, die uns Java-Entwicklern inzwischen zur Verfügung stehen, noch nicht kennt.

Neben JUnit, gibt es viele weitere Testwerkzeuge, die den Entwickleralltag beim Testschreiben vereinfachen können. Dieser Vortrag gibt einen Überblick über nicht so bekannte Features von JUnit 5 und stellt nicht so bekannte Testwerkzeuge vor, mit denen das Schreiben von Tests wieder Spaß macht.

### Infrastructure as Microservices - Alternativen zum Monolithen Kubernetes (Co-Sprecher: Nils Bokermann)
Es ist en Vogue Anwendungen in fachlich geschnittene Microservices zu unterteilen und in Kubernetes-Clustern zu betreiben. Streng genommen ist ein Kubernetes-Cluster ein monolithisches System, bestehend aus untrennbaren Services. Damit ist gemeint, dass die einzelnen Services nicht unabhängig voneinander betrieben bzw. ausgeschaltet werden können. Dieses Konzept erinnert stark an die 90’er mit ihren großer Application-Server. Konsequent wäre es, das Betriebskonzept der Software-Architektur anzupassen: Unabhängig betreibbare Infrastruktur-Services anbieten, wie z.B. Service-Registry, Deployment-Verteilung, Load-Balancing…
In diesem Vortrag möchten wir zeigen, wie man den Microservice-Gedanken kleiner, abgeschlossener, spezialisierter Bausteine auch in Infrastruktur Services umsetzen kann und dabei Alternativen zu Kubernetes aufzeigen und zu diskutieren. Wir wollen Use-Case-orientiert Lösungsskizzen vorstellen.


### Testen von und mit Infrastruktur - "Integration Testing done right" 😉 / Testing and Infrastructure
*Deutsch*

Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma "Wenn etwas schiefläuft, dann schnell wie möglich" möchte der Entwickler schon zu einem früheren Testzeitpunkt, z.B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft. Zudem macht die Infrastruktur nicht beim Anwendungscode halt. Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und automatisiert. Auch bei diesem Code möchte der Entwickler sicher gehen können, dass er so funktioniert wie erwartet.
Dieser Vortrag zeigt anhand einer Java-Anwendung, wie man mithilfe von 3rd-Party-Libraries die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen. Darüber hinaus, wird darauf eingegangen, wie die Qualität des Infrastruktur-Codes gesichert werden kann, angefangen bei klassischen Provisionierungswerkzeugen bis hin zu Container.

*English*

Nowadays software does not run in isolation, but interacts with other systems. Applications communicate with each other using different protocols, which means they are using different infrastructure components.  When testing, developers often face the question how they can write tests in such a way that they are independent of a certain infrastructure setup. In most cases this part of the software is tested rather late, often during some final end-to-end tests. However in a micro services architecture it is very important to follow the paradigm "If something goes wrong, then as fast as possible". Developers should know as early as possible, ideally during developer tests, if there are problems with the infrastructure. Infrastructure and code are not strictly separate entities anymore. Instead, infrastructure is developed, created and automated with the help of code (provisioning scripts, docker files, shell scripts, etc.) This code also deserves to be tested.
My talk will show how to effectively write integration tests that verify code interacting with infrastructure without requiring the same infrastructure to be present during the test. We will then discuss how to assure the quality of code that generates infrastructure - both for classical provisioning tool and for containers.

### JUnit5 + AssertJ = Besser lesbare Tests
Gute lesbare Tests zu schreiben ist gar nicht so einfach. Mit dem Gespann JUnit5 und AssertJ wird es zum Kinderspiel. In dieser Session zeigt Sandra euch, welche Feature von JUnit5 und AssertJ euch helfen können besser lesbare Tests zu schreiben.  Wir gehen Schritt für Schritt die Features der Beiden durch und zum Schluss werden wir eine alte Testcodebasis mit dem gelernten Wissen umbauen.

### Gib dem Entwickler seine Code Kata - What the heck is Software Craftsmanship?  (Co-Sprecher: Benjamin Nothdurft)
Die Software Craftmanship ist eine Bewegung in der Softwareentwicklung, die als Ziel hat, das Entwickeln von Software mehr als Handwerk denn als Ingenieurdisziplin . Die Bewegung beruht auf vier Prinzipien: Clean Code, Übung, Lebenslanges Lernen und Voneinander Lernen.  In unserem Vortrag mit zahlreichen Beispielen und Bildern möchten wir Euch den Ursprung, einen Abriss der Entwicklungshistorie, den aktuellen Stand sowie alle Formen der Partizipation wie Code Retreats, Hackergarten, Lean Coffees und Code Katas aufzeigen und Euch für einen stärkeren Zusammenhalt begeistern, sodass auch Ihr bessere Software Crafter werden könnt.

### Es muss nicht immer gleich Docker sein - IT Automation, die zu einem passt
Docker ist in aller Munde und wird gerne als Allheilösung für Deployment Probleme propagiert. Das führt zu der Annahme, automatisierte Deployments wären nur mit Docker möglich, obwohl Provisionierungswerkzeuge wie Ansible Lösungen außerhalb der Container-Welt anbieten. Deren Einsatz wird oft gar nicht in Betracht gezogen, weil irgendwann - in Ferner Zukunft - doch Docker im Unternehmen eingesetzt werden soll. Die Automatisierung wird immer weiter verschoben, weil der Aufwand in einem Schritt zu groß ist, obwohl  Ansible mit wenig Mühe in der Gegenwart helfen könnte. Die Verwirrung wird dadurch vergrößert, dass die Einsatzszenarien von Provisionierungswerkzeugen und Container-Technologien fälschlicherweise vermischt und somit als Konkurrenz betrachtet werden.
Dieser Vortrag erklärt anhand von Ansible und Docker worin sich ein Provisionierungswerkzeug von einer Container-Technologie unterscheidet. Es wird gezeigt, wie Ansible auf dem Weg zu einer Dockerisierung der Infrastruktur jetzt schon Probleme lösen kann und wie ein gemeinsamer Einsatz beider Technologien die Vorteile beider Welten kombiniert.

### Ansible für Entwickler - Konfigurationsmanagement nicht nur für Ops / Ansible for Developers - Configuration Management not only for Ops

*Deutsch*

Das automatisierte Konfigurieren von Servern ist dank Orchestrierungswerkzeuge wie Puppet und Chef heute kein Problem mehr. Doch eignen sich diese Werkzeuge wenig für die regelmäßige Softwareverteilung von typischen Java Webapplikationen. Ansible hat dieses Problem erkannt und liefert Lösungen für das Konfigurationsmanagement und für die Softwareverteilung aus einer Hand.
Dieser Vortrag erklärt am Beispiel einer Infrastruktur für eine Java Webapplikation die Funktionsweise von Ansible. Dabei wird sowohl auf die Serverkonfiguration wie auch auf das Deployment der Anwendung eingegangen. Zusätzlich wird gezeigt, warum Ansible vor allem für Entwickler interessant sein kann. Dabei wird beschrieben, wie Continuous Deployment auch in einer klassischen Unternehmungsstruktur umsetzbar ist.

*English*

Today, the automated server configuration isn't a problem anymore with provisioning tools like Puppet and Chef. But these tools aren't designed for continuous deployment of, for example,  typical java web applications. Ansible identifies this problem and provides a solution for both topics, configuration management and continuous deployment.
This talks explains how Ansible works by a classical infrastrastructe for Java web application. It shows how server configuration and deployment are automated by Ansible and why Ansible is particulary interesting for developers.


### Continuous Database Integration mit Flyway / Continuous Database Integration with Flyway
*Deutsch*

Skripte für relationale Datenbanken werden von Entwicklern gerne stiefmütterlich behandelt.
Beim ersten Release können sie dank ORM Frameworks generiert werden. Doch spätestens beim zweiten Release, müssen Datenbankmigrationskripte geschrieben werden. Sie werden dann gerne an Tickets an gehangen, per Email verteilt, in Release Notes versteckt etc. Irgendwann gibt es keinen Überblick mehr, welche Datenbankskripte zur welcher Softwareversion gehören. Im Vortrag wird darauf eingegangen, warum eine Einbindung von Datenbankskripte in den Continuous Integration Prozess erstrebenswert ist, wie  Datenbankskripte automatisiert getestet werden können und welche Voraussetzungen, nicht nur technischer Natur, dafür geschaffen werden müssen. Anhand einer Java-Anwendung wird zusätzlich gezeigt, wie Flyway dabei helfen kann.

*English*

Developers often neglect scritpts for relational databases.  For the first release, they are generated by the ORM framework. But at the lastest during the second release, developers have to write the database migration scripts by themself. At this point the mess begins: the migration script are attached on tickets in the ticket system; they are shared via emails; maybe they are hidden in release notes and so on. At some point the overview, which migration script is for which software version is lost.
This talk shows, why it is important to include database scripts in your continuous integration process and which conditions, not only technical,  have to be defined. A demo, based on a Java web application, shows how Flyway can support in this challenge.

## Workshops

### Continuous Integration für Infrastructure As Code
Mittlerweile wird die Infrastruktur immer mehr mithilfe von Code (Provisionierungsskripte, Dockerfiles, (Shell-) Skripte etc. ) beschrieben und
automatisiert. Klassische Betriebsabteilungen mutieren auf einen Schlag zu Entwicklungsabteilungen und müssen programmieren, um an ihre
Infrastruktur zu kommen.
Doch ist auch allen Beteiligten klar, dass sie zu professionellen Programmierern geworden sind? Wenn man sich Entwicklungsprozess und Code
anschaut, erinnern beide stark an die Fricklermentalität der 2000er: Juhuu, es läuft irgendwie, kein VCS, keine Qualitätssicherung mit Test oder
Review.
Wenn es sich stark nach “normaler” Softwareentwicklung anfühlt, warum dann auch nicht die Best Practices und Lessons Learned der letzten 30
Jahren auf Infrastructure as Code adaptieren und somit die Qualität erhöhen? Müssen die frisch gebackenen OpsDevs die alten Fehler der Devs
wiederholen? Kann man Infrastruktur-Code vielleicht sogar testgetrieben entwickeln?
Dieser Workshop geht mit den Teilnehmern die  Good Practices und Lessons Learned aus der klassischen Softwareentwicklung durch und zeigt wie diese sich auf Infrastructure As Code adaptieren lassen.


### Testen mit Infrastruktur - "Integration Testing done right" 😉
Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma "Wenn etwas schiefläuft, dann schnell wie möglich" möchte der Entwickler schon zu einem früheren Testzeitpunkt, z.B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft.

Dieser Workshop zeigt anhand einer Java-Anwendung, wie man mithilfe der Bibliotheken Mockserver und Testcontainer die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen.

### Ansible für Java-Entwickler

Das automatisierte Konfigurieren von Servern ist dank Orchestrierungswerkzeuge wie Puppet und Chef heute kein Problem mehr. Doch eignen sich diese Werkzeuge wenig für die regelmäßige Softwareverteilung von typischen Java Webapplikationen. Ansible hat dieses Problem erkannt und liefert Lösungen für das Konfigurationsmanagement und für die Softwareverteilung aus einer Hand. Dieser Workshop erklärt am Beispiel einer Infrastruktur für eine Java Webapplikation die Funktionsweise von Ansible. Die Teilnehmer lernen Schritt für Schritt wie eine Serverkonfiguration wie auch auf das Deployment der Java-Webanwendung mit Ansible automatisiert wird.


## Sprecher Bio

*Deutsch*

Sandra Parsick ist Java Champion und ist als freiberufliche Softwareentwicklerin und Consultant im Java-Umfeld tätig. Seit 2008 beschäftigt sie sich mit agiler Softwareentwicklung in verschiedenen Rollen.
Ihre Schwerpunkte liegen im Bereich der Java Enterprise Anwendungen, Cloud und in der Automatisierung von Softwareentwicklungsprozessen.
Darüber schreibt sie gerne Artikel und spricht gerne auf Konferenzen.
In ihrer Freizeit engagiert sie sich in verschiedenen Programmkomitees und Community-Gruppen.

*English*

Sandra Parsick is a Java Champion and works as a freelance software developer and consultant in the Java environment. She has been involved in agile software development in various roles since 2008.
Her focus is on Java enterprise applications, cloud and the automation of software development processes.
She enjoys writing articles about this and speaking at conferences.
In her spare time, she is involved in various program committees and community groups.

## Sprecher Foto

[Download](/media/speaker-photo-parsick-1000x1385.jpg)


<!-- ## Links -->

<!-- ## Foto -->
