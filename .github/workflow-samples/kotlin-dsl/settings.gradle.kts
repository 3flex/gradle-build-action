plugins {
    id("com.gradle.enterprise") version "3.14"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.11.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
        isUploadInBackground = false
    }
}

rootProject.name = "kotlin-dsl"

