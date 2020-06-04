/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_administration;

import java.util.*;

//Elif Fırtana 170315023 comp
/**
 *
 * @author elif
 */
public class University_administration {

    private LinkedList<Student> students;
      int counter1=0;

    private LinkedList<Course> courses;
        int counter2=0;

    private LinkedList<Instructor> instructors;
        int counter3=0;



    public University_administration()
    {
         students  = new  LinkedList<>();  
    }
    {
         courses  = new  LinkedList<>();  
    }
    {
         instructors  = new  LinkedList<>();  
    }
    
    public void add_Stu(String name, String surname,String birthday, String department )
    {
        Student s= new Student(counter1,name,surname,birthday,department);
        students.add(s);
        counter1++;
    }
    
    public void add_Cou(String name, String language,String hour, String department )
    {
        Course c= new Course(counter2,name,language,hour,department);
        courses.add(c);
        counter2++;
    }
    
    public void add_Ins(String academictitle, String name, String surname,String birthday, String department )
    {
        Instructor i= new Instructor (counter3, academictitle,name,surname,birthday,department);
        instructors.add(i);
        counter3++;
    }
    
    public void update_stu(int id)
    {int a=0;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("which property do you want to change \n 1 for name \n 2 for surname \n 3 for birthday \n 4 for department");
        int select = input.nextInt();
        Student s1 = new Student(0,"","","","");
        
        for(int i=0 ;i<students.size();i++)
        {
          Student st = students.get(i);
          if(st.get_id()==id)
          {
              s1=st;
             a=1; 
          }
        }
        if (a==0)
        {
            System.out.print("out of id in update");
            s1=null;
            return;
        }
        switch(select){
            case 1: 
                System.out.print("enter new name..... ");
                String n_name = input2.nextLine();
                
                s1.set_name(n_name);
                break;
            case 2: 
                System.out.print("enter new surname..... ");
                String n_surname = input2.nextLine();
                s1.set_surname(n_surname);
                break;
            case 3: 
                System.out.print("enter new birthday..... ");
                String n_birthday = input2.nextLine();
                s1.set_birthday(n_birthday);
                break;
            case 4: 
                System.out.print("enter new department ..... ");
                String n_department = input2.nextLine();
                s1.set_department(n_department);
                break;
            default:
                System.out.print("wrong choise");
                break;
        }        
    }
    
    public void update_cou(int id)
    {int a=0;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("which property do you want to change \n 1 for name \n 2 for language \n 3 for hour \n 4 for department");
        int select = input.nextInt();
        Course c1 = new Course(0,"","","","");
        
        for(int i=0 ;i<courses.size();i++)
        {
          Course co = courses.get(i);
          if(co.get_id()==id)
          {
              c1=co;
             a=1; 
          }
        }
        if (a==0)
        {
            System.out.print("out of id in update");
            c1=null;
            return;
        }
        switch(select){
            case 1: 
                System.out.print("enter new name..... ");
                String n_name = input2.nextLine();
                
                c1.set_name(n_name);
                break;
            case 2: 
                System.out.print("enter new language..... ");
                String n_language = input2.nextLine();
                c1.set_language(n_language);
                break;
            case 3: 
                System.out.print("enter new hour..... ");
                String n_hour = input2.nextLine();
                c1.set_hour(n_hour);
                break;
            case 4: 
                System.out.print("enter new department ..... ");
                String n_department = input2.nextLine();
                c1.set_department(n_department);
                break;
            default:
                System.out.print("wrong choise");
                break;
        }        
    }
    
    public void update_ins(int id)
    {int a=0;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("which property do you want to change \n 1 for academictitle \n 2 for name \n 3 for surname \n 4 for birthday \n 5 for department");
        int select = input.nextInt();
        Instructor i1 = new Instructor(0,"","","","","");
        
        for(int i=0 ;i<instructors.size();i++)
        {
          Instructor in = instructors.get(i);
          if(in.get_id()==id)
          {
              i1=in;
             a=1; 
          }
        }
        if (a==0)
        {
            System.out.print("out of id in update");
            i1=null;
            return;
        }
        switch(select){
            
            case 1: 
                System.out.print("enter new academictitle..... ");
                String n_academictitle = input2.nextLine();
                
                i1.set_academictitle(n_academictitle);
                break;
            
            case 2: 
                System.out.print("enter new name..... ");
                String n_name = input2.nextLine();
                
                i1.set_name(n_name);
                break;
            case 3: 
                System.out.print("enter new surname..... ");
                String n_surname = input2.nextLine();
                i1.set_surname(n_surname);
                break;
            case 4: 
                System.out.print("enter new birthday..... ");
                String n_birthday = input2.nextLine();
                i1.set_birthday(n_birthday);
                break;
            case 5: 
                System.out.print("enter new department ..... ");
                String n_department = input2.nextLine();
                i1.set_department(n_department);
                break;
            default:
                System.out.print("wrong choise");
                break;
        }        
    }
    
