plugins {
    alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.android.room)
}

android {
    namespace = "com.polisan.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}