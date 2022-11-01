package com.externalize.conf.module

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(classes = [ConfigurationExposer::class])
@ActiveProfiles("test")
internal class ProfileConfigurationExposerTest {

    @Autowired
    lateinit var sut: ConfigurationExposer

    @Test
    fun `should override only one property`() {

        // When
        val resolvedProperties = sut.exposeConfiguration()

        // Then
        assertThat(resolvedProperties).contains(
            "property.a: overridden-value",
            "property.b: original-value",
            "property.c: original-value",
        )

    }

}


