import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

object Vers {
    //Plugins
    const val dokkav = "0.9.18"
    const val gradle_release_plugin = "1.3.9"
    const val asciidoctor = "1.5.9.2"

    //Dependencies
    const val kotlin = "1.3.50"
    const val junit = "5.4.2"
    const val spring_boot = "2.1.9.RELEASE"
    const val log4j =  "2.12.0"
}

object Libs {
    //Plugins
    const val gradle_release_plugin = "ru.fix:gradle-release-plugin:${Vers.gradle_release_plugin}"
    const val dokka_gradle_plugin =  "org.jetbrains.dokka:dokka-gradle-plugin:${Vers.dokkav}"
    const val asciidoctor = "org.asciidoctor:asciidoctor-gradle-plugin:${Vers.asciidoctor}"
    const val nexus_staging_plugin = "io.codearte.nexus-staging"
    const val nexus_publish_plugin = "de.marcphilipp.nexus-publish"

    //Dependencies
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"

    const val mockk = "io.mockk:mockk:1.9.3"
    const val awaitility = "org.awaitility:awaitility:4.0.1"

    const val jfix_stdlib_concurrency = "ru.fix:jfix-stdlib-concurrency:1.0.59"

    const val log4j_api = "org.apache.logging.log4j:log4j-api:${Vers.log4j}"
    const val log4j_core = "org.apache.logging.log4j:log4j-core:${Vers.log4j}"
    const val log4j_kotlin = "org.apache.logging.log4j:log4j-api-kotlin:1.0.0"
    const val slf4j_over_log4j = "org.apache.logging.log4j:log4j-slf4j-impl:${Vers.log4j}"


    const val spring_boot_starter_webflux = "org.springframework.boot:spring-boot-starter-webflux:${Vers.spring_boot}"
//    const val spring_boot_actuator = "org.springframework.boot:spring-boot-starter-actuator:${Vers.spring_boot}"
    const val jackson_module_kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:2.9.10"

    const val junit_api = "org.junit.jupiter:junit-jupiter-api:${Vers.junit}"
    const val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Vers.junit}"
    const val hamkrest = "com.natpryce:hamkrest:1.7.0.0"

    const val scala_library = "org.scala-lang:scala-library:2.13.0"
    const val gatling_highcharts = "io.gatling.highcharts:gatling-charts-highcharts:2.3.0"
}

enum class Projs{
    http_client_anthology_server_webflux,
    http_client_anthology_client_gatling
  ;

    val directory get() = this.name.replace('_', '-')
    val dependency get(): String = ":$directory"
}