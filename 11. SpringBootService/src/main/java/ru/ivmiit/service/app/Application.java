package ru.ivmiit.service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * 18.04.2018
 * Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "ru.ivmiit.service")
@EnableJpaRepositories(basePackages = "ru.ivmiit.service.repositories")
@EntityScan(basePackages = "ru.ivmiit.service.models")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
