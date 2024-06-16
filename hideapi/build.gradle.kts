plugins {
    id("com.android.library")
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