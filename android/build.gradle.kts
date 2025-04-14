// build.gradle.kts (raíz del proyecto)

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Añade esta línea para Firebase
        classpath("com.google.gms:google-services:4.4.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
