
public class TableManagerFactory{

	public TableManagerFactory() {
	}

	public void singUp(PersonalInformation personalInformation) {
		
		if(personalInformation.getJob().equals("Soldier")) {
			TableManager soldier = new SoldierTableManager();
			soldier.singUp(personalInformation);
		}
		else if(personalInformation.getJob().equals("Police")) {
			TableManager police = new PoliceTableManager();
			police.singUp(personalInformation);
		}
		else {
			
			TableManager presecutor = new ProsecutorTableManager();
			presecutor.singUp(personalInformation);
		}
	}	
	
	public void login(PersonalInformation personalInformation) {
		if(personalInformation.getJob().equals("Soldier")) {
			TableManager soldier = new SoldierTableManager();
			soldier.login(personalInformation);
		}
		else if(personalInformation.getJob().equals("Police")) {	
			TableManager police = new PoliceTableManager();
			police. login(personalInformation);
		}
		else{
			TableManager presecutor = new ProsecutorTableManager();
			presecutor.login(personalInformation);
		}
	}

	public void changePassword(PersonalInformation personalInformation) {
		if(personalInformation.getJob().equals("Soldier")) {
			TableManager soldier = new SoldierTableManager();
			soldier.changePassword(personalInformation);
		}
		else if(personalInformation.getJob().equals("Police")) {	
			TableManager police = new PoliceTableManager();
			police. changePassword(personalInformation);
		}
		else{
			TableManager presecutor = new ProsecutorTableManager();
			presecutor.changePassword(personalInformation);
		}
	}
}

