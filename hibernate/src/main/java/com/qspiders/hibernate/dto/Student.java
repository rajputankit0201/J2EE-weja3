package com.qspiders.hibernate.dto;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	
		@Id
		private int SId;
		private String Sname;
		private String email;
		private int age;
		private double fees;
}
