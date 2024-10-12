<p align="center">
    <h1 align="center">CRUDMONGO</h1>
</p>
<p align="center">
    <em><cod❯CRUD API for  Mongo DB</code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/kchaudhari0/crudMongo?style=flat&logo=opensourceinitiative&logoColor=white&color=fbff00" alt="license">
	<img src="https://img.shields.io/github/last-commit/kchaudhari0/crudMongo?style=flat&logo=git&logoColor=white&color=fbff00" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/kchaudhari0/crudMongo?style=flat&color=fbff00" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/kchaudhari0/crudMongo?style=flat&color=fbff00" alt="repo-language-count">
</p>
<p align="center">
		<em>Built with the tools and technologies:</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/-Swagger-%23Clojure?style=flat&logo=swagger&logoColor=white" alt="Swagger">
    <img src="https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=fff" alt="Docker">
    <img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?logo=mongodb&logoColor=white" alt="MongoDB">
    <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff" alt="Docker">
    <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white" alt="IntelliJIDEA">
</p>

<br>

#####  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
    - [ Prerequisites](#-prerequisites)
    - [ Installation](#-installation)
    - [ Usage](#-usage)
    - [ Tests](#-tests)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

<code>❯ CRUD application for Mongo DB</code>

---

##  Features

<code>❯ REPLACE-ME</code>

---

##  Repository Structure

```sh
└── crudMongo/
    ├── electronics_products.csv
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

---

##  Modules

<details closed><summary>.</summary>

| File | Summary |
| --- | --- |
| [mvnw](https://github.com/kchaudhari0/crudMongo/blob/main/mvnw) |

</details>

<details closed><summary>src.main.java.com.test.crudMongo</summary>

| File | Summary |
| --- | --- |
| [Product.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/Product.java) |
| [ProductService.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/ProductService.java) |
| [ProductRepository.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/ProductRepository.java) |
| [CrudMongoApplication.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/CrudMongoApplication.java) |
| [DataLoader.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/DataLoader.java) |
| [ProductController.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/main/java/com/test/crudMongo/ProductController.java) |
</details>

<details closed><summary>src.test.java.com.test.crudMongo</summary>

| File | Summary |
| --- | --- |
| [CrudMongoApplicationTests.java](https://github.com/kchaudhari0/crudMongo/blob/main/src/test/java/com/test/crudMongo/CrudMongoApplicationTests.java) |
</details>

---

##  Getting Started

###  Prerequisites

**Java**: `17 Latest`

###  Installation

Build the project from source:

1. Clone the crudMongo repository:
```sh
❯ git clone https://github.com/kchaudhari0/crudMongo
```

2. Navigate to the project directory:
```sh
❯ cd crudMongo
```

3. Install the required dependencies:
```sh
❯ mvn clean install
```
4. Crete a colllection in Mongo DB inside a DB and replace the DB name , username and Password in properties file.

```
 Collection name: products
```

###  Usage

To run the project, execute the following command using normal mode:

```sh
❯ java -jar target/myapp.jar

OR 

❯ mvn spring-boot:run
```
To run the project, execute the following command using Docker mode:

```sh
❯ docker build -t crudMongo:latest .
```
And
```sh
❯ docker run -p 8081:8081 crudMongo:latest
```
To run the project without Git clone and using Docker

```sh
❯ docker pull kchaudhari0/crud-mongo-app

❯ docker run -p 8081:8081 kchaudhari0/crud-mongo-app
```
###  Tests

Execute the test suite using the following command:

```sh
❯ mvn test
```
Open API specfication can be found at:

```sh
❯ Swagger-ui URL : http://localhost:8081/api-docs
❯ Api-Doc URL : http://localhost:8081/v3/api-docs
```

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/kchaudhari0/crudMongo/issues)**: Submit bugs found or log feature requests for the `crudMongo` project.
- **[Submit Pull Requests](https://github.com/kchaudhari0/crudMongo/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/kchaudhari0/crudMongo/discussions)**: Share your insights, provide feedback, or ask questions.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/kchaudhari0/crudMongo
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/kchaudhari0/crudMongo/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=kchaudhari0/crudMongo">
   </a>
</p>
</details>

---

##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

---