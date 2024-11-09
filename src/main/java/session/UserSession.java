package session;

import koikingdom.pojo.Account;

public class UserSession {
	 private static Account currentAccount;

	    // Lấy thông tin tài khoản hiện tại
	    public static Account getCurrentAccount() {
	        return currentAccount;
	    }

	    // Lưu thông tin tài khoản vào session
	    public static void setCurrentAccount(Account account) {
	        currentAccount = account;
	    }

	    // Xóa thông tin tài khoản (logout)
	    public static void clear() {
	        currentAccount = null;
	    }
}
