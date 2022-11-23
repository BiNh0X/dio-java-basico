package dio.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Componente REST. Alguns dos seus métodos serão recursos HTTP.
public class WelcomeController {
    
    @GetMapping("/welcome") // Mapeando um recurso HTTP do tipo GET.
    public String welcome() {

        return "Welcome to a Spring Boot REST API!";
    }
}
