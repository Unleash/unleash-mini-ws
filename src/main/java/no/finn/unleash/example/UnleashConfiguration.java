package no.finn.unleash.example;

import no.finn.unleash.DefaultUnleash;
import no.finn.unleash.Unleash;
import no.finn.unleash.util.UnleashConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnleashConfiguration {

    // Wire up Unleash here!

    @Bean
    public Unleash unleash() {
        return unleash;
    }
}
