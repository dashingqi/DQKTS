plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = com.dashingqi.buildsrc.Versions.COMPILE_SDK

    defaultConfig {
        applicationId = com.dashingqi.buildsrc.Versions.APPLICATION_ID
        minSdk = com.dashingqi.buildsrc.Versions.MIN_SDK
        targetSdk = com.dashingqi.buildsrc.Versions.TARGET_SDK
        versionCode = com.dashingqi.buildsrc.Versions.versionCode
        versionName = com.dashingqi.buildsrc.Versions.versionName

        testInstrumentationRunner = com.dashingqi.buildsrc.Libs.TEST_RUNNER
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}