package com.global.store.base.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity <ID extends Number> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID Id;
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private LocalDateTime createdAt;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private LocalDateTime updatedAt;

	
}
