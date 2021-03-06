package org.sakaiproject.lessonbuildertool;

import java.util.Date;

public class SimpleStudentPageImpl implements SimpleStudentPage {
	private long id; // Basic ID
	private Date lastUpdated;
	private long itemId; // ItemId of the section this page belongs to
	private long pageId; // ID of row in lesson_builder_pages
	private String title; // Title of page
	private String owner; // Owner of page
	private String group;
        private boolean groupOwned = false; // no longer used
	
	// ID of the comments section associated with this page, if one exists.
	private Long commentsSection; 
	private Date lastCommentChange; // Last time a comment was posted or edited.
	private boolean deleted = false; // Shows whether or not this was deleted by the instructor.
	
	private Double points; // Number of points given if this was graded
	
	public SimpleStudentPageImpl() { }
	
	public SimpleStudentPageImpl(long itemId, long pageId, String title, String owner, String group) {
		this.itemId = itemId;
		this.pageId = pageId;
		this.title = title;
		this.owner = owner;
		this.group = group;
		this.groupOwned = false;
		this.commentsSection = null;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	public long getPageId() {
		return pageId;
	}
	public void setPageId(long pageId) {
		this.pageId = pageId;;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getOwner() {
		if (owner != null && owner.length() == 0)
			return null;
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;;
	}
	
	public String getGroup() {
		if (group != null && group.length() == 0)
			return null;
		return group;
	}
	public void setGroup(String s) {
		this.group = s;
	}
	
	public boolean isGroupOwned() {
	    return groupOwned;
	}

	public void setGroupOwned(Boolean g) {
	    if (g == null)
		g = false;
	    groupOwned = g;
	}

	public Long getCommentsSection() {
		return commentsSection;
	}
	public void setCommentsSection(Long commentsSection) {
		this.commentsSection = commentsSection;
	}
	
	public Date getLastCommentChange() {
		return lastCommentChange;
	}
	public void setLastCommentChange(Date lastCommentChange) {
		this.lastCommentChange = lastCommentChange;
	}
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		if(deleted == null) {
			deleted = false;
		}
		this.deleted = deleted;
	}
	
	public Double getPoints() {
		return points;
	}
	public void setPoints(Double points) {
		this.points = points;
	}
}