    public int remove_stu(int id)
    {
        int a=0;
        
        
        for(int i=0 ;i<students.size();i++)
        {
          Student st = students.get(i);
          if(st.get_id()==id)
          {
             students.remove(i);
             a=1;
             swap();
             return a;
          }
        }
        if (a==0)
        {
            System.out.print("out of id in remove");
            return a ;
        }
        return a;
    }
    
    public int remove_cou(int id)
    {
        int a=0;
        
        
        for(int i=0 ;i<courses.size();i++)
        {
          Course co = courses.get(i);
          if(co.get_id()==id)
          {
             courses.remove(i);
             a=1;
             swap2();
             return a;
          }
        }
        if (a==0)
        {
            System.out.print("out of id in remove");
            return a ;
        }
        return a;
    }
    
    public int remove_ins(int id)
    {
        int a=0;
        
        
        for(int i=0 ;i<instructors.size();i++)
        {
          Instructor in = instructors.get(i);
          if(in.get_id()==id)
          {
             instructors.remove(i);
             a=1;
             swap3();
             return a;
          }
        }
        if (a==0)
        {
            System.out.print("out of id in remove");
            return a ;
        }
        return a;
    }
    
    public void swap()
    {
        int sayac=0;
        for(Student s: students )
        {
            s.set_id(sayac);
           sayac++; 
        }
    }
    
    public void swap2()
    {
        int sayac=0;
        for(Course c: courses )
        {
            c.set_id(sayac);
           sayac++; 
        }
    }
    
    public void swap3()
    {
        int sayac=0;
        for(Instructor i: instructors )
        {
            i.set_id(sayac);
           sayac++; 
        }
    }
    
    public void list_all_stu()
    {
        for(Student s: students )
        {
            System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
        }
        
    }
    
    public void list_all_cou()
    {
        for(Course c: courses )
        {
            System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
        }
        
    }
    
    public void list_all_ins()
    {
        for(Instructor i: instructors )
        {
            System.out.println(i.get_id()+" "+i.get_academictitle()+" "+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
        }
        
    }
    
    public void list_StudentsByProperty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the property you want to list by");
        System.out.println("Press 1 for id, 2 for name, 3 for surname, 4 for birthday, 5 for department");
        int selection = 0;
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Wrong Input!");
            return;
        }
        
