package $10_net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author g84196891
 */
public class ClientDemo
{
    public static void main(String[] args)
    {
        try (
                Socket localhost = new Socket("127.0.0.1", 8001);
                OutputStream outputStream = localhost.getOutputStream();
                InputStream inputStream = localhost.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        )
        {
            outputStream.write("你好".getBytes());
            int len = -1;
            while ((len = inputStreamReader.read()) != -1)
            {
                System.out.print((char) len);
            }
            localhost.shutdownOutput();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
