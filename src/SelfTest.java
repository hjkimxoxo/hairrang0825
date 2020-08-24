import java.util.List;

import hairrang.dao.GuestDao;
import hairrang.dao.impl.GuestDaoImpl;
import hairrang.dto.Guest;

public class SelfTest {

	public static void main(String[] args) {

		GuestDao dao = GuestDaoImpl.getInstance();
		
		List<Guest> list = dao.selectGuestByAll();
		System.out.println(list);
	}

}
