package com.mohit.joblisting.repository;

import com.mohit.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
