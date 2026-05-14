plugins {
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
    google()
}

dependencies {
  implementation(kotlin("stdlib"))
}

kotlin {
    sourceSets["main"].kotlin.setSrcDirs(listOf("."))
}
