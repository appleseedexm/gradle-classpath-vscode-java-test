## Reproduction

Running gradle tests is  successful:

```bash 
./gradlew test
```

Executing tests of `app/src/test/java/org/example/app/MessageUtilsTest.java` from [vscode-java-test](https://github.com/microsoft/vscode-java-test) should fail.
The problem seems to be that vscode-java-test builds a classpath that contains the `ConflictingClass.java` in the `test` folder, even though we only inject the `testFixtures`.
This has complex implications when running bigger projects, i.e. Spring having conflicting beans because the classpath contains more files than necessary.


