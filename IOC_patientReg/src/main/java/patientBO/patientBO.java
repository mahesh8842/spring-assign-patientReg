package patientBO;

public class patientBO {
	private String pName;
	private String pAddr;
	private String pNo;
	private float billAmt;
	private float disc;
	private float netBill;
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
	public float getDisc() {
		return disc;
	}
	public void setDisc(float disc) {
		this.disc = disc;
	}
	public float getNetBill() {
		return netBill;
	}
	public void setNetBill(float netBill) {
		this.netBill = netBill;
	}
	@Override
	public String toString() {
		return "patientBO [pName=" + pName + ", pAddr=" + pAddr + ", pNo=" + pNo + ", billAmt=" + billAmt + ", disc="
				+ disc + ", netBill=" + netBill + "]";
	}

}