        switch(selection){
            case 1:
                try{
                    System.out.print("Enter ID:");
                    int id = sc.nextInt();
                    for(Student s : students){
                        if(s.get_id()==id)
                            System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
                    }
                }catch(Exception e){
                    System.out.println("Wrong Input!");
                    return;
                }
                break;                
            case 2:
                System.out.print("Enter Name:");
                String name = sc.nextLine();
                for(Student s : students){
                    if(s.get_name().toLowerCase().contains(name.toLowerCase()))
                        System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
                }
                break;
            case 3:
                System.out.print("Enter Surname:");
                String surname = sc.nextLine();
                for(Student s : students){
                    if(s.get_surname().toLowerCase().contains(surname.toLowerCase()))
                        System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
                }
                break;
            case 4:
                System.out.print("Enter Birthday:");
                String birthday = sc.nextLine();
                for(Student s : students){
                    if(s.get_birthday().toLowerCase().contains(birthday.toLowerCase()))
                        System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
                }
                break;
            case 5:
                System.out.print("Enter Department:");
                String department = sc.nextLine();
                for(Student s : students){
                    if(s.get_department().toLowerCase().contains(department.toLowerCase()))
                        System.out.println(s.get_id()+" "+s.get_name()+" "+s.get_surname()+" "+s.get_birthday()+" "+s.get_department());
                }
                break;
            default:
                System.out.println("You typed wrong number!");
        }
    }
    
    public void list_CoursesByProperty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the property you want to list by");
        System.out.println("Press 1 for id, 2 for name, 3 for language, 4 for hour, 5 for department");
        int selection = 0;
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Wrong Input!");
            return;
        }
        
        switch(selection){
            case 1:
                try{
                    System.out.print("Enter ID:");
                    int id = sc.nextInt();
                    for(Course c : courses){
                        if(c.get_id()==id)
                            System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
                    }
                }catch(Exception e){
                    System.out.println("Wrong Input!");
                    return;
                }
                break;                
            case 2:
                System.out.print("Enter Name:");
                String name = sc.nextLine();
                for(Course c : courses){
                    if(c.get_name().toLowerCase().contains(name.toLowerCase()))
                        System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
                }
                break;
            case 3:
                System.out.print("Enter Language:");
                String language = sc.nextLine();
                for(Course c : courses){
                    if(c.get_language().toLowerCase().contains(language.toLowerCase()))
                        System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
                }
                break;
            case 4:
                System.out.print("Enter Hour:");
                String hour = sc.nextLine();
                for(Course c: courses){
                    if(c.get_hour().toLowerCase().contains(hour.toLowerCase()))
                        System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
                }
                break;
            case 5:
                System.out.print("Enter Department:");
                String department = sc.nextLine();
                for(Course c: courses){
                    if(c.get_department().toLowerCase().contains(department.toLowerCase()))
                        System.out.println(c.get_id()+" "+c.get_name()+" "+c.get_language()+" "+c.get_hour()+" "+c.get_department());
                }
                break;
            default:
                System.out.println("You typed wrong number!");
        }
    }
    
    public void list_InstructorsByProperty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the property you want to list by");
        System.out.println("Press 1 for id, 2 for academictitle, 3 for name, 4 for surname, 5 for birthday, 6 for department");
        int selection = 0;
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Wrong Input!");
            return;
        }
        
        switch(selection){
            case 1:
                try{
                    System.out.print("Enter ID:");
                    int id = sc.nextInt();
                    for(Instructor i : instructors){
                        if(i.get_id()==id)
                            System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                    }
                }catch(Exception e){
                    System.out.println("Wrong Input!");
                    return;
                }
                break;                
            case 2:
                System.out.print("Enter Acemictitle:");
                String academictitle = sc.nextLine();
                for(Instructor i : instructors){
                    if(i.get_academictitle().toLowerCase().contains(academictitle.toLowerCase()))
                        System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                }
                break;
            case 3:
                System.out.print("Enter Name:");
                String name = sc.nextLine();
                for(Instructor i : instructors){
                    if(i.get_name().toLowerCase().contains(name.toLowerCase()))
                        System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                }
                break;
            case 4:
                System.out.print("Enter Surname:");
                String surname = sc.nextLine();
                for(Instructor i : instructors){
                    if(i.get_surname().toLowerCase().contains(surname.toLowerCase()))
                        System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                }
                break;
            case 5:
                System.out.print("Enter Birthday:");
                String birthday = sc.nextLine();
                for(Instructor i : instructors){
                    if(i.get_birthday().toLowerCase().contains(birthday.toLowerCase()))
                        System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                }    
            case 6:
                System.out.print("Enter Department:");
                String department = sc.nextLine();
                for(Instructor i : instructors){
                    if(i.get_department().toLowerCase().contains(department.toLowerCase()))
                        System.out.println(i.get_id()+" "+i.get_academictitle()+""+i.get_name()+" "+i.get_surname()+" "+i.get_birthday()+" "+i.get_department());
                }
                break;
            default:
                System.out.println("You typed wrong number!");
        }
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        University_administration u = new University_administration();
        //STUDENT TESTS
        //Add test
        System.out.println("-----TESTING ADD STUDENT-----");
        u.add_Stu("ayşe", "bilen", "1995", "comp");
        u.add_Stu("ceylan", "derin", "1999", "comp");
        u.add_Stu("elif", "fırtana", "1999", "comp");
        u.add_Stu("gülçin", "hale", "1996", "comp");
        u.add_Stu("irem", "kahraman", "2000", "comp");
        
        //ListAll Test
        System.out.println("Testing all students");
        u.list_all_stu();
        
        //List By Property Test
        System.out.println("-----TESTING LIST BY PROPERTY-----");
        u.list_StudentsByProperty();
        
        //Remove Test
        System.out.println("-----TESTING REMOVE STUDENT-----");
        u.remove_stu(3);
        System.out.println("Students after remove");
        u.list_all_stu();
        
        //Update Test
        System.out.println("-----TESTING UPDATE STUDENT-----");
        u.update_stu(2);
        System.out.println("Students after update");
        u.list_all_stu();

        //COURSE TESTS
        //Add test
        u.add_Cou("java","english" ,"20" ,"comp" );
        u.add_Cou("css","english" ,"25" ,"comp" );
        u.add_Cou("phyton","english" ,"30" ,"comp" );
        u.add_Cou("html","english" ,"35" ,"comp" );
        
        //ListAll Test
        System.out.println("-----Testing all courses-----");
        u.list_all_cou();
        
        //List By Property Test
        System.out.println("-----TESTING LIST BY PROPERTY-----");
        u.list_CoursesByProperty();
        
        //Remove Test
        System.out.println("-----TESTING REMOVE COURSE-----");
        u.remove_cou(1);
        System.out.println("Courses after remove");
        u.list_all_cou();
        
        //Update Test
        u.update_cou(2);
        System.out.println("Courses after update");
        u.list_all_cou();

        //INSTRUCTOR TESTS
        //Add test
        u.add_Ins("prof","ahmet","bulut" ,"1940" ,"civil" );
        u.add_Ins("prof","ceyda","duru" ,"1950" ,"civil" );
        u.add_Ins("prof","derya","eren" ,"1960" ,"civil" );
        u.add_Ins("prof","furkan","gün" ,"1970" ,"civil" );
        
        //ListAll Test
        System.out.println("-----Testing all instructors-----");
        u.list_all_ins();
        
        //List By Property Test
        System.out.println("-----TESTING LIST BY PROPERTY-----");
        u.list_InstructorsByProperty();
        
        //Remove Test
        System.out.println("-----TESTING REMOVE INSTRUCTOR-----");
        u.remove_ins(3);
        System.out.println("Instructors after remove");
        u.list_all_ins();
        
        //Update Test
        u.update_ins(2);
        System.out.println("Instructors after update");
        u.list_all_ins();
       
    }
    
