package com.example.JPAsample01.member.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.JPAsample01.member.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{

	
}
