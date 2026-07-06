package com.kajal.ems.mapper;

import com.kajal.ems.dto.request.RoleRequest;
import com.kajal.ems.dto.response.RoleResponse;
import com.kajal.ems.entity.Role;

public class RoleMapper {

    public static Role toEntity(RoleRequest request) {

        Role role = new Role();

        role.setName(request.getName());
        role.setDescription(request.getDescription());

        return role;
    }

    public static RoleResponse toResponse(Role role) {

        RoleResponse response = new RoleResponse();

        response.setId(role.getId());
        response.setName(role.getName());
        response.setDescription(role.getDescription());

        return response;
    }
}