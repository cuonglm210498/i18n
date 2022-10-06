package com.lecuong.i18n.exception;

import lombok.Data;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:25 AM
 * @project i18n
 */
@Data
public class BusinessException extends RuntimeException {

    private String code;
    private String message;

    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
