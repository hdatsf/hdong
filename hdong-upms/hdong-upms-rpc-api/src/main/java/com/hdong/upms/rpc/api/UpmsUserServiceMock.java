package com.hdong.upms.rpc.api;

import com.hdong.common.base.BaseServiceMock;
import com.hdong.upms.dao.mapper.UpmsUserMapper;
import com.hdong.upms.dao.model.UpmsUser;
import com.hdong.upms.dao.model.UpmsUserExample;

/**
 * 降级实现UpmsUserService接口 Created by hdong on 2017/8/15.
 */
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample>
    implements UpmsUserService {
  @Override
  public UpmsUser createUser(UpmsUser upmsUser) {
    return null;
  }
}
