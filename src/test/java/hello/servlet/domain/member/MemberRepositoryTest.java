package hello.servlet.domain.member;

import hello.servlet.member.Member;
import hello.servlet.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @Test
    void save(){
        Member member = new Member("hello" , 20);
        Member saveMember = memberRepository.save(member);
        Member findMember = memberRepository.findById(saveMember.getId());
        Assertions.assertThat(findMember).isEqualTo(saveMember);
    }

    @Test
    void findAll(){
        Member member = new Member("member1", 20);
        Member member1 = new Member("member2", 30);

        memberRepository.save(member);
        memberRepository.save(member1);

        List<Member> result = memberRepository.findAll();
        Assertions.assertThat(result.size()).isEqualTo(2);
        System.out.println("result = " + result);
    }
}
