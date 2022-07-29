package co.com.gamehero.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/api/*")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET, POST, DELETE")
                .allowCredentials(true).maxAge(3600);
    }
}
