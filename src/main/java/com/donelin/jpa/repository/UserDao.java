package com.donelin.jpa.repository;

import com.donelin.jpa.dto.UserDTO;
import com.donelin.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{


    List<User> findUserByParentDepEnbale(Boolean parentDepEnbale);


    @Query(value = "select * from t_user u where u.name like ?1% and u.parent_dep_enbale = ?2", nativeQuery = true)
    List<User> findUserByLikeUseNativeQuery(String name, Boolean parentDepEnbale);


    @Query(value = "select u from User u where u.name like :name% and u.parentDepEnbale =:parentDepEnbale")
    List<User> findUserByLike(@Param("name")String name, @Param("parentDepEnbale")Boolean parentDepEnbale);


    @Query(value = "select u from User u where u.name like :#{#userDTO.name}% and u.parentDepEnbale =:#{#userDTO.parentDepEnbale}")
    List<User> findUserByLikeUseParams(@Param("userDTO")UserDTO userDTO);


    @Query(value = "SELECT * FROM t_user u WHERE u.name like ?1%",
            countQuery = "SELECT count(*) FROM t_user u WHERE u.name like ?1%",
            nativeQuery = true)
    Page<User> findUserLikeName(String lastname, Pageable pageable);
}
