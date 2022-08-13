package com.service;
import java.util.List;
import com.bean.Students;
import com.Dao.StudentsDao;
public class StudentsService 
{
	StudentsDao sd = new StudentsDao();
    public String storeStudents(Students students) 
    {
        if(sd.storeStudents(students)>0) 
        {
            return "Student Details stored successfully";
        }
        else 
        {
            return "Student Details didn't Store. You have given the Duplicate ID!!";
        }
        
    }
    public List<Students> findAllStudents() 
    {
        return sd.findAllStudents();
    }
    
    
    
    
}
