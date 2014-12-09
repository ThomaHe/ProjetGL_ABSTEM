public class Utilisateur {

	
	public void seConnecter(String role) {
		if (role == "manager") {
			Manager manager = new Utilisateur();
			manager.seConnecter();
		} else {
			
		}
	}
	
	public void seDeconnecter() {
		
	}
	
	
}

