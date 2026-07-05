package com.kajal.ems.service;

import com.kajal.ems.entity.Role;

import java.util.List;

public interface RoleService {

    Role saveRole(Role role);

    List<Role> getAllRoles();

}