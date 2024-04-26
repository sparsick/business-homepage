---
# Leave the homepage title empty to use the site title
title: 'Homepage'
date: 2024-04-24
type: landing

sections:
  - block: about.biography
    id: about
    content:
      title: Über mich
      # Choose a user profile to display (a folder name within `content/authors/`)
      username: admin
  - block: collection
    id: publications
    content:
      title: Publikationen
      text: |2-
        {{% callout note %}}
        Schnelles Auffinden relevanter Inhalte durch [Filtern von Publikationen]({{< ref "/publication/_index.md" >}}).
        {{% /callout %}}
    filters:
      folders:
        - publication
      tag: ''
      category: ''
      publication_type: ''
      author: ''
      exclude_featured: false
      exclude_future: false
      exclude_past: false
    # Choose how many pages you would like to display (0 = all pages)
    count: 5
    # Choose how many pages you would like to offset by
    offset: 0
    # Page order: descending (desc) or ascending (asc) date.
    order: desc
    design:
      # Choose a view for the listings:
      view: compact
      columns: '2'
  - block: collection
    id: upcoming-talks
    content:
      title: Anstehende Vorträge
      # Page type to display. E.g. post, event, publication...
      page_type: event
      # Choose how many pages you would like to display (0 = all pages)
      count: 5
      # Filter on criteria
      filters:
        author: ""
        category: ""
        tag: ""
        exclude_featured: false
        exclude_future: false
        exclude_past: true
        publication_type: ""
      # Choose how many pages you would like to offset by
      offset: 0
      # Page order: descending (desc) or ascending (asc) date.
      order: asc
    design:
      columns: '2'
      view: list
  - block: collection
    id: past-talks
    content:
      title: Vergangene Vorträge
      # Page type to display. E.g. post, event, publication...
      page_type: event
      # Choose how many pages you would like to display (0 = all pages)
      count: 5
      # Filter on criteria
      filters:
        author: ""
        category: ""
        tag: ""
        exclude_featured: false
        exclude_future: true
        exclude_past: false
        publication_type: ""
      # Choose how many pages you would like to offset by
      offset: 0
      # Page order: descending (desc) or ascending (asc) date.
      order: desc
    design:
      columns: '2'
      view: list
  - block: experience
    id: projects
    content:
      title: Projekte
      subtitle: (Auswahl)
      # Date format for experience
      #   Refer to https://docs.hugoblox.com/customization/#date-format
      date_format: Jan 2006
      # Experiences.
      #   Add/remove as many `experience` items below as you like.
      #   Required fields are `title`, `company`, and `date_start`.
      #   Leave `date_end` empty if it's your current employer.
      #   Begin multi-line descriptions with YAML's `|2-` multi-line prefix.
      items:
      - title: "Consultant / Software Developer"
        company: Industrie (27.559 Mitarbeiter)
        company_url: ''
        company_logo:
        location: Duisburg / Remote
        date_start: '2019-09-01'
        date_end: ''
        description: |2-
          Unterstützung im Bereich Continuous Integration

          **Tätigkeit:**

          * Analyse des bestehenden Buildmanagement
          * Umsetzung von kurzfristigen Optimierungsmöglichkeiten im Buildmanagement
          * Unterstützung bei der Einführung von Azure und Docker
          * Unterstützung bei der Migration auf Azure
          * Verbesserung des Dependency Managements
          * Verbesserung des Releaseprozesses
          * Bugfixing in Maven Plguins
          * Unterstützung bei der Migration von JUnit4 auf Junit5
          * Unterstützung bei der Migration von Java 8 auf Java 11

          **Eingesetzte Technologien und Werkzeuge:** Java SE 8/11, Groovy, Eclipse RCP 4, OSGi, Docker, Azure,
          Oracle WebLogic, Jenkins, Artifactory, Maven Tycho, Jira, Confluence, BitBucket, JUnit5
   
      - title: Consultant / Software Developer
        company: Finanzdienstleister (4.100 Mitarbeiter)
        location: Neuss / Remote
        date_start: '2018-10-01'
        date_end: '2021-12-31'
        description: |2-
          Unterstützung in der Entwicklung von JVM-basierten Backend-Systemen

          **Tätigkeit:**

          * Analyse des bestehenden Buildmanagement
          * Umsetzung von kurzfristigen Optimierungsmöglichkeiten im Buildmanagement
          * Konzeption einer Platform-Lösung basierend auf Cloud-Lösungen
          * Analyse der bestehenden Architektur und CI/CD-Pipeline
          * Neuausrichtung der Architektur von Altsystemen auf Kubernetes
          * Neuentwicklung eines Backend-Systems für Aktenverwaltung basierend auf Java 11, Spring Boot, Kubernetes in der OTC
          * Neuentwicklung der CI/CD Pipeline in Zusammenspiel mit Kubernetes
          * Coaching in Java, Git, Maven, TDD und anderen Methodiken

          **Eingesetzte Technologien und Werkzeuge:** Java SE 8/11, Groovy, Hibernate, JPA, JAXB, Jersey, Spring Boot, OpenAPI, Docker, Kubernetes, OTC, Azure, Helm Charts, Terraform, Ansible, Oracle, PostrgresSQL, MongoDB, Jenkins, Maven, Jira, Confluence, Git, JUnit 5, Spock, Mockito, AssertJ, IntelliJ IDEA, Scrum
      - title: Java Developer
        company: IT Dienstleister für Automotive (300 Mitarbeiter)
        location: Düsseldorf / Remote
        date_start: '2017-10-01'
        date_end: '2018-09-30'
        description: |2-
          Unterstützung in der Entwicklung von Java-basierten Backend-Systemen für das vernetzte Fahrzeug

          **Tätigkeit:**

          * Implementierung von REST-Schnittstellen basierend auf Java 8, JAXB, JAX-RS und Jersey
          * Deployment-Automatisierung mit Ansible
          * Serverprovisionierung mit Ansible
          * Unterstützung bei der Migration von Subversion auf Git
          * Unterstützung bei der Migration von Oracle auf PostgreSQL
          * Git Schulung
          * Unterstützung bei der Einführung von Docker
          * Wahrnehmung der Rolle Scrum-Teammitglied

          **Eingesetzte Technologien und Werkzeuge:** Java SE 8, Groovy, Hibernate, JPA, JAXB, JAX-RS, Jersey,  Tomcat, Docker, H2, Oracle, PostgreSQL, Ansible, Jenkins, Maven, Jira, Confluence, Subversion, Git, BitBucket, JUnit, Mockito, Mockserver, AssertJ, LaTeX, IntelliJ IDEA  2018, Scrum

      - title: Consultant
        company: Autovermietung (200 Mitarbeiter)
        location: Isernhagen (bei Hannover) / Remote
        date_start: '2016-08-01'
        date_end: '2018-04-30'
        description: |2-
          Unterstützung im Bereich Java Entwicklung; Einführung einer Continuous Integration Umgebung

          **Tätigkeit:**

          * Einrichten einer Continuous Integration Umgebung basierend auf Gitlab, Jenkins, Nexus
          * Migration der Buildskripte von Gradle nach Maven
          * Migration von Bower nach Yarn
          * Beratung und Review: Ausbau der Continuous Integration Umgebung Richtung Continuous Delivery
          * Architekturberatung

          **Eingesetzte Technologien und Werkzeuge:** Java SE 8, Java EE, Hibernate, REST, JBoss EAP 6, JavaScript, AngularJS, Jenkins, Nexus 2/3, Gitlab, Maven, Gradle, Grunt, Bower, Yarn, Docker, VirtualBox, PostgreSQL, JUnit, Mockito
    design:
      columns: '2'
      view: list
  - block: contact
    id: contact
    content:
      title: Kontakt
      subtitle:
      # Automatically link email and phone or display as text?
      autolink: true

      # Email form provider
      #  form:
      #    provider: netlify
      #    formspree:
      #      id:
      #    netlify:
          # Enable CAPTCHA challenge to reduce spam?
      #      captcha: false

      # Contact details (edit or remove options as required)
      email: mail (at) sandra-parsick.de
      phone: +49 176 700 56 222
      address:
      #    street: 450 Serra Mall
        city: Neuss
      #    region: CA
      #    postcode: '94305'
      #    country: United States
      #    country_code: US
      #  coordinates:
      #    latitude: '37.4275'
      #    longitude: '-122.1697'
      #  directions: Enter Building 1 and take the stairs to Office 200 on Floor 2
      #  office_hours:
      #    - 'Monday 10:00 to 13:00'
      #    - 'Wednesday 09:00 to 10:00'
      appointment_url: '/rubberduck'
      contact_links:
        - icon: twitter
          icon_pack: fab
          name: DM Me
          link: 'https://twitter.com/SandraParsick'
        - icon: keybase
          icon_pack: fab
          name: sparsick
          link: 'https://keybase.io/sparsick'
    design:
      columns: '2'
---
