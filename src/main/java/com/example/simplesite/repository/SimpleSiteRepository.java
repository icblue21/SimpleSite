package com.example.simplesite.repository;

import com.example.simplesite.mapper.SimpleSiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class SimpleSiteRepository {

    @Autowired
    SimpleSiteMapper sm;

    public int insertMember(HashMap<String,String> params){
        return sm.insertMember(params);
    }

    public HashMap<String,String> selectMember(HashMap<String,String> params){
        return sm.selectMember(params);
    }
}
