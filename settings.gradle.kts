pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "littlekt-low-res-template"
include("game")

enableFeaturePreview("VERSION_CATALOGS")