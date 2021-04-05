package cm.hk.sp;

public class ValidateUsnAndPwd {

	public static void main(String[] args) {
		// showInbox(String user,);
		showInbox("pankaj40", "Qwerty123");

	}

	private static void showInbox(String usn, String pwd) {

		if (pwd.length() <= 8) {
			System.out.println("invalid length");

		}

		if (usn.equalsIgnoreCase("pankaj405") && pwd.equals("Qwerty#123"))

			System.out.println("Welcome " + usn);

	}
}
