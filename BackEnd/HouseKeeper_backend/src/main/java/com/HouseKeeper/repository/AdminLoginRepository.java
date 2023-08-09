package com.HouseKeeper.repository;

import com.HouseKeeper.entity.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Integer> {
    // You can add custom query methods here if needed
}
