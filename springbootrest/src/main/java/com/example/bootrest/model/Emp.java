package com.example.bootrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set 자동으로 만들어주세요 //필수항목에 대해 생성자 자동
@Data
//기본 생성자 만들어주세요
@NoArgsConstructor
//모든 파라미터로 생성자 만들어주세요
@AllArgsConstructor
@Entity
@Table(name="emp")//테이블 자동으로 만듦?
public class Emp {
	private static final long serialVersionUID = 1L;
	
	@Id //키
	@GeneratedValue(strategy = GenerationType.IDENTITY)//키는 자동으로 증가해라
	private Integer empno;
	
	private String ename;
	
	private Integer sal;

	


	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
