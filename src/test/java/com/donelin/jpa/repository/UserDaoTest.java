package com.donelin.jpa.repository;

import com.donelin.jpa.dto.UserDTO;
import com.donelin.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class UserDaoTest {

    @Autowired
    private UserDao userDao;


    @Test
    public void testAdd() {
        User userDO = new User();
        userDO.setId(5L);
        userDO.setName("任黑1");
        userDO.setParentDepEnbale(false);
        userDao.save(userDO);

        userDO = new User();
        userDO.setId(6L);
        userDO.setName("任黑2");
        userDO.setParentDepEnbale(true);
        userDao.save(userDO);
    }


    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserByParentDepEnbale(){
        List<User> users = userDao.findUserByParentDepEnbale(false);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserByLikeUseNativeQuery(){
        List<User> users = userDao.findUserByLikeUseNativeQuery("任我行", true);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserByLikeUse(){
        List<User> users = userDao.findUserByLike("任我行", true);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserByLikeUseParams(){
        UserDTO userDTO = new UserDTO("任我行", false);
        List<User> users = userDao.findUserByLikeUseParams(userDTO);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserLikeName(){
        Sort sort = Sort.by(Sort.Order.desc("id"));
        Pageable pageable = PageRequest.of(1,3, sort);
        Page<User> page = userDao.findUserLikeName("任", pageable);
        System.out.println(page);
    }
}