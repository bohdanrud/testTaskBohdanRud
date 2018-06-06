package ua.bohdanrud.service;

import java.util.List;

import ua.bohdanrud.entity.Post;

public interface PostService {

	void savePost(Post post);

	Post findPostById(int id);

	List<Post> findAllPosts();

	void deletePostById(int id);

}
