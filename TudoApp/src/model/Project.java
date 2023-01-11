package model;

import java.sql.Date;

public class Project {
	
	private int id;
	private String name;
	private String description;
	private Date createdAd;
	private Date updateAt;
	
		public Project(int id, String name, String description, Date createdAd, Date updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAd = createdAd;
		this.updateAt = updateAt;
	}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public Date getCreatedAd() {
			return createdAd;
		}

		public void setCreatedAd(Date createdAd) {
			this.createdAd = createdAd;
		}

		public Date getUpdateAt() {
			return updateAt;
		}

		public void setUpdateAt(Date updateAt) {
			this.updateAt = updateAt;
		}

		@Override
		public String toString() {
			return "Project [id=" + id + ", name=" + name + ", description=" + description + ", createdAd=" + createdAd
					+ ", updateAt=" + updateAt + "]";
		}
	
	
	
	
	

}
