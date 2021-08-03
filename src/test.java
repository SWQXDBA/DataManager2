


import java.util.ArrayList;
import java.util.Timer;

public class test {

    public static void main(String[] args) {
        String path = "C:\\Users\\SWQXDBA\\IdeaProjects\\DataManager2\\src\\data.txt";

        Person person = new Person();
        person.name = "xiaoming";
        person.age = 18;



        person.list = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            person.list.add(new Card(10086));
            person.list.add(new Card(23310086));
        }



        System.out.println("ok");
        try {

//            SaveHelper saveHelper = new SaveHelper();
//            long start = System.currentTimeMillis();
//            saveHelper.saveToBuffer(person);
//            System.out.println("save used"+(System.currentTimeMillis()-start)+"mills");
//            System.out.println(saveHelper.getBytes().length);
//            Person p2 = saveHelper.loadFromBuffer();
//            System.out.println("load used"+(System.currentTimeMillis()-start)+"mills");

//            long startTime,endTime;
//            startTime = System.currentTimeMillis();
//            SaveHelper.save(path,person);
//            endTime = System.currentTimeMillis();
//            System.out.println("use"+(endTime-startTime)+"mills to save");





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
