package musicStore;

public class User {
	
	 	private String userName;
	    private String phoneNumber;
	    private String address;
	
		public User(String userName, String phoneNumber, String address) {
			this.userName = userName;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		 public void printUserInfo(){
		        System.out.println("Kullanıcı Adı: " + userName);
		        System.out.println("Telefon Numarası: " + phoneNumber);
		        System.out.println("Adres: " + address);
		        System.out.println();
		    }

}
