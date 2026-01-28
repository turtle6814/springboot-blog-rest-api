package com.springboot_blog_rest_api.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    // name should not be null or empty
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Email cannot be empty or null")
    @Email(message = "Invalid email address")
    private String email;

    // body should not be null or empty
    // body should have at least 10 characters
    @NotEmpty(message = "Comment body cannot be empty")
    @Size(min = 10, message = "Comment body must have at least 10 characters")
    private String body;
}
