package kodlamaIo;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " numaralı kullanıcı kaydedildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " numaralı kullanıcı silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " numaralı kullanıcı güncellendi.");
	}
	
	public void changeFirstName(User user, String firstName) {
		user.setFirstName(firstName);
		System.out.println(user.getId() + " numaralı kullanıcının ismi değiştirildi: " + firstName);
	}
	
	public void changeLastName(User user, String lastName) {
		user.setLastName(lastName);
		System.out.println(user.getId() + " numaralı kullanıcının soyismi değiştirildi: " + lastName);
	}
	
	public void changeEmail(User user, String email) {
		user.setEmail(email);
		System.out.println(user.getId() + " numaralı kullanıcının emaili değiştirildi: " + email);
	}
	
	public void changeUserName(User user, String userName) {
		user.setUserName(userName);
		System.out.println(user.getId() + " numaralı kullanıcının kullanıcı adı değiştirildi: " + userName);
	}
	
	public void changePassword(User user, String password) {
		user.setPassword(password);
		System.out.println(user.getId() + " numaralı kullanıcının şifresi değiştirildi: " + password);
	}
	
	public void verifyEmail(User user) {
		user.setVerifiedEmail(true);
		System.out.println(user.getId() + " numaralı kullanıcının emaili başarıyla onaylandı.");
	}
	
}
