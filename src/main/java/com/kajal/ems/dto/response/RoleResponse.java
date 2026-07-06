package com.kajal.ems.dto.response;

import com.kajal.ems.enums.RoleName;

public class RoleResponse {

    private Long id;

    private RoleName name;

    private String description;

    public RoleResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}