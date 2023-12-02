package com.cm.youyube_clone.model;

import org.springframework.data.annotation.Id;

public class Comment {

    @Id
    private String id;
    private String text;
    private String autherId;
    private Integer likeCount;
    private Integer disLikeCount;
}
