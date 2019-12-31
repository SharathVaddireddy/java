/**
 * 
 */
/**
 * @author sharath
 *
 */
package com.sharu.demo.abs;

import com.sharu.demo.model.ServerResponse;

public class AbstractController<T extends Object> {
	
	protected ServerResponse serverResponse=new ServerResponse();
	
	protected ServerResponse createServerResponse(String status, int code, String message, Object data, Object recordCount) {
		serverResponse.setStatus(status);
		serverResponse.setCode(code);
		serverResponse.setMessage(message);
		serverResponse.setData(data);
		serverResponse.setRecordCount(recordCount);
		return serverResponse;
	}
}