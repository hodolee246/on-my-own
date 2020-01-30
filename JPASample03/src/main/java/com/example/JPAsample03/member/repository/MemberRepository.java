package com.example.JPAsample03.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPAsample03.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	
	
	
}
