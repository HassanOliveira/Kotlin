plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.hassan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.2")
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.5.31")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$1.6.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$1.6.10")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}