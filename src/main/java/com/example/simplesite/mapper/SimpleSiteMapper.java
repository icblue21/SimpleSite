package com.example.simplesite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface SimpleSiteMapper {

    public int insertMember(HashMap<String,String> params);
    public HashMap<String,String> selectMember(HashMap<String,String> params);

}
