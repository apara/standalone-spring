standalone-spring
=================

Standalone Spring example with SLF4J as a bonus

This is an example of a standalone Spring application with it's own main method.  

This application initializes the context and starts the bean.

### Highlights
1. Create a context from all the 'spring wiring' contexts
1. Demonstrate invoking another component
2. Minimal code to start a stand alone spring application
3. Enable logging via SLF4J with proper bridges installed

To execute:

```
mvn clean package exec:java
```

Expected output:

```
12:25:54.810 [com.standardset.spring.Launcher.main()] DEBUG Launcher - Hello World!
```
