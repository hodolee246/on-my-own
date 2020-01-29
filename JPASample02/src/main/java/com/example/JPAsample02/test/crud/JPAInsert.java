package com.example.JPAsample02.test.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.JPAsample02.test.domain.Member;

public class JPAInsert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		// 트랜잭션 시작
		tx.begin();
		
		try {
			Member mem = new Member();
			mem.setId(10L);
			mem.setName("Inwoo");
			mem.setAge(17);
			// 영속화됨
			em.persist(mem);
			// 트랜잭션에 저장
			tx.commit();
		} catch (Exception e) {
			tx.rollback(); // 예외 발생 시 트랜잭션 롤백 
		} finally {
			em.close();
		}
		emf.close();
	}

}
