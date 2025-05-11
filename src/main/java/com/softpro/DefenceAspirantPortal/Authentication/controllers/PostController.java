package com.softpro.DefenceAspirantPortal.Authentication.controllers;

import com.softpro.DefenceAspirantPortal.Authentication.dto.PostDTO;
import com.softpro.DefenceAspirantPortal.Authentication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    @Secured({"ROLE_ADMIN"})
    public List<PostDTO> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping
    @Secured({"ROLE_USER"})
    public PostDTO createNewPost( @RequestBody PostDTO inputPost){
        return postService.createNewPost(inputPost);
    }

    @GetMapping("/{postId}")
//    @PreAuthorize("hasAnyRole('USER','ADMIN') OR hasAuthority('POST_VIEW')")
    @PreAuthorize("@postSecurity.isOwnerOfPost(#postId)")
    public PostDTO getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

}
