package com.kajal.ems.controller;

import com.kajal.ems.dto.request.RoleRequest;
import com.kajal.ems.dto.response.RoleResponse;
import com.kajal.ems.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public RoleResponse saveRole(@RequestBody RoleRequest request) {
        return roleService.saveRole(request);
    }

    @GetMapping
    public List<RoleResponse> getAllRoles() {
        return roleService.getAllRoles();
    }
}