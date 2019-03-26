package test.app

import io.micronaut.context.ApplicationContext
import io.micronaut.context.annotation.Property
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Shared
import spock.lang.Specification


class MyIntegrationSpec extends Specification {

    @Shared
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)
    @Shared
    HttpClient client = embeddedServer.getApplicationContext().createBean(HttpClient.class, embeddedServer.getURL())


    @Property(name = "bearer.public")
    String bearerToken

    def "test"() {
        given:
        assert bearerToken != null
    }
}