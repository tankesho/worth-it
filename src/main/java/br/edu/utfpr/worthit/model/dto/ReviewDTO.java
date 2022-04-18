package br.edu.utfpr.worthit.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ReviewDTO {

    @NonNull
    private String user;

    @NonNull
    private String likes;

    @NonNull
    private String review;

    @NonNull
    private ProductDTO product;
}
