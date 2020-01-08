package com.guier.ad.sponsor.dao;

import com.guier.ad.sponsor.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    AdUser findByUsername(String username);
}
