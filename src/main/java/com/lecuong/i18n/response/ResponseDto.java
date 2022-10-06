package com.lecuong.i18n.response;

import lombok.*;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:42 AM
 * @project i18n
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto<T> {

    private String code;
    private String message;
    private T data;
}
