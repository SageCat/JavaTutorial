package $10_net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo
{
    public static void main(String[] args)
    {
        try (
                /*新建server socket*/
                ServerSocket serverSocket = new ServerSocket(8001);
                /*获取到socket*/
                Socket accept = serverSocket.accept();
                /*通过socket获取到字节输入流*/
                InputStream inputStream = accept.getInputStream();
                /*通过socket获取到字节输出流*/
                OutputStream outputStream = accept.getOutputStream();
                /*输出字节转换流，把字节输入流转换为 字符输入流*/
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
                /*创建文件输出流对象，创建一个文件*/
                FileWriter fileOutputStream = new FileWriter("res/server.txt");
                /*创建一个字符输出缓冲流对象，将文件输出流对象作为参数进行传递*/
                BufferedWriter bufferedWriter = new BufferedWriter(fileOutputStream);
        )
        {
            outputStream.write("服务器收到请求".getBytes());
            int len = -1;
            while ((len = inputStreamReader.read()) != -1)
            {
                bufferedWriter.write(len);
                System.out.print((char) len);
                bufferedWriter.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
