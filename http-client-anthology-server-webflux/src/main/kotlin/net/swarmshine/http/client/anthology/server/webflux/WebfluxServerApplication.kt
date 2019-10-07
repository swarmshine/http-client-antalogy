package net.swarmshine.http.client.anthology.server.webflux

import org.apache.logging.log4j.kotlin.Logging
import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
open class SlowRest {
    companion object: Logging

    @GetMapping("/slow/mono")
    fun slowMethod(requestId: String): Mono<String> {
        return Mono.fromCallable {
            "response $requestId \n"
        }.delayElement(Duration.ofSeconds(3))
    }
}

@SpringBootApplication
open class WebfluxServerApplication

fun main(args: Array<String>) {

    val app = SpringApplication(WebfluxServerApplication::class.java)
    app.setBannerMode(Banner.Mode.OFF)

    app.run(*args)
}
