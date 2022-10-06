package com.lecuong.i18n.exception;

import com.lecuong.i18n.response.ResponseConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:40 AM
 * @project i18n
 */
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    protected ResponseEntity handleBusinessException(BusinessException ex) {
        return ResponseConfig.error(BAD_REQUEST, ex.getCode(), ex.getMessage());
    }
}
