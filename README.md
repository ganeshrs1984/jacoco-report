# jacoco-report
Jacoco Code Coverage 
# run jacoco-report
gradlew test -jacocoTestReport
# where to find the jacoco report
![Screenshot](code-coverage-report.PNG)
# sample coverage report
![sample coverage report](code-coverage-report.PNG)
# Congiguration - in Jacoco.gradle

## Default conguration to get code coverage report for all the files.

```groovy
jacocoTestReport {

reports {
        html.enabled = true
        xml.enabled = true
        csv.enabled = true
    }
}

test {
    finalizedBy jacocoTestReport

}
}
```
## Filter JaCoCo coverage reports with Gradle
  ### eg: To show the coverage report for Just Controller and Service 
  
```
jacocoTestReport {
//    You may also exclude a package and all of its children/subpackages this way:
//    <exclude>some/package/**/*</exclude>
    afterEvaluate {
        classDirectories = files(classDirectories.files.collect {
            println 'it.getAbsolutePath()' + it.getAbsolutePath()
                fileTree(dir: it, includes: ['**/controller/****',  '**/services/JacocoService.*'])

        })

        classDirectories.toList().each {
            println it.toString()
        }
    }

    reports {
        html.enabled = true
        xml.enabled = true
        csv.enabled = true
    }
}

//Jacoco will run all the test
//It will compare  Filtered file aginst the the .class files (build/classes/main/


test {
    finalizedBy jacocoTestReport

}

```

### Next
