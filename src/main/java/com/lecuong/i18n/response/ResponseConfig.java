package com.lecuong.i18n.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:41 AM
 * @project i18n
 */
public class ResponseConfig {

    public static final String SUCCESS_CODE = "00";
    public static final String SUCCESS_MESSAGE = "Thành công";

    private ResponseConfig() {

    }

    public static <T> ResponseEntity<ResponseDto<T>> success(T body) {
        ResponseDto responseDto = ResponseDto.builder().code(SUCCESS_CODE).message(SUCCESS_MESSAGE).data(body).build();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    public static ResponseEntity error(HttpStatus httpStatus, String errorCode, String message) {
        ResponseDto responseData = ResponseDto.builder().code(errorCode).message(message).build();
        return new ResponseEntity<>(responseData, httpStatus);
    }
}
