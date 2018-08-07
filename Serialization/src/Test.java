import java.io.*;
class Studentinfo implements Serializable
{
    String name;
    int rid;
    static String contact;
    Studentinfo(String n, int r, String c)
    {
    this.name = n;
    this.rid = r;
    //static fields doesn't get serialized
    this.contact = c;
    }
}

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Studentinfo si = new Studentinfo("Rohith", 104, "Sharma");
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}