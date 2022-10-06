package com.lecuong.i18n.controller;

import com.lecuong.i18n.request.UserRequest;
import com.lecuong.i18n.response.ResponseConfig;
import com.lecuong.i18n.response.ResponseDto;
import com.lecuong.i18n.service.UserService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CuongLM18
 * @created 06/10/2022 - 8:33 AM
 * @project i18n
 */
@Data
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ResponseDto<String>> saveUser(@RequestBody UserRequest userRequest) {
        return ResponseConfig.success(userService.save(userRequest));
    }
}
