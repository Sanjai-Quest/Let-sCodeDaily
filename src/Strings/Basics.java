package Strings;

public class Basics {

    public static void main(String[] args) {
        String name = "Sanjai"; //Stored in the Same String Pool
        String b = "Sanjai"; //Stored in the Same String Pool as name
        System.out.println(name == b);//gives true. because objects are inside string pool
        System.out.println(b);
        //If i want to modify b to different object. It can't be done. Because Strings are immutable.
        //But there's a way to do that.
        //We are allowed to assign an ref variable to different object to modify the objects.
        b = "Mitsuha"; //It is allowed

        System.out.println(name);
        System.out.println(b);

        //What if i want to check the object?
        //Two method of comparisons. == and .equals()
        //== Checks for objects inside the String Pool. If the values are same and inside the String pool. Output is True
        //.equals helps in checking the values alone. which can be used for objects outside the String pool.

        //Method 1: ==
        String name1 = new String("Sanjai");
        String name2 = new String("Sanjai");
        //Both have same values but "new" keywords helps in creating objects outside pool but inside heap.
        //So we compare the values.
        System.out.println(name1 == name2);//gives false

        //Method 2: .equals
        System.out.println(name1.equals(name2));//gives true
    }
}
