package patientDTO;

import java.io.Serializable;

public class patientDTO implements Serializable{
	private String pName;
	private String pAddr;
	private String pNo;
	private float billAmt;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddr() {
		return pAddr;
	}
	public void setpAddr(String pAddr) {
		this.pAddr = pAddr;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "patientDTO [pName=" + pName + ", pAddr=" + pAddr + ", pNo=" + pNo + ", billAmt=" + billAmt + "]";
	}
	
	

}
