package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;  // Injeção de controle/ dependências
    @Override
    public void run(String... args) throws Exception {
        
        User users = new User();
        users.setName("Fábio");
        users.setUsername("binh0x");
        users.setPassword("dio123");
        repository.save(users);

        for (User u : repository.findAll()) {
            System.out.println(u);  
        }
    }
}