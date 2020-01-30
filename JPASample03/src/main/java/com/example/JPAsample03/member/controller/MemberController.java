package com.example.JPAsample03.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.JPAsample03.member.entity.Member;
import com.example.JPAsample03.member.repository.MemberRepository;

import lombok.extern.java.Log;

@Log
@Controller
public class MemberController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping(value = "/insert")
	public ResponseEntity<?> insert() {
		
		log.info("memberController insert() ");
		
		Member mem = new Member();
		mem.setName("inwoo");
		mem.setAge(11);
		
		memberRepository.save(mem);
		
		Map<String, Object> resultMap = new HashMap<>();
		List<Member> memList = memberRepository.findAll();
		
		resultMap.put("memList", memList);
		
		return ResponseEntity.ok().body(resultMap);
	}
	
	@GetMapping(value = "/select")
	public ResponseEntity<?> select() {
		
		log.info("memberController select() ");
		
		HashMap<String, Object> resultMap = new HashMap<>();
		Optional<Member> mem = memberRepository.findById(1L);
		
		if(mem.isPresent()) {
			resultMap.put("mem", mem);
		}
		
		return ResponseEntity.ok().body(resultMap);
	}
	
	@GetMapping(value = "/update")
	public ResponseEntity<?> update() {
		
		log.info("memberController update() ");
		
		Member mem = new Member();
		mem.setId(1L);
		mem.setName("changeInwoo");
		mem.setAge(22);
		
		memberRepository.save(mem);
		
		HashMap<String, Object> resultMap = new HashMap<>();
		Optional<Member> Optinalmem = memberRepository.findById(1L);
		
		if(Optinalmem.isPresent()) {
			resultMap.put("Optinalmem", Optinalmem);
		}
		
		return ResponseEntity.ok().body(resultMap);
	}
	
	@DeleteMapping(value = "/delete")
	public ResponseEntity<?> delete() {
		
		log.info("memberController delete () ");
		
		memberRepository.deleteById(1L);
		
		HashMap<String, Object> resultMap = new HashMap<>();
		Optional<Member> Optinalmem = memberRepository.findById(1L);
		
		if(Optinalmem.isPresent()) {
			resultMap.put("Optinalmem", Optinalmem);
		}
		
		return ResponseEntity.ok().body(resultMap);
	}
	
}
