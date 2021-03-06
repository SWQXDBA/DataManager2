import java.io.*;
import java.nio.ByteBuffer;

public class SaveHelper{
    byte[]data ;
    public static  <T>  void  save(String path, T obj) throws IOException {
        File file = new File(path);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(obj);

        oos.flush();

        oos.close();

    }
    @SuppressWarnings({"unchecked"})
    public static  <T>  T load(String path) throws IOException, ClassNotFoundException {
        File file = new File(path);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        T t =(T)  ois.readObject();
        ois.close();

        return t;
    }

    public SaveHelper() {

    }

    public <T> void saveToBuffer(T obj) throws IOException {
        ByteArrayOutputStream opt = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(opt);
        oos.writeObject(obj);
        oos.flush();
        data = opt.toByteArray();
        oos.close();
    }
    @SuppressWarnings({"unchecked"})
    public   <T>  T loadFromBuffer() throws IOException, ClassNotFoundException {

        ByteArrayInputStream ipt = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(ipt);
        T t =(T)  ois.readObject();
        ois.close();

        return t;
    }
    public byte[] getBytes(){
        return data;
    }
}
