package com.donelin.jpa.repository;

import com.donelin.jpa.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RoleDaoTest {

    @Autowired
    private RoleDao roleDao;


    @Test
    public void testAdd() {
        Role role = new Role();
        role.setId(5L);
        role.setName("学员2");
        role.setEnbale(false);
        roleDao.save(role);

        role = new Role();
        role.setName("管理员2");
        role.setEnbale(true);
        roleDao.save(role);
    }



}