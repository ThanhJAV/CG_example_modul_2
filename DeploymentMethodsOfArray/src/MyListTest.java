import java.util.Arrays;
public class MyListTest {
    public static <E> void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Thanh");
        myList.add("Nam");
        myList.add("Vu");
        myList.add("Nghia");
        myList.add("Toan");

        myList.remove(4);
//       System.out.println(myList.getElements());
         for (int i=0;i<myList.getSize();i++) {
            System.out.println(myList.getElements(i));
        }
        System.out.println(myList.getSize());
//        myList.setSize(3);




    }

}
