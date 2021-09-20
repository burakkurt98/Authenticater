import java.sql.ResultSet;

public interface TableManager {	
	String getValues(String userName);
	void login(PersonalInformation personalInformation);
	void singUp(PersonalInformation personalInformation);
	String insertInTo(PersonalInformation personalInformation);
	ResultSet name(String sqlData);
	void changePassword(PersonalInformation personalInformation);
}
