package ua.bohdanrud.service;

import java.util.List;

import ua.bohdanrud.entity.User;

public interface UserService {

	void saveUser(User user);

	User findUserById(int id);

	List<User> findAllUsers();

	void deleteUserById(int id);

}
