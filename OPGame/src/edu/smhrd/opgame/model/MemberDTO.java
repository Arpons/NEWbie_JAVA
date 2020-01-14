package edu.smhrd.opgame.model;

public class MemberDTO {
	private String _id;
	private boolean _isLogined = false;

	public MemberDTO(String id, boolean isLogined) {
		this._id =id;
		this._isLogined = isLogined;
	}
	
		
	
	public String getID() {
		// TODO Auto-generated method stub
		return _id;
	}

	public boolean isLogined() {
		// TODO Auto-generated method stub
		return _isLogined;
	}

}
