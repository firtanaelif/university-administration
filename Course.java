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
public class Course {
    private int course_id;
    private String name;
    private String language;
    private String hour;
    private String department;
    
    public Course(int id, String name , String language , String hour ,String department)
    {
        course_id=id;
        this.name=name ;
        this.language=language;
        this.hour=hour;
        this.department=department;
    }
    
    
    
    public void set_id(int id)
    {
        course_id=id;
        
    }
      public void set_name(String c_name)
    {
        name=c_name ;
        
    }
        public void set_language(String c_language)
    {
        language=c_language;
        
    }
          public void set_hour(String c_hour)
    {
        hour=c_hour;
        
    }
            public void set_department(String c_department)
    {
        department=c_department;
        
    }
         
    
    public int get_id()
    {
        return course_id;
        
    }
     public String get_name()
    {
        return name;
        
    }
      public String get_language()
    {
        return language;
        
    }
       public String get_hour()
    {
        return hour;
        
    }
      public String get_department()
    {
        return department;
        
    }
    
}
