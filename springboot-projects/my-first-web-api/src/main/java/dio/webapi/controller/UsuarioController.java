package dio.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.webapi.model.Usuario;
import dio.webapi.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")   // Substitui os prefixos nos métodos, evitando repetição.
public class UsuarioController {
    
    // Um controller é como um proxy, ele dá o redirecionamento para
    // uma funcionalidade existente na nossa aplicação.
    @Autowired
    private UsuarioRepository repository;   // Injetando dependência.
    @GetMapping
    public List<Usuario> getUsers() {

        return repository.findAll();
    }
    @GetMapping("/{username}")    // Entre chaves obtém o recurso username como parâmetro.
    public Usuario getOne(@PathVariable("username") String username) {

        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {

        repository.deleteById(id);
    }
    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {

        repository.save(usuario);
    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario) {

        repository.save(usuario);
    }
}   