import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		
		logininfo.put("Nishi","123");
		logininfo.put("Sony","WORD");
		logininfo.put("Pony","abc");
		
	}
	
	public HashMap<String,String> getLoginInfo() {
		
		return logininfo;
		
	}
}
