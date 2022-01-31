package com.wapp.webproject.webrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wapp.webproject.UserModel.Emotionregister;
import com.wapp.webproject.UserModel.Userregister;

@Repository
public interface Emotionrepo extends JpaRepository<Emotionregister, Integer>{
}
