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
public class Instructor {
    private int instructor_id;
    private String academictitle;
    private String name;
    private String surname;
    private String birthday;
    private String department;
    
    public Instructor(int id, String academictitle, String name , String surname , String birthday ,String department)
    {
        instructor_id=id;
        this.academictitle=academictitle ;
        this.name=name;
        this.surname=surname;
        this.birthday=birthday;
        this.department=department;
    }
    public void set_id(int id)
    {
        instructor_id=id;
        
    }
    
    
    public void set_academictitle(String i_academictitle)
    {
      academictitle=i_academictitle;        
    }
      public void set_name(String i_name)
    {
        name=i_name ;
        
    }
        public void set_surname(String i_surname)
    {
        surname=i_surname;
        
    }
          public void set_birthday(String i_birthday)
    {
        birthday=i_birthday;
        
    }
            public void set_department(String i_department)
    {
        department=i_department;
        
    }
            
    public int get_id()
    {
        return instructor_id;
        
    }
         
    
    public String get_academictitle()
    {
        return academictitle;
        
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
