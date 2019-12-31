package com.sharu.demo.model;

public class ServerResponse {
	private String status;
	private int code;
	private String message;
	private Object data;
	private Object recordCount;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Object recordCount) {
		this.recordCount = recordCount;
	}

	public ServerResponse() {
		super();
		this.status = "success";
		this.code = 2000;
	}
	
	
	
}