/*
 * Douglas Wendel Final Exam 2020
 */
public class ContactInformation {
	
	public void displayContactInformation() {
		
		String[] People = {"Jenny Smith 803-455-7857 ", "Colin Wight", "Ben Farmer", "Alisha Moore", "Tim Traverson"};
		//String[] phones = {"803-455-7857", "803-241-1241", "803-456-2342","532-124-1245", "124-678-5267"};
		String[] addresses = {"123 anywhere st.", "789 farmer road", "456 clayton ave.", "344 urban vista", "755 special ct."};
		
		//loop through contacts and display infomration
		for(int i = 0; i < People.length; ++i) {
			String lastName = People[i].substring(People[i].indexOf(" ")+1);
			String firstName = People[i].substring(0,People[i].indexOf(" "));
			String phoneNumber = People[i].substring(People[i].indexOf(" ")+2);
		}
	}

}
