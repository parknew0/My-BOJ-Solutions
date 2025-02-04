
import java.io.*;
import java.util.*;

class Person {
    String name;
    int age;

    Person(int age, String name)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  age +" " + name;
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            int age = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            people[i] = new Person(age, name);
        }

        Arrays.sort(people, new PersonComparator());

        for (Person person : people) {
            bw.write(person + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}