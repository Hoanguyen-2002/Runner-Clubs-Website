package com.rungroop.web.repository;

import com.rungroop.web.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUserName(String userName);

    UserEntity findFirstByUserName(String userName);
}
