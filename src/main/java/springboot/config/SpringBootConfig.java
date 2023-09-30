package springboot.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "springboot")
public class SpringBootConfig {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringBootConfig.class)
                .run();
    }
}