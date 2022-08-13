package com.service;
import java.util.List;
import com.bean.Trainer;
import com.Dao.TrainerDao;
public class TrainerService 
{
	TrainerDao td = new TrainerDao();
    public String storeTrainer(Trainer trainer) 
    {
        if(td.storeTrainer(trainer)>0) 
        {
            return "Trainer Details Stored Successfully";
        }
        else 
        {
            return "Trainer Details didn't Store. You have given the Duplicate ID";
        }
    }
    
    public List<Trainer> getAllTrainer() 
    {
        return td.findAllTrainer();
    }
}
