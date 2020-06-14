package com.donelin.jpa.repository;

import com.donelin.jpa.dto.UserDTO;
import com.donelin.jpa.entity.Role;
import com.donelin.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role>{

}
