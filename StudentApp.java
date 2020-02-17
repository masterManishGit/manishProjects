
package studentapp;

import java.util.Scanner;



public class StudentApp 
{
    static Student[] stud = new Student[100];

    static int i = 0;
    
    public static void getMenu() 
    {
     Scanner sc = new Scanner(System.in);
        while (true) {

        int select;
        System.out.println("1. Add Student Record");
        System.out.println("2. View Student Record");
        System.out.println("3. Update Student Record");
        System.out.println("4. Delete Student Record");
        System.out.println("0. Exit");
        select = sc.nextInt();

        switch (select) {
        case 1:
        add(stud);
        break;
        case 2:
            view(stud);

        break;
      /* // case 3:
            update(stud);
        break;
        case 4:
            delete(int id);
        break;
            */
        case 0:
        return;
        default:
        System.out.println("Invalid Option");
        }
    }
    }
    public static void add(Student[] stud) 
    {
    Scanner sc = new Scanner(System.in);
    int numID;
    String center;
    String userName, course;

    int addMore;

    do {

        System.out.println("1. Enter Student ID: ");
        numID = sc.nextInt();
        sc.nextLine();
        System.out.println("2. Enter Student Name");
        userName = sc.nextLine();
        System.out.println("3. Enter Student Course");
        course = sc.nextLine();
        System.out.println("4. Enter Student center");
        center = sc.next();
        stud[i] = new Student(numID, userName, course,center);
        ++i;

        System.out.println("To add another Student Record Press 1");
        addMore = sc.nextInt();
    } while (addMore == 1);

    }
     public static void view(Student[] stud) {

    for (Student element : stud)
    {
        if (null != element) {
        System.out.println("1. Student ID: " + element.getId());
        System.out.println("2. Student Name: " + element.getName());
        System.out.println("3. Student Course: " + element.getCourse());
        System.out.println("4. Student Year: " + element.getCenter() + "\n");
        }
    }
     }

     public void update(Student s){
         Scanner scan=new Scanner(System.in);
    boolean edit = true;
    while(edit){
        System.out.println(String.format("Select operation:\n1. Change name\n2. Change ID\n3. Change course\n4. change center"));
        int opt = scan.nextInt();
        switch(opt){
            case 1:
                String newName = scan.next();
                s.setName(newName);
                break;
            case 2:
                int newID = scan.nextInt();
                s.setId(newID);
                break;
            case 3:
                String newcourse = scan.next();
                s.setName(newcourse);
                break;
            case 4:
                String newcenter = scan.next();
                s.setName(newcenter);
                break;
            
            default:
                System.out.println("no such option");
                break;
        }
        
    }
}
    
    public static void main(String[] args) 
    {
       getMenu();
    }
    
}
