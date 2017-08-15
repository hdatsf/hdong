package com.hdong.upms.rpc.api;

import com.hdong.common.base.BaseServiceMock;
import com.hdong.upms.dao.mapper.UpmsLogMapper;
import com.hdong.upms.dao.model.UpmsLog;
import com.hdong.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by hdong on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
