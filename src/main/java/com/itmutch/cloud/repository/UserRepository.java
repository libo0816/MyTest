package com.itmutch.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itmutch.cloud.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
