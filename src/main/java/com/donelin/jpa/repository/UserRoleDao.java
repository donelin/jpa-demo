package com.donelin.jpa.repository;

import com.donelin.jpa.dto.UserRoleDTO;
import com.donelin.jpa.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Long>, JpaSpecificationExecutor<UserRole>{


    @Query(value = "select new com.donelin.jpa.dto.UserRoleDTO(ur.userId, r.id, r.name, r.enbale) from Role r left join UserRole ur on r.id= ur.roleId where ur.userId = :userId")
    List<UserRoleDTO> findUserRole(@Param("userId") Long userId);

}
