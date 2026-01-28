package com.springboot_blog_rest_api.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        name = "Post", description = "PostDto Model Information"
)
public class PostDto {
    private long id;

    @Schema(description = "Blog Post Title")
    // title should not be null or empty
    // title should have at least 2 characters
    @NotEmpty(message = "Post title cannot be empty")
    @Size(min = 2, message = "Post title must have at least 2 characters")
    private String title;

    @Schema(description = "Blog Post Description")
    // description should not be null or empty
    // description should have at least 10 characters
    @NotEmpty(message = "Post description cannot be empty")
    @Size(min = 10, message = "Post description must have at least 10 characters")
    private String description;

    @Schema(description = "Blog Post Content")
    // content should not be null or empty
    @NotEmpty
    private String content;

    @Schema(description = "Comments")
    private Set<CommentDto> comments;

    @Schema(description = "Blog Post Category")
    private Long categoryId;
}
