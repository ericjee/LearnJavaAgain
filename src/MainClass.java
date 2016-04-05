import com.alibaba.fastjson.JSON;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eric on 1/13/16.
 */
public class MainClass {

//    public static void main(String args[]) {
//        try{
//            Socket client = new Socket("10.7.243.91",6666);
//
//            System.out.println("Try to connect to:"+client.getInetAddress());
//            System.out.println("=========");
//            //向服务端发送json数据
//            Map<String,Object> pars = new HashMap<String,Object>();
//            pars.put("data","234");
//            pars.put("data2",345);
//            pars.put("data3","中文");
//            pars.put("data4",21.23);
//            String json = JSON.toJSONString(pars);
//            //向Server发送消息
//            OutputStream out = client.getOutputStream();
//            DataOutputStream dataout = new DataOutputStream(out);
//            dataout.writeUTF("向客户端发送json数据："+new String(json.getBytes(),"UTF-8"));
//
//            //接收Server消息
//            InputStream in = client.getInputStream();
//            DataInputStream datain = new DataInputStream(in);
//            System.out.println("Server Said:"+new String(datain.readUTF().getBytes(),"UTF-8"));
//
//            client.close();
//        }catch(IOException e){
//            System.out.println("Internet error !");
//            e.printStackTrace();
//        }
//    }
    public static void main(String args[]) {
        try{
            Socket client = new Socket("192.168.1.83",6667);

            System.out.println("Try to connect to:"+client.getInetAddress());
            System.out.println("=========");
            //向服务端发送json数据
            Map<String,Object> pars = new HashMap<String,Object>();
            pars.put("status","-1");
            pars.put("data2",345);
            pars.put("data3","中文");
            pars.put("data4",21.23);
            String json =JSON.toJSONString(pars);
            //向Server发送消息
            OutputStream out = client.getOutputStream();
            DataOutputStream dataout = new DataOutputStream(out);
            dataout.writeUTF(new String(json.getBytes(),"UTF-8"));

            //接收Server消息
            InputStream in = client.getInputStream();
            DataInputStream datain = new DataInputStream(in);
            System.out.println(new String(datain.readUTF().getBytes(),"UTF-8"));
            dataout.close();
            datain.close();
            client.close();

        }catch(IOException e){
            System.out.println("Internet error !");
            e.printStackTrace();
        }
    }
}
