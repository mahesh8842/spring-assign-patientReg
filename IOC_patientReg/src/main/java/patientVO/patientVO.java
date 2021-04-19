package patientVO;

public class patientVO {
	private String pName;
	private String pAddr;
	private String pNo;
	private String billAmt;
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
	public String getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(String billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "patientVO [pName=" + pName + ", pAddr=" + pAddr + ", pNo=" + pNo + ", billAmt=" + billAmt + "]";
	}
	

}
