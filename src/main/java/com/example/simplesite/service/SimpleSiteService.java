package com.example.simplesite.service;

import com.example.simplesite.repository.SimpleSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SimpleSiteService {

    @Autowired
    SimpleSiteRepository sr;

    public int insertMember(HashMap<String,String> params){
        return sr.insertMember(params);
    }


    public HashMap<String,String> selectMember(HashMap<String,String> params){
        return sr.selectMember(params);
    }
}
