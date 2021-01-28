import java.awt.Color;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.netsdk.lib.NetSDKLib.LLong;
import com.netsdk.lib.ToolKits;
import com.sun.jna.Native;
import java.awt.GridLayout;

public class stream {
    public static JFrame frame;
    public static Panel panel;	
	public static LLong startRealPlay(int channel, int stream, Panel realPlayWindow) {
		LLong m_hPlayHandle = loginModule.netsdk.CLIENT_RealPlayEx(loginModule.m_hLoginHandle, channel, Native.getComponentPointer(realPlayWindow), stream);
	
	    if(m_hPlayHandle.longValue() == 0) {
	  	    System.err.println("开始实时监视失败，错误码" + ToolKits.getErrorCodePrint());
	    } else {
	  	    System.out.println("Success to start realplay"); 
	    }
	    
	    return m_hPlayHandle;
	} 
	
	/**
	 * \if ENGLISH_LANG
	 * Start RealPlay
	 * \else
	 * 停止预览
	 * \endif
	 */
	public static void stopRealPlay(LLong m_hPlayHandle) {
		if(m_hPlayHandle.longValue() == 0) {
			return;
		}
		
		boolean bRet = loginModule.netsdk.CLIENT_StopRealPlayEx(m_hPlayHandle);
		if(bRet) {
			m_hPlayHandle.setValue(0);
		}
	}
public static void main(String args[]){
	init_.init(null, null);
	loginModule.login("192.168.1.108", 37777, "admin", "admin@123");
	frame = new JFrame();
    frame.setSize(500,500);
    frame.setLayout(new GridLayout(1,1));
    panel = new Panel();
    panel.setBackground(Color.BLACK);
    frame.add(panel);
	panel.setVisible(true);
    frame.setVisible(true);
   
	startRealPlay(0,0, panel);
}
}