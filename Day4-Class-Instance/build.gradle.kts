import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion

plugins {
    kotlin("jvm") version "2.3.0"
}

group = "org.days.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
//    compilerOptions {
//        languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_2)
//    }
}

tasks.test {
    useJUnitPlatform()
}