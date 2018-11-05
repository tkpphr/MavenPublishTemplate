# Maven Publish Template

## Overview
Template for publishing maven package.

## Installation

### Gradle
1. Add repository url to build.gradle(Project)
```groovy
allprojects {
    repositories {
        ...
        maven {
            ...
            url 'https://www.myget.org/F/tkpphr-test-feed/maven/'
        }
    }
}
```

2. Add dependency to build.gradle(Module)
```groovy
dependencies {
    ...
    implementation 'com.tkpphr.android:mavenpublishtemplate:1.0.0'
}
```

or

### Maven
```xml
...
<repositories>
  ...
  <repository>
    <id>tkpphr-test-feed</id>
    <url>https://www.myget.org/F/tkpphr-test-feed/maven/</url>
  </repository>
</repositories>
...
<dependencies>
  ...
  <dependency>
    <groupId>com.tkpphr.android</groupId>
    <artifactId>mavenpublishtemplate</artifactId>
    <version>1.0.0</version>
    <type>aar</type>
  </dependency>
</dependencies>
...
```

## Usage
```Java
import com.tkpphr.android.mavenpublishtemplate;

new Greeter("foo").hello(context);
```

## License
Released under the Apache 2.0 License.
See LICENSE File.