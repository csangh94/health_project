package com.mega.mvc08;

public class ReplyDTO {
	String id;
	String bbsNum;
	String content;
	String writer;
	
	
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", bbsNum=" + bbsNum + ", content=" + content + ", writer=" + writer + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBbsNum() {
		return bbsNum;
	}
	public void setBbsNum(String bbsNum) {
		this.bbsNum = bbsNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
