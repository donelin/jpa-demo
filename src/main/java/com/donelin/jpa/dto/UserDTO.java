package com.donelin.jpa.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private String name;

    private Boolean parentDepEnbale;
}
