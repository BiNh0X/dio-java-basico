package dio.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula.model.User_;
// Daqui para frente, poderemos desfrutar de todos os métodos do Framework
// e não precisaremos implementar isso manualmente! Não precisamos nos
// preocupar em implementar os métodos referentes à persistência.
public interface UserRepository extends JpaRepository<User_, Integer> {
    
}