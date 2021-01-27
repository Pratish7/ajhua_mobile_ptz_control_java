public class logoutModule {

    public static boolean logout() {
        if (loginModule.m_hLoginHandle.longValue() == 0) {
            return false;
        }

        boolean bRet = loginModule.netsdk.CLIENT_Logout(loginModule.m_hLoginHandle);
        if (bRet) {
            loginModule.m_hLoginHandle.setValue(0);
        }

        return bRet;
    }
}