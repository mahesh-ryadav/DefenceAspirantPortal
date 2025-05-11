package com.softpro.DefenceAspirantPortal.Authentication.utils;

import com.softpro.DefenceAspirantPortal.Authentication.dto.PostDTO;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import com.softpro.DefenceAspirantPortal.Authentication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostSecurity {
    private final PostService postService;

    //It verifies between owner of this post by postId and user which are trying to get the post.
    public boolean isOwnerOfPost(Long postId){
        User user =(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostDTO post = postService.getPostById(postId);
//        boolean isOwner = post.getAuthor().getId().equals(user.getId());
//        System.out.println("User: " + user.getId() + ", Post Author: " + post.getAuthor().getId() + ", isOwner=" + isOwner);

        return post.getAuthor().getId().equals(user.getId());
    }
}
