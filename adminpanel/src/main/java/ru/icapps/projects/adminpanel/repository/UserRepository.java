package ru.icapps.projects.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.icapps.projects.adminpanel.domain.User;

public interface UserRepository extends JpaRepository<User,Long> {
  User findByUsername(String username);
}
