package lotte.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lotte.com.a.dao.MemberDao;
import lotte.com.a.dto.MemberDto;

@Service
@Transactional
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public boolean getId(MemberDto dto) {
		int n = dao.getId(dto);
		return n>0?true:false;
	}
	
	public boolean account(MemberDto dto) {
		int n = dao.account(dto);
		return n>0?true:false;
	}
	
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
}




