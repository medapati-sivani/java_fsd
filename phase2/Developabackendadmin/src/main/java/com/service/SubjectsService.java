package com.service;
import java.util.List;
import com.bean.Subjects;
import com.Dao.SubjectsDao;
public class SubjectsService 
{
	SubjectsDao subd = new SubjectsDao();
    public String storeSubjects(Subjects subjects) 
    {
        if(subd.storeSubjects(subjects)>0) 
        {
            return "Subjects Details stored Successfully";
        }
        else 
        {
            return "Subject Details didn't Store. You have given the Duplicate ID!!";
        }
        
    }
    public List<Subjects> findAllSubjects() 
    {
        return subd.findAllSubjects();
    }
}
