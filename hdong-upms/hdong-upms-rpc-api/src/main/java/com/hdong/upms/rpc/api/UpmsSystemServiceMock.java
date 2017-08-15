package com.hdong.upms.rpc.api;

import com.hdong.common.base.BaseServiceMock;
import com.hdong.upms.dao.mapper.UpmsSystemMapper;
import com.hdong.upms.dao.model.UpmsSystem;
import com.hdong.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by hdong on 2017/3/20.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
