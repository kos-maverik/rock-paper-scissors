# Rock Paper Scissors

This is an implementation of a Rock Paper Scissors game, using Java.

## Getting Started

### Prerequisites

- JDK >= 1.8
- Maven

### Installing

The application can be started directly from `Application::main`, or using `mvn`.

For the latter option, first create the executable jar:
```
mvn package
```

Then run the program, by running either:

```
mvn exec:java
```

or:
```
java -jar target/RockPaperScissors-1.0.jar 
```

## Code style and choices

Under all packages, there is an interface or an abstract class that can be extended to introduce extra rules, or even a completely different game.

For simplicity, no additional libraries were used - except for JUnit. For example that means no dependency injection or Lombok.

The code is documented with examples, design pattern references and suggestions for extensions.
