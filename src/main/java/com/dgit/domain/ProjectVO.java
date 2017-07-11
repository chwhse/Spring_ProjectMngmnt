package com.dgit.domain;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int projectno;
	private String projectname;
	private String content;
	private String projecting;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startdate;
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date enddate;
	
	public ProjectVO() {}
	
	
	public int getProjectno() {
		return projectno;
	}

	public void setProjectno(int projectno) {
		this.projectno = projectno;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getProjecting() {
		return projecting;
	}

	public void setProjecting(String projecting) {
		this.projecting = projecting;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	


	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	@Override
	public String toString() {
		return "ProjectVO [projectno=" + projectno + ", projectname=" + projectname + ", content=" + content
				+ ", projecting=" + projecting + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}


	
	
}


