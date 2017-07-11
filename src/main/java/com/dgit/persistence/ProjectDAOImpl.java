package com.dgit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.dgit.domain.ProjectVO;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
	@Inject
	private SqlSession session;
	private static String namespace = "com.dgit.persistence.ProjectDAO";
	@Override
	public void insert(ProjectVO vo) throws Exception {
		session.insert(namespace+".insert", vo);
	}
	@Override
	public List<ProjectVO> selectAll() throws Exception {
		return session.selectList(namespace+".selectAll");
	}
	@Override
	public ProjectVO selectByNo(int no) throws Exception {
		return session.selectOne(namespace+".selectByNo", no);
	}
	@Override
	public void delete(int no) throws Exception {
		session.delete(namespace+".delete", no);
	}
	@Override
	public void update(ProjectVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}
	
	
}
