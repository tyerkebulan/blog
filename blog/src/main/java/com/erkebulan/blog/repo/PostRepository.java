package com.erkebulan.blog.repo;

import com.erkebulan.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
