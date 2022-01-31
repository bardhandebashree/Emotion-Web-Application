package com.wapp.webproject.webrepo;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.wapp.webproject.UserModel.Userregister;
@Repository
public interface Webrepo extends JpaRepository<Userregister, Integer>{
	@Query("SELECT u FROM Userregister u WHERE u.email = :email AND u.password=:password")
	java.util.List<Userregister> checkEmailPwd(@Param("email")String email,@Param("password") String password);

	
  
       
    	
	

}
