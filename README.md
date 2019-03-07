# gradle-interactive-demo
Example showing a Gradle task to request user input

## Steps to run
`$ ./gradlew askMe` and follow prompts

## Steps to reproduce error
1. Edit `gradleWrapper` value in `build.gradle` to `'5.2.1'`
2. `$ ./gradlew wrapper` to update the wrapper properties file
3. `$ ./gradlew wrapper` to download the new distribution
4. `$ ./gradlew askMe` and follow prompts