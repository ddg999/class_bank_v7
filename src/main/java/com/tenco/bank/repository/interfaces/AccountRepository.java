package com.tenco.bank.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tenco.bank.repository.model.Account;

@Mapper
public interface AccountRepository {
	public int insert(Account account);

	public int updateById(Account account);

	public int deleteById(Integer id);

	// interface 파라미터명과 xml 에 사용 할  변수명을 다르게 사용해야 한다면 @param 애노테이션을
	// 사용할 수 있다. 그리고 2개 이상의 파라미터를 사용할 경우 반드시 사용하자 !!
	// --> 한 사람이 여러개의 계좌 번호를 가질 수 있다.
	public List<Account> findByUserId(@Param("userId") Integer principalId);

	// --> account id 값으로 계좌 정보 조회
	public Account findByNumber(@Param("number") String id);

	// 코드 추가 예정
}
