package com.kk.ownPractice.mapper;


import com.kk.ownPractice.entity.User;

public interface UserDao {
	User findUserById(int id);
}
