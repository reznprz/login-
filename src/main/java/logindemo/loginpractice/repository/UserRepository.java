package logindemo.loginpractice.repository;

import logindemo.loginpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //User findbyUsername(String username);
}
