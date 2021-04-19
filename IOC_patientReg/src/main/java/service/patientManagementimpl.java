package service;

import patientBO.patientBO;
import patientDAO.ipatientDAO;
import patientDTO.patientDTO;

public class patientManagementimpl implements ipatientManagement{
	private ipatientDAO dao;
	
	public patientManagementimpl(ipatientDAO dao) {
		System.out.println("patient Managementimpl :: Single param constructor invoked");
		this.dao = dao;
	}

	@Override
	public String calculateDiscount(patientDTO dto) throws Exception {
		float amt=dto.getBillAmt();
		float disc=0;
		if(amt>200000) {
			disc=20;
			amt=(float) (amt-(0.2*amt));
		}else if(amt>100000) {
			disc=10;
			amt=(float) (amt-(0.1*amt));
		}
		patientBO bo=new patientBO();
		bo.setpName(dto.getpName());
		bo.setpAddr(dto.getpAddr());
		bo.setpNo(dto.getpNo());
		bo.setBillAmt(dto.getBillAmt());
		bo.setDisc(disc);
		bo.setNetBill(amt);
		int count=dao.insert(bo);
		return count==1?"patient Successfully registered --> netBill & eligible discount"+disc+" "+amt:"failed to register details";

}
}
