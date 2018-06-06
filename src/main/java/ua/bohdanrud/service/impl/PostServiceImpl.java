package ua.bohdanrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.bohdanrud.entity.Post;
import ua.bohdanrud.repository.PostRepository;
import ua.bohdanrud.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public void savePost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);
	}

	@Override
	public Post findPostById(int id) {
		// TODO Auto-generated method stub
		return postRepository.getOne(id);
	}

	@Override
	public List<Post> findAllPosts() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public void deletePostById(int id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
	}

}
