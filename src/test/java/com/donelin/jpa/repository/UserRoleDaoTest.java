package com.donelin.jpa.repository;

import com.donelin.jpa.dto.UserRoleDTO;
import com.donelin.jpa.entity.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserRoleDaoTest {

    @Autowired
    private UserRoleDao userRoleDao;


    @Test
    public void testAdd() {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        userRole.setUserId(1L);
        userRole.setRoleId(1L);
        userRoleDao.save(userRole);

        userRole = new UserRole();
        userRole.setId(2L);
        userRole.setUserId(1L);
        userRole.setRoleId(3L);
        userRoleDao.save(userRole);
    }


    @Test
    public void testFindUserRole() {
        List<UserRoleDTO> userRoleDTO = userRoleDao.findUserRole(1L);
        System.out.println(userRoleDTO.size());
    }


}