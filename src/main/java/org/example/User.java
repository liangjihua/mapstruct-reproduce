package org.example;

import java.time.LocalDateTime;

/**
 * @author liangjihua
 */
public class User {
    private String name;
    private Integer age;
    private LocalDateTime birthday;

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
