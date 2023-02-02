plugins {
    id("jdbc")
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.h2database:h2:2.1.214")
        classpath("org.postgresql:postgresql:42.5.1")
    }
}
