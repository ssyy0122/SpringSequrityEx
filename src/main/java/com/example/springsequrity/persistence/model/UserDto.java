package com.example.springsequrity.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
        private String id;

        private String password;

        private String nmae;

        public User toEntity() {
                return User.builder().id(id).password(password).name(nmae).build();
        }
}
