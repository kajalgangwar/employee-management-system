package com.kajal.ems.service;

import com.kajal.ems.dto.request.RoleRequest;
import com.kajal.ems.dto.response.RoleResponse;

import java.util.List;

public interface RoleService {

    RoleResponse saveRole(RoleRequest request);

    List<RoleResponse> getAllRoles();
}