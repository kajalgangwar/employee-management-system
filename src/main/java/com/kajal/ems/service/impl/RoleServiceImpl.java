package com.kajal.ems.service.impl;

import com.kajal.ems.dto.request.RoleRequest;
import com.kajal.ems.dto.response.RoleResponse;
import com.kajal.ems.entity.Role;
import com.kajal.ems.mapper.RoleMapper;
import com.kajal.ems.repository.RoleRepository;
import com.kajal.ems.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleResponse saveRole(RoleRequest request) {

        Role role = RoleMapper.toEntity(request);

        Role savedRole = roleRepository.save(role);

        return RoleMapper.toResponse(savedRole);
    }

    @Override
    public List<RoleResponse> getAllRoles() {

        return roleRepository.findAll()
                .stream()
                .map(RoleMapper::toResponse)
                .toList();
    }
}