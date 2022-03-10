package br.com.deyson.vuttr.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "server")
@Getter
@Setter
public class Properties {

    private final Info info = new Info();

    @Getter
    @Setter
    public static class Info {

        private final App app = new App();

        @Getter
        @Setter
        public static class App {

            private String name;

            private String version;

            private String description;

        }

    }
}