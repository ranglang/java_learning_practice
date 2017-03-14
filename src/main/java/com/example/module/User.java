package com.example.module;

import com.alibaba.fastjson.annotation.JSONField;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lichao on 16/7/20.
 */
@Data
@NoArgsConstructor
public class User {
  private Long id;
  @JSONField(name = "age")
  private int age;
  @JSONField(name = "user_name")
  private String userName;
  private String firstName;
  private String lastName;

  public User(Long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public User clone() throws CloneNotSupportedException {
    User user = new User();
    BeanUtils.copyProperties(this, user);
    return user;
  }
}
