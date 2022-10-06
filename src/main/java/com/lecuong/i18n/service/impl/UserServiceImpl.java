package com.lecuong.i18n.service.impl;

import com.lecuong.i18n.common.MessageCommon;
import com.lecuong.i18n.constant.MessageConstant;
import com.lecuong.i18n.exception.BusinessException;
import com.lecuong.i18n.request.UserRequest;
import com.lecuong.i18n.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:21 AM
 * @project i18n
 */
@Data
@Service
public class UserServiceImpl implements UserService {

    private final MessageCommon messageCommon;

    @Override
    public String save(UserRequest userRequest) {
        if (userRequest.getUserName() == null) {
            throw new BusinessException(MessageConstant.ERROR_NOT_FOUND,
                    messageCommon.getMessage(MessageConstant.ERROR_NOT_FOUND));
        }
        return "Save successfully";
    }
}
