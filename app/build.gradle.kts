plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")

}

android {

    lint{
        checkReleaseBuilds = false
    }

    namespace = "com.zeroone.sisstudentapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zeroone.sisstudentapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
//        lint {
//            baseline = file("lint-baseline.xml")
//        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.play.services.location)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(files("libs/mysql-connector-java-5.1.46-bin.jar"))
    implementation (libs.cardview)
    implementation (libs.recyclerview)
    implementation (libs.play.services.auth)
    implementation(libs.credentials)
    implementation (libs.credentials.v121)
    implementation (libs.credentials.play.services.auth)
    implementation (libs.googleid)
    implementation(libs.circleimageview)

    implementation (libs.google.firebase.auth)
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.firestore)
    implementation(libs.checkout.v1638)
    implementation (libs.firebase.messaging)
    implementation (libs.firebase.storage)



}

apply(plugin = "com.google.gms.google-services")


