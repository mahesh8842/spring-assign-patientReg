package patientDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import patientBO.patientBO;

public class patientDAOimpl implements ipatientDAO{
	private static final String quer="INSERT INTO reg values(patient_id.nextval,?,?,?,?,?,?)";
	private DataSource ds;
	
	public patientDAOimpl(DataSource ds) {
		System.out.println("Patient DAO :: Single param constructor invoked");
		this.ds = ds;
	}

	@Override
	public int insert(patientBO bo) throws Exception {
		
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(quer);
			ps.setString(1, bo.getpName());
			ps.setString(2,bo.getpAddr());
			ps.setString(3, bo.getpNo());
			ps.setFloat(4,bo.getBillAmt());
			ps.setFloat(5, bo.getDisc());
			ps.setFloat(6, bo.getNetBill());
			count=ps.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;  // Exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //  Exception rethrowing
		}
		finally {
			//close jdbc objs
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}//finally
	
		return count;
	}

}
