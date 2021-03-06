package com.congbang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.congbang.domain.Post;
import com.congbang.repository.PostRepository;

@Service
public class PostService {

	private PostRepository postRepository;
	
	@Autowired
	public PostService(PostRepository postRepository){
		this.postRepository = postRepository;
	}
	
	public Post getLatestPost(){
		return postRepository.findFirstByOrderByPostedOnDesc();
	}

	public List<Post> list() {
		return postRepository.findAllByOrderByPostedOnDesc();
	}

	public Post getBySlug(String slug) {
		return postRepository.findBySlug(slug);
	}

	public List<Post> listByAuthor(Long id) {
		return postRepository.findAllByAuthorIdOrderByPostedOnDesc(id);
	}
	
	public Post save(Post post) {
		return postRepository.save(post);
	}
	
	public Post getById(Long id) {
		return postRepository.findOne(id);
	}
	
	public void deleteById(Long id) { postRepository.delete(id); }
}
