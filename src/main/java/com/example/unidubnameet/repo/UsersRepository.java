package com.example.unidubnameet.repo;

import com.example.unidubnameet.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
}
