plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    ios {
        binaries.framework {
            baseName = "SeenKit"
        }
    }

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("common")
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
            }
        }
        val iosMain by getting {
            kotlin.srcDir("ios")
        }
        val androidMain by getting {
            kotlin.srcDir("android")
        }
    }
}

android {
    namespace = "graphics.seen"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}