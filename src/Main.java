import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        System.out.println(value);
        System.out.println(changevalue(value));

        Integer value1 = 33;
        System.out.println(value1);
        System.out.println(changevalue1(value1));

        Integer[] value2 = {3,4};
        System.out.println(Arrays.toString(value2));
        System.out.println(Arrays.toString(changevalue2(value2)));

        Integer[] value3 = {3,4};
        System.out.println(Arrays.toString(value3));
        System.out.println(Arrays.toString(changeValue3(value3)));

        Person person = new Person("Lyapis ","Trubetskoy");

        Person.changePerson(person);
        System.out.println(person);

        Person1 person1=new Person1("Lyapis ", "Trubetskoy");
        Person1.changePerson1(person1);
        System.out.println(person1);
    }
    public static int changevalue ( int value){
        value = 22;
        return value;
    }
    public static int changevalue1 (Integer value1){
        value1=22;
        return value1;
    }
    public static Integer[] changevalue2( Integer [] value2){
        Integer [] value0= {1,2};
        return value0;
    }
    public static Integer[] changeValue3(Integer [] value3){
        value3[0]=99;
        return value3;
    }

}