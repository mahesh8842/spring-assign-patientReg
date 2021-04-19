package mainController;

import patientDTO.patientDTO;
import patientVO.patientVO;
import service.ipatientManagement;

public class mainController {
	private ipatientManagement service;

	public mainController(ipatientManagement service) {
		System.out.println("Main controller :: Single param constructor invoked");
		this.service = service;
	}
	public String registerPatient(patientVO vo) throws Exception{
		patientDTO dto=new patientDTO();
		dto.setpName(vo.getpName());
		dto.setpAddr(vo.getpAddr());
		dto.setpNo(vo.getpNo());
		dto.setBillAmt(Float.parseFloat(vo.getBillAmt()));
		
		return service.calculateDiscount(dto);	
	}
}
