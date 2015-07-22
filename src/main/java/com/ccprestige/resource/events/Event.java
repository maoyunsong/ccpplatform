package com.ccprestige.resource.events;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.ccprestige.common.entity.BaseEntity;

@Entity
public class Event extends BaseEntity{

	private static final long serialVersionUID = 1L;

	public enum Status {none, enabled, disabled, deleted}
	
	@NotBlank
	private String title;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDateSignUp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDateSingnUp;

	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private Status status;

	@Override
	public String getEntityDescription() {
		return getTitle();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
