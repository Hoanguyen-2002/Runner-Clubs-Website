package com.rungroop.web.service;

import com.rungroop.web.dto.RegistrationDto;
import com.rungroop.web.models.UserEntity;
import jakarta.validation.constraints.NotEmpty;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(@NotEmpty String email);

    UserEntity findByUserName(@NotEmpty String userName);
}
