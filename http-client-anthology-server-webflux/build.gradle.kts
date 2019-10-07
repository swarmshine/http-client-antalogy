import org.gradle.kotlin.dsl.*

plugins {
    java
    kotlin("jvm")
}

dependencies {
    implementation(Libs.spring_boot_starter_webflux)
    implementation(Libs.jackson_module_kotlin)
    implementation(Libs.log4j_kotlin)

    implementation(Libs.slf4j_over_log4j)
    implementation(Libs.log4j_core)


    testImplementation(Libs.junit_api)
    testImplementation(Libs.hamkrest)

    testRuntimeOnly(Libs.junit_engine)

}

configurations.all {
    //disable logback, using log4j instead
    exclude("org.springframework.boot", "spring-boot-starter-logging")
}
