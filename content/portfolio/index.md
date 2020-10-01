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

### Testen mit Infrastruktur - "Integration Testing done right" 😉
Heutzutage läuft eine Software nicht für sich alleine, sondern agiert mit Anderen. Die Kommunikation erfolgt meist über verschiedene Protokolle, sprich über verschiedene Infrastruktur-Komponenten. Gerade beim Testen stellt sich die Frage, wie kann der Entwickler Tests so schreiben, dass sie von einem bestimmten Infrastruktur-Setup unabhängig sind. Meistens gelingt es nicht und dann wird dieser Teil der Software erst spät bei den End-2-End-Tests geprüft. Doch gerade mit Microservices und dem Paradigma "Wenn etwas schiefläuft, dann schnell wie möglich" möchte der Entwickler schon zu einem früheren Testzeitpunkt, z.B. bei Entwicklertests, erfahren, wenn bei diesem Teil der Software etwas schiefläuft.

Dieser Workshop zeigt anhand einer Java-Anwendung, wie man mithilfe der Bibliotheken Mockserver und Testcontainer die Infrastruktur in den Tests der Anwendung einbinden kann, ohne sich gleich von einer bestimmten Infrastruktur abhängig zu machen.

## Sprecher Bio

*Deutsch*

Sandra Parsick ist als freiberufliche Softwareentwicklerin und Consultant im Java-Umfeld tätig. Seit 2008 beschäftigt sie sich mit agiler Softwareentwicklung in verschiedenen Rollen. Ihre Schwerpunkte liegen im Bereich der Java Enterprise Anwendungen, agilen Methoden, Software Craftsmanship und in der Automatisierung von Softwareentwicklungsprozessen. Darüber schreibt sie gerne Artikel und  spricht gerne auf Konferenzen.
In ihrer Freizeit engagiert sich Sandra Parsick in der Softwerkskammer Ruhrgebiet, einer Regionalgruppe der Software Craftmanship Community im deutschsprachigen Raum. Seit 2019 ist sie Mitglied im Oracle Groundbreaker Ambassador Programm.

*English*

Sandra Parsick works as freelance software developer and consultant in the Java environment. Since 2008 she occupies herself with agile software development in various roles. Her main focuses are on Java enterprise applications, Agile Methods, Software Craftmanship and on the automation of the software development processes. She likes to talk on conferences and write articles about it. She is in the organization team of Softwerkskammer Ruhrgebiet, member of the Javaland program commitee and member in Oracle Groundbreaker Ambassador Program.


<!-- ## Links -->

<!-- ## Foto -->
