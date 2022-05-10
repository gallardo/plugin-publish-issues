# plugin-publish-issues
Code in this repository help reproduce issues with gradle's plugin-publish

## Steps to reproduce
1. Clone this repo and cd into it
```
$ git clone https://github.com/gallardo/plugin-publish-issues.git
$ cd plugin-publish-issues
```
2. invoke gradle
```
$ ./gradlew init

FAILURE: Build failed with an exception.

* Where:
Build file '/home/myUser/src-local/plugin-publish-issues/build.gradle' line: 33

* What went wrong:
A problem occurred evaluating root project 'gradle-plugin-test'.
> No signature of method: build_7yn3sdxzoh612d16ifdu3v5ra.pluginBundle() is applicable for argument types: (build_7yn3sdxzoh612d16ifdu3v5ra$_run_closure5) values: [build_7yn3sdxzoh612d16ifdu3v5ra$_run_closure5@748800e0]

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 652ms
```

## Environment

```
./gradlew -version

------------------------------------------------------------
Gradle 7.4
------------------------------------------------------------

Build time:   2022-02-08 09:58:38 UTC
Revision:     f0d9291c04b90b59445041eaa75b2ee744162586

Kotlin:       1.5.31
Groovy:       3.0.9
Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
JVM:          17.0.2 (Eclipse Adoptium 17.0.2+8)
OS:           Linux 5.3.18-59.34-default amd64
```

## Notice
1. The failure isn't triggered if we comment out the `plugins` config block inside `pluginBundle`.
2. This code works if using 
```
plugins {
    ...
    id 'com.gradle.plugin-publish' version '0.21.0'
}
```
