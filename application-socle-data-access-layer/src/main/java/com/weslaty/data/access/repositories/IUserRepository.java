package com.weslaty.data.access.repositories;

import com.weslaty.data.access.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer>{
}
