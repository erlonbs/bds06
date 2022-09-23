package com.devsuperior.movieflix.services.exceptions;

public class ForbbiddenException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ForbbiddenException(String msg) {
		super(msg);
	}
}