package misl.spring.model;

public class JsonResponseModel {
	private String status = null;
	private Object result = null;

	public String getStatus() {
		return status;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
