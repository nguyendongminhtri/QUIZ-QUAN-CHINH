package com.example.demo.dto.request;

import java.util.Set;

public class ChangeRoleForm {
    private String role;

    public ChangeRoleForm() {
    }

    public ChangeRoleForm(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ChangeRoleForm{" +
                "role='" + role + '\'' +
                '}';
    }
}
