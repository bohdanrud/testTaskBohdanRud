package ua.bohdanrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.bohdanrud.entity.User;
import ua.bohdanrud.repository.UserRepository;
import ua.bohdanrud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
