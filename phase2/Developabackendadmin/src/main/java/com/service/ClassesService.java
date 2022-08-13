package com.service;
import java.util.List;
import com.bean.Classes;
import com.Dao.ClassesDao;
public class ClassesService 
{
	ClassesDao sd = new ClassesDao();
    public String storeClasses(Classes classes) 
    {
        if(sd.storeClasses(classes)>0) 
        {
            return "Class Details stored Successfully";
        }
        else 
        {
            return "Classes Details didn't Store. You have given the Duplicate ID!!";
        }
        
    }
    public List<Classes> findAllClasses() 
    {
        return sd.findAllClasses();
    }
}
