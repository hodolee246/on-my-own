package member.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import member.dto.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{

	Optional<Member> findById(Long id);
	
}
