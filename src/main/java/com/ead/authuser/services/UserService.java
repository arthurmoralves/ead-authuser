package com.ead.authuser.services;

import com.ead.authuser.dtos.InstructorDto;
import com.ead.authuser.dtos.UserDto;
import com.ead.authuser.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    List<UserModel> findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UserModel userModel);

    UserModel save(UserModel userModel);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    UserModel updateUser(UserModel userModel, UserDto userDto);

    void updatePassword(UserModel userModel, UserDto userDto);

    UserModel updateImage(UserModel userModel, UserDto userDto);

    Page<UserModel> findAll( Specification<UserModel> spec, Pageable pageable);

    public UserModel saveUser(UserModel userModel);
}
