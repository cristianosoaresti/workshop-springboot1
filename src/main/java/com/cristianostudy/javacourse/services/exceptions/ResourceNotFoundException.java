package com.cristianostudy.javacourse.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException (Long id) {
		super("Not found id: " + id);
	}
}
