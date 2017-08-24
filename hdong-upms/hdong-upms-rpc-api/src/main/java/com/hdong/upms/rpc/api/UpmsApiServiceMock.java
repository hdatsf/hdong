package com.hdong.upms.rpc.api;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hdong.upms.dao.model.UpmsPermission;
import com.hdong.upms.dao.model.UpmsRolePermission;

/**
 * 降级实现UpmsApiService接口
 * Created by hdong on 2017/2/14.
 */
public class UpmsApiServiceMock implements UpmsApiService {

    private static Logger _log = LoggerFactory.getLogger(UpmsApiServiceMock.class);
    @Override
    public List<Set<String>> selectRolesPermissionsByName(String username, String systemName){
        _log.info("UpmsApiServiceMock => selectRolesPermissionByName");
        return null;
    }
    
    @Override
    public List<Set<String>> selectRolesPermissionsByNameByCache(String username, String systemName){
        _log.info("UpmsApiServiceMock => selectRolesPermissionByNameByCache");
        return null;
    }
    
    @Override
    public List<UpmsPermission> selectMenuByUpmsUserIdAndSystemId(Integer systemId, Integer upmsUserId){
        _log.info("UpmsApiServiceMock => selectMenuByUpmsUserIdAndSystemId");
        return null;
    }

    @Override
    public List<UpmsRolePermission> selectUpmsRolePermisstionByUpmsRoleId(Integer upmsRoleId) {
        _log.info("UpmsApiServiceMock => selectUpmsRolePermisstionByUpmsRoleId");
        return null;
    }

}
