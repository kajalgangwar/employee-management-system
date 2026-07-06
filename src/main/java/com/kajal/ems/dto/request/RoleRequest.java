package com.kajal.ems.dto.request;

import com.kajal.ems.enums.RoleName;

public class RoleRequest {

    private RoleName name;

    private String description;

    public RoleRequest() {
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