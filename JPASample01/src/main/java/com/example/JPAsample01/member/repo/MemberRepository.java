package com.example.JPAsample01.member.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.JPAsample01.member.dto.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{

	Optional<Member> findById(Long id);
	
}
