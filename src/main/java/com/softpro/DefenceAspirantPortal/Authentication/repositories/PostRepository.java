package com.softpro.DefenceAspirantPortal.Authentication.repositories;

import com.softpro.DefenceAspirantPortal.Authentication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
