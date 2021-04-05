package com.cristianostudy.javacourse.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.cristianostudy.javacourse.entities.User;
import com.cristianostudy.javacourse.repositories.UserRepository;
import com.cristianostudy.javacourse.services.exceptions.DatabaseException;
import com.cristianostudy.javacourse.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User user) {
		try {
			User monitoryEntityByJPA = userRepository.getOne(id);
			updateData(monitoryEntityByJPA, user);
			return userRepository.save(monitoryEntityByJPA);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User monitoryEntityByJPA, User user) {
		monitoryEntityByJPA.setName(user.getName());
		monitoryEntityByJPA.setEmail(user.getEmail());
		monitoryEntityByJPA.setPhoneNumber(user.getPhoneNumber());
	}
}
