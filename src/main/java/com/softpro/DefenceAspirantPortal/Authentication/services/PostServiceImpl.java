package com.softpro.DefenceAspirantPortal.Authentication.services;


import com.softpro.DefenceAspirantPortal.Authentication.dto.PostDTO;
import com.softpro.DefenceAspirantPortal.Authentication.entities.PostEntity;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import com.softpro.DefenceAspirantPortal.Authentication.exceptions.ResourceNotFoundException;
import com.softpro.DefenceAspirantPortal.Authentication.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {
        User user =(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
        postEntity.setAuthor(user);
        postRepository.save(postEntity);
        return modelMapper.map(postEntity,PostDTO.class);
    }

    @Override
    public PostDTO getPostById(Long id) {
        PostEntity postEntity = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with id "+id));
        return modelMapper.map(postEntity,PostDTO.class);
    }
}
