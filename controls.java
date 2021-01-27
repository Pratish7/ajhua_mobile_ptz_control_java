import com.netsdk.lib.NetSDKLib;

public class controls{
    public static boolean ptzControlUpStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_UP_CONTROL,1, 8, 0,0);

    }

    public static boolean ptzControlUpEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_UP_CONTROL, 0, 0, 0, 1);
    }

    public static boolean ptzControlDownStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_DOWN_CONTROL,1, 8, 0,0);

    }

    public static boolean ptzControlDownEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_DOWN_CONTROL, 0, 0, 0, 1);
    }

    public static boolean ptzControlLeftStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_LEFT_CONTROL,1, 8, 0,0);

    }

    public static boolean ptzControLeftEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_LEFT_CONTROL, 0, 0, 0, 1);
    }

    public static boolean ptzControlRightStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_RIGHT_CONTROL,1, 8, 0,0);

    }

    public static boolean ptzControlRightEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_PTZ_ControlType.NET_PTZ_RIGHT_CONTROL, 0, 0, 0, 1);
    }

    public static boolean ptzControlLeftUpStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_LEFTTOP,1, 8, 0,0, null);

    }

    public static boolean ptzControlLeftUptEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_LEFTTOP, 0, 0, 0, 1, null);
    }

    public static boolean ptzControlRightUpStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_RIGHTTOP,1, 8, 0,0, null);

    }

    public static boolean ptzControlRightUpEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_RIGHTTOP, 0, 0, 0, 1, null);
    }

    public static boolean ptzControlLeftDownStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_LEFTDOWN,1, 8, 0,0, null);

    }

    public static boolean ptzControlLeftDownEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_LEFTDOWN, 0, 0, 0, 1, null);
    }

    public static boolean ptzControlRightDownStart(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_RIGHTDOWN,1, 8, 0,0, null);

    }

    public static boolean ptzControlRightDownEnd(){
        return loginModule.netsdk.CLIENT_DHPTZControlEx2(loginModule.m_hLoginHandle, 0, NetSDKLib.NET_EXTPTZ_ControlType.NET_EXTPTZ_RIGHTDOWN, 0, 0, 0, 1, null);
    }

   
} 