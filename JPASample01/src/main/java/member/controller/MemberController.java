package member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;
import member.dto.Member;
import member.repo.MemberRepository;

@Slf4j
@Controller
public class MemberController {

	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping(value = "/JPATest")
	public ResponseEntity<?> findById(@RequestParam(name="id", required = false, defaultValue = "1") Long id) {
		
		log.info("JPATest in");
		
		Map<String, Object> resultMap = new HashMap<>();
		Optional<Member> member = memberRepository.findById(id);
		
		if(member.isPresent()) {
			log.info(member.get().toString());
			resultMap.put("member", member.get());		
		}
		
		return ResponseEntity.ok().body(resultMap);
	}
	
	@GetMapping(value = "/JPATest2")
	public ResponseEntity<?> findAll() {
		
		log.info("JPATest2 in");
		
		Map<String, Object> resultMap = new HashMap<>();
		List<Member> memList = (List<Member>) memberRepository.findAll();
		
		resultMap.put("memList", memList);
		
		return ResponseEntity.ok().body(resultMap);
	}
	
}
