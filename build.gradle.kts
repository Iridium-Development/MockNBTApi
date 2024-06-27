plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.iridium"
version = "1.0.2"
description = "MockNBTApi"

repositories {
    mavenCentral()
    maven("https://repo.codemc.org/repository/maven-public/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    // Dependencies that we want to shade in
    implementation("org.jetbrains:annotations:24.1.0")
    implementation("de.tr7zw:item-nbt-api:2.12.4")

    // Other dependencies that are not required or already available at runtime
    compileOnly("org.projectlombok:lombok:1.18.32")
    compileOnly("org.spigotmc:spigot-api:1.20.6-R0.1-SNAPSHOT")

    // Enable lombok annotation processing
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    // Test dependencies
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("com.github.seeseemelk:MockBukkit-v1.18:2.85.2")
}

tasks {
    // "Replace" the build task with the shadowJar task (probably bad but who cares)
    jar {
        dependsOn("shadowJar")
        enabled = false
    }

    shadowJar {
        // Remove the archive classifier suffix
        archiveClassifier.set("")
        relocate("de.tr7zw.changeme.nbtapi", "com.iridium.mocknbtapi.dependencies.nbtapi")

        minimize()
    }

    // Set UTF-8 as the encoding
    compileJava {
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform()
    }

    compileJava {
        sourceCompatibility = JavaVersion.VERSION_1_8.toString()
        targetCompatibility = JavaVersion.VERSION_1_8.toString()
    }

    compileTestJava {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
    }
}