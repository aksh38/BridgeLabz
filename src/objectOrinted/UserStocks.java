package objectOrinted;
import java.util.LinkedList;
import objectOriented.ShareList;

public class UserStocks 
{
	private String userName;
	private LinkedList<ShareList> shareList;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LinkedList<ShareList> getShareList() {
		return shareList;
	}
	public void setShareList(LinkedList<ShareList> shareList) {
		this.shareList = shareList;
	}
	
}
