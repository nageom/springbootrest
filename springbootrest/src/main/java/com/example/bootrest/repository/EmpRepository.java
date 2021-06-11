package com.example.bootrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootrest.model.Emp;
												//모델클래스 타입, 모델클래스 키
public interface EmpRepository extends JpaRepository<Emp, Integer> {

	// 쿼리 메서드
	//메서드 이름으로 스프링 데이터 jpa에서 자동으로 sql쿼리문을 만들어주는것
	List<Emp> findBySalBetween(int sal1, int sal2);
	// 메서드 이름으로 자동으로 select 쿼리 새엇ㅇ
	// JPA에서 자동으로 생성하는 쿼리는 다음과 같다.
	/*
	 * select 
	 * emp0_.empno as empno1_0_,
	 * emp0_.ename as ename2_0),
	 * emp0_.sal as sal3_0_,
	 * from
	 * emp emp0_
	 * where
	 * emp0_.sal between ? and ? 
	 
	 * 
	 * 
	 * 
	 * */



	
	
	
}
