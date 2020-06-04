/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_administration;

/**
 *
 * @author elif
 */
public class Student {
    private int student_id;
    private String name;
    private String surname;
    private String birthday;
    private String department;
    
    public Student(int id, String name , String surname , String birthday ,String department)
    {
        student_id=id;
        this.name=name ;
        this.surname=surname;
        this.birthday=birthday;
        this.department=department;
    }
    
    
    
    public void set_id(int id)
    {
        student_id=id;
        
    }
      public void set_name(String s_name)
    {
        name=s_name ;
        
    }
        public void set_surname(String s_surname)
    {
        surname=s_surname;
        
    }
          public void set_birthday(String s_birthday)
    {
        birthday=s_birthday;
        
    }
            public void set_department(String s_department)
    {
        department=s_department;
        
    }
         
    
    public int get_id()
    {
        return student_id;
        
    }
     public String get_name()
    {
        return name;
        
    }
      public String get_surname()
    {
        return surname;
        
    }
       public String get_birthday()
    {
        return birthday;
        
    }
      public String get_department()
    {
        return department;
        
    }
    
}
