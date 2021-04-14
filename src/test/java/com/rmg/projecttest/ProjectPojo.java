package com.rmg.projecttest;

import org.codehaus.jackson.annotate.JsonPropertyOrder;


public class ProjectPojo {
	
	String createdBy;
	
	String createdOn;
	String ProjectId;
	String projectName;
	String status;
	int teamSize;
	public ProjectPojo(String createdBy, String createdOn, String projectId, String projectName, String status,
			int teamSize) {
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.ProjectId = projectId;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
		
}
