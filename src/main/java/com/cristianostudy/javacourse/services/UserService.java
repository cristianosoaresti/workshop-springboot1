package com.cristianostudy.javacourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianostudy.javacourse.entities.User;
import com.cristianostudy.javacourse.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.get();
	}
	
	public User insert (User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update (Long id, User user) {
		User monitoryEntityByJPA = userRepository.getOne(id);
		updateData(monitoryEntityByJPA, user);
		return userRepository.save(monitoryEntityByJPA);
	}

	private void updateData(User monitoryEntityByJPA, User user) {
		monitoryEntityByJPA.setName(user.getName());
		monitoryEntityByJPA.setEmail(user.getEmail());
		monitoryEntityByJPA.setPhoneNumber(user.getPhoneNumber());
	}
}
