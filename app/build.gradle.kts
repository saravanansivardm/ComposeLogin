plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.compose_auth"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.compose_auth"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2024.02.02"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.02.02"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    // Android Ktx
    implementation("androidx.core:core-ktx:1.12.0")

    // Lifecycle ktx extensions
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // Jetpack Compose activity
    implementation("androidx.activity:activity-compose:1.8.2")

    // Jetpack Compose Lifecycle Support
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$2.6.0-alpha01")

    // Jetpack Compose
    implementation("androidx.compose.ui:ui:$1.3.3")
    implementation("androidx.compose.ui:ui-tooling-preview:$1.3.3")

    // Jetpack Compose Navigation Support
    implementation("androidx.navigation:navigation-compose:$2.7.7")

    // Jetpack Compose ViewModel support
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    // Material3
    implementation("androidx.compose.material3:material3:1.2.1")

    // Jetpack Compose Material icons
    implementation("androidx.compose.material:material-icons-extended:1.6.3")

    //Coil Image
    implementation("io.coil-kt:coil-compose:2.5.0")

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    implementation("com.google.firebase:firebase-analytics")
}