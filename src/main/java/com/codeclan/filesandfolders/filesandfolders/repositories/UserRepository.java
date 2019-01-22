package com.codeclan.filesandfolders.filesandfolders.repositories;

import com.codeclan.filesandfolders.filesandfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
