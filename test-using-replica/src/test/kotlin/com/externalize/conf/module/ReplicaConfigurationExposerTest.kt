package com.externalize.conf.module

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [ConfigurationExposer::class])
internal class ReplicaConfigurationExposerTest {

    @Autowired
    lateinit var sut: ConfigurationExposer

    @Test
    fun `should override only one property`() {

        // When
        val resolvedProperties = sut.exposeConfiguration()

        // Then
        assertThat(resolvedProperties).contains(
            "property.a: overridden-value",
            "property.b: null",
            "property.c: null",
        )

    }

}


