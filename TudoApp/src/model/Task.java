package model;

import java.util.Date;

public class Task {
	
	private int id;
	private int idProject;
	private String name;
	private String description;
	private String notes;
	private boolean idCompleted;
	private Date deadLine;
	private Date createdAt;
	private Date updateAt;
	
	
	public Task(int id, int idProject, String name, String description, String notes, boolean idCompleted,
			Date deadLine, Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.idProject = idProject;
		this.name = name;
		this.description = description;
		this.notes = notes;
		this.idCompleted = idCompleted;
		this.deadLine = deadLine;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdProject() {
		return idProject;
	}


	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public boolean isIdCompleted() {
		return idCompleted;
	}


	public void setIdCompleted(boolean idCompleted) {
		this.idCompleted = idCompleted;
	}


	public Date getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdateAt() {
		return updateAt;
	}


	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description
				+ ", notes=" + notes + ", idCompleted=" + idCompleted + ", deadLine=" + deadLine + ", createdAt="
				+ createdAt + ", updateAt=" + updateAt + "]";
	} 
	
	
	
	

}
