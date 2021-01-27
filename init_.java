import com.netsdk.lib.NetSDKLib;

public class init_ {

    public static NetSDKLib netsdk = NetSDKLib.NETSDK_INSTANCE;
    public static NetSDKLib configsdk = NetSDKLib.CONFIG_INSTANCE;


    private static boolean bInit = false;
    private static boolean bLogopen = false;

    public static boolean init(NetSDKLib.fDisConnect disConnect, NetSDKLib.fHaveReConnect haveReConnect) {
        bInit = netsdk.CLIENT_Init(disConnect, null);
        if (!bInit) {
            System.out.println("SDK initialise failed");
            return false;
        }

        netsdk.CLIENT_SetAutoReconnect(haveReConnect, null);

        int waitTime = 5000;
        int tryTimes = 1;
        netsdk.CLIENT_SetConnectTime(waitTime, tryTimes);

        NetSDKLib.NET_PARAM netParam = new NetSDKLib.NET_PARAM();
        netParam.nConnectTime = 1000;
        netParam.nGetConnInfoTime = 3000;
        netsdk.CLIENT_SetNetworkParam(netParam);
        return true;
    }

    public static void cleanup() {
        if (bLogopen) {
            netsdk.CLIENT_LogClose();
        }
        if (bInit) {
            netsdk.CLIENT_Cleanup();
        }
    }
}