package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Movie;

public class MovieDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String subTitle;
	private String synopsis;
	private int year;
	private String imgUrl;
	
	private GenreDTO genre;
	
	public MovieDTO() {
		
	}
	
	public MovieDTO(Long id, String title, String subTitle, String synopsis, int year, String imgUrl, GenreDTO genre) {

		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.synopsis = synopsis;
		this.year = year;
		this.imgUrl = imgUrl;
		this.genre=genre;
		
			
	}
	
	
	public MovieDTO(Movie entity) {
		
		id=entity.getId();
		title=entity.getTitle();
		subTitle=entity.getSubTitle();
		synopsis=entity.getSynopsis();
		year=entity.getYear();
		imgUrl=entity.getImgUrl();
		genre=new GenreDTO(entity.getGenre());
	
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}
	
	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenreDTO(GenreDTO genre) {
		this.genre = genre;
	}
	

	
	
	
}
