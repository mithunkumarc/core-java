import java.io.* ;
class TestDeserialize
{
    public static void main(String[] args)
    {
        Studentinfo si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Studentinfo)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace(); }
            System.out.println(si.name);
            System.out. println(si.rid);
            System.out.println(si.contact);
        }
}