plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.polisan.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}