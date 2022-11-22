package dio.aula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     // Toda aplicação que usa JPA tem essa anotação

public class User_ {
    
    @Id // Diz que esse atributo será o "Id" da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")   // Diz que o nome tem uma diferença do atributo
    private Integer id;
    @Column(length = 50, nullable = false)  // Permite no máximo 50 caracteres e não permite anotação nula
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    } 
}