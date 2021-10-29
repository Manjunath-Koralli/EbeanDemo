package com.example.Ebeandemo1.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import io.ebean.annotation.WhoCreated;
import io.ebean.annotation.WhoModified;

@MappedSuperclass
public abstract class BaseModel {

    @Id
    protected long id;
    
    @Version
    protected long version;
    
    @WhoCreated
	String whoCreated;

	@WhoModified
	String whoModified;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getWhoCreated() {
		return whoCreated;
	}

	public void setWhoCreated(String whoCreated) {
		this.whoCreated = whoCreated;
	}

	public String getWhoModified() {
		return whoModified;
	}

	public void setWhoModified(String whoModified) {
		this.whoModified = whoModified;
	}
}
