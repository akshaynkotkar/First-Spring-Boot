package com.example.introductionto.SampleLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
//    @Autowired
    //Using Constructor we can achieve it instead of @Autowired using Constructor
   final private  DB db;
    public DBService(DB db)
    {
        this.db=db;
    }
    String getData()
    {
        return  db.getData();
    }
}
