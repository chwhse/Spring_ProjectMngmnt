package com.dgit.service;

import java.util.List;

import com.dgit.domain.ProjectVO;

public interface ProjectService {
	public void insert(ProjectVO vo) throws Exception;
	public List<ProjectVO> selectAll() throws Exception;
	public ProjectVO selectByNo(int no) throws Exception;
	public void delete(int no) throws Exception;
	public void update(ProjectVO vo) throws Exception;
	
}
