# Age Calculator

![Java](https://img.shields.io/badge/Java-17-brightgreen) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.1-brightgreen)

Exercise from Trybe's course to work on skills related to:
- Creating custom exception classes.
- Implementing validations that throw exceptions.
- Utilizing Spring's ExceptionHandler decorator to manage exceptions.

### Installation

To install the project's dependencies, execute the following command:

```bash
mvn install -DskipTests
```

### Running Tests

To execute all tests, use the following command:

```bash
mvn test
```

### Specific Test

To run a specific test, use the following command, replacing 'TestClassName' with the desired test
class name:

```bash
mvn test -Dtest=TestClassName
```

### Static Code Analysis

I used Checkstyle for static code analysis. To run Checkstyle manually on a project, execute the
following command:

```bash
mvn checkstyle:check
```
## Usage
<p>To use the age calculator, make a request to /calculateAge route and pass the date as query parameters. Example: /calculateAge?date=2010-03-25</p>
<p>To test any of the exceptions, make a request with an invalid date. Example: date=2010-99-99 or date=2010/03-25 or date=2010-mar-25</p>
<p>There's also an option to provide a default date. If an exception is thrown, it will return the default date. Example: /calculateAge?date=2010-99-99&orDefaultAge=0 -> will return age=0</p>
