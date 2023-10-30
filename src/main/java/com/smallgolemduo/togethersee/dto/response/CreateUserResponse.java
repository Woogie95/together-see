package com.smallgolemduo.togethersee.dto.response;

import com.smallgolemduo.togethersee.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {

  private String username;
  private String email;
  private String password;
  private String birth;
  private String phoneNumber;

  public static CreateUserResponse from(User user) {
    return CreateUserResponse.builder()
        .username(user.getUsername())
        .email(user.getEmail())
        .password(user.getPassword())
        .birth(user.getBirth())
        .phoneNumber(user.getPhoneNumber())
        .build();
  }

}