package com.kajal.ems.dto.request;

import com.kajal.ems.enums.RoleName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RoleRequest {

    @NotNull(message = "Role name is required")
    private RoleName name;

    @Size(max = 255, message = "Description cannot exceed 255 characters")
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