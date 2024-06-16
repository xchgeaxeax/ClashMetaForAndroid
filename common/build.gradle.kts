plugins {
    kotlin("android")
    id("com.android.library")
}

dependencies {
    compileOnly(project(":hideapi"))

    implementation(libs.kotlin.coroutine)
    implementation(libs.androidx.core)
}
android{
    compileSdk = 34
    buildToolsVersion = "34.0.0"
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }
    }
}