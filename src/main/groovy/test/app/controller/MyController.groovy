package io.micronaut.test.spock

import io.micronaut.context.annotation.Property
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller('/')
class MyController {

    @Property(name = "bearer.public")
    String publicToken

    @Get(uri = '/', processes = MediaType.TEXT_PLAIN)
    def foo() {
        return HttpResponse.ok()
        //.header('Access-Control-Allow-Origin', cors)
                           .contentType(MediaType.APPLICATION_JSON)
                           .body([])
    }
}