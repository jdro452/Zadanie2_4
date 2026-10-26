# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Click **Run** to execute the configured `Start application` workflow.
  The Console shows `Hello world JPWP2!`, and the program then exits normally.
  This is a console application, so no web preview or listening port is expected.
- Build and test manually with `mvn test` (the build succeeds; there are currently no active tests).
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

Java, Maven, and Java editor tooling are provided by the Java module in
`.replit`. No secrets or external services are required to run this program.
