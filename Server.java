import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.io.InputStream;
import java.io.OutputStream;

public class Server
{
    private ServerSocket ServerSkt = null;
    private Socket skt = null;
    private ObjectInputStream ObjIn = null;
    private ObjectOutputStream ObjOut = null;
    private InputStream CommIn = null;
    private OutputStream CommOut = null;
    
    public Server()
    {
        // empty constructor
    }
    
    public void Handshake()
    {
        try
        {   
            ServerSkt = new ServerSocket(5555);
        }
        catch(IOException e)
        {
           System.out.println("IO error.");
        }
        
        while(true)
        {
            try
            {
                skt = ServerSkt.accept();
                System.out.println("connected.");
             
                CommIn = skt.getInputStream();
                CommOut = skt.getOutputStream();
            
                byte[] buffer = new byte[1024];
                System.out.println("receiving message.");
                int MessageLength = CommIn.read(buffer);
                byte[] temp = new byte[MessageLength];
                
                System.arraycopy(buffer,0,temp,0,MessageLength);
                
                String received = new String(temp, "UTF-8");    
                System.out.println(received);
            }               
            catch(SocketException error)
            {
                System.exit(0);
            }
            catch(IOException e)
            {
                System.out.println("IO Error." + e);
            }
            
            new ServerThread(skt).start();
        }
    }
    
    public static void main(String argv[])
    {
        Server server = new Server();
        System.out.println("starting server.");
        server.Handshake();
        System.out.println("Finished");
    }

}

class ServerThread extends Thread
{
    private Socket ClientSocket;
    
    public ServerThread(Socket x)
    {
        this.ClientSocket = x;
    }
    
    public void run()
    {
        try
        {
            System.out.println("Inside thread.");
            OutputStream CommOut = null;
            CommOut = ClientSocket.getOutputStream();
            String temp = "Exit";
            CommOut.write(temp.getBytes());
        //ObjOut = new ObjectOutputStream(skt.getOutputStream());
            //ObjOut.writeObject(newFood);
      /*      Food newFood = new Food("Burger", false);
            newFood.SetDescription("It's edible.");
            newFood.SetIngredients("Tomatoes");
            newFood.SetIngredients("Lettuce");
            newFood.SetIngredients("Cheese");*/
        }
        catch(IOException e)
        {
            System.out.println("IO error.");
        }
    }
}

