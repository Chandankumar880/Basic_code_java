package com.HouseKeeper.service;

import com.HouseKeeper.entity.AdminLogin;
import com.HouseKeeper.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminLoginService {

    private final AdminLoginRepository adminLoginRepository;

    @Autowired
    public AdminLoginService(AdminLoginRepository adminLoginRepository) {
        this.adminLoginRepository = adminLoginRepository;
    }

    public List<AdminLogin> getAllAdminLogins() {
        return adminLoginRepository.findAll();
    }

    public Optional<AdminLogin> getAdminLoginById(int empId) {
        return adminLoginRepository.findById(empId);
    }

    public AdminLogin saveAdminLogin(AdminLogin adminLogin) {
        return adminLoginRepository.save(adminLogin);
    }

    public void deleteAdminLogin(int empId) {
        adminLoginRepository.deleteById(empId);
    }
    
    // You can add additional methods and business logic as needed
}
