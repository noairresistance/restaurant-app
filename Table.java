import java.net.SocketException;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Table
{
    private Socket TableSkt = null;
    private ObjectInputStream ObjIn = null; // stream used to read in objects
    private ObjectOutputStream ObjOut = null; // stream used to output objects
    private InputStream CommIn = null; // stream used to read in strings
    private OutputStream CommOut = null; // stream used to ouput strings
    private boolean Connected = false;
    
    public Table()
    {
        // empty constructor
    }
    
    public void Handshake()
    {
        try
        {
            TableSkt = new Socket("localHost", 5555);
            System.out.println("connected.");
            Connected = true;
            CommIn = TableSkt.getInputStream();
            CommOut = TableSkt.getOutputStream();  
            //ObjIn = new ObjectInputStream(TableSkt.getInputStream());
           
            while(Connected)
            {
                String testbuffer = "Customer";
                System.out.println("Sending message.");
                CommOut.write(testbuffer.getBytes());
            
                byte[] buffer = new byte[1024];
                int MessageLength = CommIn.read(buffer);
                byte[] temp = new byte[MessageLength];
                
                System.arraycopy(buffer,0,temp,0,MessageLength);
                
                String received = new String(temp, "UTF-8");    
                System.out.println(received);
                    
                if(received.equals("Exit")) Connected = false;
                   
                //Food Item = (Food) ObjIn.readObject();
                    
                //System.out.println(Item.GetName());   
            }
                
            TableSkt.close();
        }
        catch(SocketException se)
        {
             System.exit(0);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
            // will need this exception later
/*            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }*/
       // }
    }
    
    public static void main(String argv[])
    {
        Table table1 = new Table();
        
        System.out.println("Attempting to connect");
        table1.Handshake();
        System.out.println("finished");
    }
}
