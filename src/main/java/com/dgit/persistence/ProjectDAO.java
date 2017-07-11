package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.ProjectVO;

public interface ProjectDAO {
	public void insert(ProjectVO vo) throws Exception;
	public List<ProjectVO> selectAll() throws Exception;
	public ProjectVO selectByNo(int no) throws Exception;
	public void delete(int no) throws Exception;
	public void update(ProjectVO vo) throws Exception;
	
}
