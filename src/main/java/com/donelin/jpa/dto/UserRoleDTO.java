package com.donelin.jpa.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserRoleDTO implements Serializable {

    private Long userId;

    private Long roleId;

    private String roleName;

    private Boolean roleEnable;

    public UserRoleDTO(Long userId, Long roleId, String roleName, Boolean roleEnable){
        this.userId = userId;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleEnable = roleEnable;
    }
}
