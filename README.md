# Petit
> A simple link shortener.

[![made-with-java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/en/java/)

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
    * [Built With](#built-with)
* [Getting Started](#getting-started)
    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
    * [Running](#Running)
* [Contact](#contact)
* [Contributing](#contributing)



<!-- ABOUT THE PROJECT -->
## About The Project
Petit is a simple API that creates shorter links, developed in order to study Java and Spring Framework.

### Built With
This work uses:
* [MongoDB](https://www.mongodb.com/golang)
* [Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/)
* [Maven](https://maven.apache.org/guides/)


<!-- GETTING STARTED -->
## Getting Started

Follow pass-by-pass to install the project in your machine.

### Prerequisites

Have Installed MongoDB on your machine.
Have Installed Maven on your machine.

### Installation

Clone repository
```sh
git clone https://github.com/AliceTrinta/petit
```

### Running

Firste step: create a database called "petit" on your MongoDB, with one collection called "url". If you need to change the database configurations, just go to *appication.properties*.

Second step: run the PetitApplication.
```sh
petit
     |
     ---src
           |
           ---main
                  |
                  ---java
                         |
                         ---com.example.petit
                                             |
                                             ---PetitApplication
```

Third step: I recommend to use Postman, in order to access the POST endpoint.

The endpoints are listed above:
```sh
POST - http://localhost:8080/short?url={url}

Expected:
{
    "originalURL": "url",
    "shortURL": "address:port/{shortTerm}",
    "timesShortened": int,
    "timesAccessed": int
}
```
```sh
GET - http://localhost:8080/{shortTerm}
```

<!-- CONTACT -->
## Contact

Alice Trinta – [@malicetrinta](https://www.instagram.com/malicetrinta/) – maria.trinta@aluno.cefet-rj.br

[https://www.researchgate.net/profile/Maria_Alice_Lima2/publications](https://www.researchgate.net/profile/Maria_Alice_Lima2/publications)
Project Link: [https://github.com/AliceTrinta/petit](https://github.com/AliceTrinta/petit)



<!-- CONTRIBUTING -->
## Contributing

1. Fork it (<https://github.com/AliceTrinta/petit>)
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
