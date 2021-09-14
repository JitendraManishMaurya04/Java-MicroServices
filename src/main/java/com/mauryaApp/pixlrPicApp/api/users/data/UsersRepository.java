package com.mauryaApp.pixlrPicApp.api.users.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
}
