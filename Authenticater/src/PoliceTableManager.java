import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class PoliceTableManager implements TableManager{
	
	@Override
	public String getValues(String userName) {
		String[] values = new String[3];
		ResultSet res = null;
		try {
		String sqlData = "select * from polis where id='" + userName + "'";
		res=name(sqlData);
		while(res.next()) {
			values[0]=res.getString("id");	
			values[1]=res.getString("password");
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return values[0] + "-" + values[1];
	}

	@Override
	public void login(PersonalInformation personalInformation) {

		String str = getValues(personalInformation.getUsername());
		String[] parts = str.split("-");
		String dtUser = parts[0]; 
		String dtPass = parts[1];

		if(dtUser.equals(personalInformation.getUsername())) {
			if(dtPass.equals(String.valueOf(personalInformation.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Login Sucessfully...");
				}
			else {
					
			JOptionPane.showMessageDialog(null, "Not Found...");
				}
		}
		else {
			JOptionPane.showMessageDialog(null, "Not Found...");
		}
	}

	@Override
	public void singUp(PersonalInformation personalInformation) {
		try {				
			Statement myStat = (Statement) (Statement) DatabaseConnectionSingleton.getInstance().getConnection();
			myStat.executeUpdate(insertInTo(personalInformation));	 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String insertInTo(PersonalInformation personalInformation) {
		
		return "INSERT INTO polis (name,surname,id,password) VALUES ('" + personalInformation.getName() + "','" + personalInformation.getSurname() + "','" + personalInformation.getUsername() 
				+"','"+ personalInformation.getPassword() + "')";
		
	}

	@Override
	public ResultSet name(String sqlData) {
		ResultSet res = null;
		try {
			Statement myStat = (Statement) DatabaseConnectionSingleton.getInstance().getConnection();
			res = myStat.executeQuery(sqlData);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return res;
	}
	public void changePassword(PersonalInformation personalInformation) {
		try {					
			Statement myStat = (Statement) DatabaseConnectionSingleton.getInstance().getConnection().createStatement();
			myStat.executeUpdate(update(personalInformation));
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	public String update(PersonalInformation personalInformation) {
		return "UPDATE asker SET password =" + personalInformation.getNewPassword() + " WHERE id ='" + personalInformation.getUsername() + "'";
				
	}
}
