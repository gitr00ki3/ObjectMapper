package com.abhishek.dto;

public class StudentDto {
	private String rNumber;
	private String fName;
	private String lName;
	private String phNumber;
	private String address;

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentDto [rNumber=");
		builder.append(rNumber);
		builder.append(", fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", phNumber=");
		builder.append(phNumber);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}

}
