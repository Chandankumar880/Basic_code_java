package com.HouseKeeper.controller;

import com.HouseKeeper.entity.AdminLogin;
import com.HouseKeeper.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adminlogins")
public class AdminLoginController {

    private final AdminLoginService adminLoginService;

    @Autowired
    public AdminLoginController(AdminLoginService adminLoginService) {
        this.adminLoginService = adminLoginService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AdminLogin>> getAllAdminLogins() {
        List<AdminLogin> adminLogins = adminLoginService.getAllAdminLogins();
        return ResponseEntity.ok(adminLogins);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<AdminLogin> getAdminLoginById(@PathVariable int empId) {
        Optional<AdminLogin> adminLogin = adminLoginService.getAdminLoginById(empId);
        return adminLogin.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/login")
    public ResponseEntity<AdminLogin> createAdminLogin(@RequestBody AdminLogin adminLogin) {
        AdminLogin createdAdminLogin = adminLoginService.saveAdminLogin(adminLogin);
        return ResponseEntity.ok(createdAdminLogin);
    }

    @DeleteMapping("/{empId}")
    public ResponseEntity<Void> deleteAdminLogin(@PathVariable int empId) {
        adminLoginService.deleteAdminLogin(empId);
        return ResponseEntity.noContent().build();
    }
    
    // You can add more controller methods for update and other operations
}
