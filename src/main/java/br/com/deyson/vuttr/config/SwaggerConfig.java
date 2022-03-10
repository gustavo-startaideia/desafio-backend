package br.com.deyson.vuttr.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.deyson.vuttr.config.Properties;

@Configuration
public class SwaggerConfig {

    public Properties properties;


    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .addOpenApiCustomiser(openApi -> openApi.info(new Info().title(properties.getInfo().getApp().getName()).version(properties.getInfo().getApp().getVersion()).description(properties.getInfo().getApp().getDescription())))
                .group("endpoints")
                .pathsToMatch("/**", "/monitor/**")
                .build();
    }

}
