package com.smallgolemduo.togethersee.dto.request;

import com.smallgolemduo.togethersee.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {

    private String password;
    private String phoneNumber;

    public void modifyUserInfo(String password, String phoneNumber) {
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

}