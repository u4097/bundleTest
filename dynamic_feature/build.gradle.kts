plugins {
    id( "com.android.dynamic-feature")
}


android {
    compileSdkVersion(28)


    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"


    }


}

dependencies {
    implementation(project(":app"))
}
