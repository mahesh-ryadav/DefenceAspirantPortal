package com.softpro.DefenceAspirantPortal.Authentication.services;

import com.softpro.DefenceAspirantPortal.Authentication.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    List<PostDTO> getAllPosts();
    PostDTO createNewPost(PostDTO inputPost);
    PostDTO getPostById(Long id);


}
