package models;

public class Requests {
	int requestID;
	int requestedByEmployeeID;
	Boolean isApproved = false;
	
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public int getRequestedByEmployeeID() {
		return requestedByEmployeeID;
	}
	public void setRequestedByEmployeeID(int requestedByEmployeeID) {
		this.requestedByEmployeeID = requestedByEmployeeID;
	}
	public Boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}
}
