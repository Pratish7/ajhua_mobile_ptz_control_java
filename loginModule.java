import com.netsdk.lib.NetSDKLib;
import com.netsdk.lib.NetSDKLib.LLong;
import com.netsdk.lib.ToolKits;
import com.sun.jna.ptr.IntByReference;

public class loginModule {

    public static LLong m_hLoginHandle = new LLong(0);
    public static NetSDKLib netsdk = NetSDKLib.NETSDK_INSTANCE;
    public static NetSDKLib.NET_DEVICEINFO_Ex m_stDeviceInfo = new NetSDKLib.NET_DEVICEINFO_Ex();
    public static boolean login(String m_strIp, int m_nPort, String m_strUser, String m_strPassword) {
        IntByReference nError = new IntByReference(0);
        m_hLoginHandle = netsdk.CLIENT_LoginEx2(m_strIp, m_nPort, m_strUser, m_strPassword, 0, null, m_stDeviceInfo,
                nError);
        if (m_hLoginHandle.longValue() == 0) {
            System.err.printf("Login Device[%s] Port[%d] Failed. %s\n", m_strIp, m_nPort, ToolKits.getErrorCodePrint());
        } else {
            System.out.println("Login Success[" + m_strIp + "]");
        }
        return m_hLoginHandle.longValue() == 0 ? false : true;
    }
}