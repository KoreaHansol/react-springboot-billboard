package com.billboard.service;

import com.billboard.VO.Community;
import com.billboard.VO.CommunityForm;
import com.billboard.mapper.CommunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public List<Map<String, Object>> getList() {
        return communityMapper.getList();
    }

    @Override
    public Community getDetail(Long id) {
        return communityMapper.getDetail(id);
    }

    @Override
    public void InsertCommunity(CommunityForm form) {
        communityMapper.InsertCommunity(form);
    }
}
