package com.dgit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgit.domain.ProjectVO;
import com.dgit.persistence.ProjectDAO;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDAO dao;
	
	
	@Override
	public void insert(ProjectVO vo) throws Exception {
		dao.insert(vo);
	}

	@Override
	public List<ProjectVO> selectAll() throws Exception {
		return dao.selectAll();
	}

	@Override
	public ProjectVO selectByNo(int no) throws Exception {
		return dao.selectByNo(no);
	}

	@Override
	public void delete(int no) throws Exception {
		dao.delete(no);
	}

	@Override
	public void update(ProjectVO vo) throws Exception {
		dao.update(vo);
	}

}
