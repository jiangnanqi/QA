package com.view;


public class Event_AnswerView {
	//问题表
	private String USERQUESTIONID;
	private String QUESTIONTITLE;
	private String QUESTIONTIME;
	private String ISFAQ;
	private String USERNAME;
	private String USERID;
	
	//答案
	private String FAQANSWERID;
	private String FAQANSWER;

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String USERID) {
		this.USERID = USERID;
	}

	public String getFAQANSWERID() {
		return FAQANSWERID;
	}
	public void setFAQANSWERID(String fAQANSWERID) {
		FAQANSWERID = fAQANSWERID;
	}
	public String getFAQANSWER() {
		return FAQANSWER;
	}
	public void setFAQANSWER(String fAQANSWER) {
		FAQANSWER = fAQANSWER;
	}
	public String getUSERQUESTIONID() {
		return USERQUESTIONID;
	}
	public void setUSERQUESTIONID(String uSERQUESTIONID) {
		USERQUESTIONID = uSERQUESTIONID;
	}
	public String getQUESTIONTITLE() {
		return QUESTIONTITLE;
	}
	public void setQUESTIONTITLE(String qUESTIONTITLE) {
		QUESTIONTITLE = qUESTIONTITLE;
	}
	public String getQUESTIONTIME() {
		return QUESTIONTIME;
	}
	public void setQUESTIONTIME(String qUESTIONTIME) {
		QUESTIONTIME = qUESTIONTIME;
	}
	public String getISFAQ() {
		return ISFAQ;
	}
	public void setISFAQ(String iSFAQ) {
		ISFAQ = iSFAQ;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	
}
