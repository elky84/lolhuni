package com.lol.tracer.model.lol.staticdata;

public class PassiveDto {

	private ImageDto image;
	private String sanitizedDescription;
	private String name;
	private String description;
	public ImageDto getImage() {
		return image;
	}
	public void setImage(ImageDto image) {
		this.image = image;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "PassiveDto [image=" + image + ", sanitizedDescription=" + sanitizedDescription + ", name=" + name
				+ ", description=" + description + "]";
	}
	
	
}
