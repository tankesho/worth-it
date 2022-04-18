package br.edu.utfpr.worthit.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ProductDTO {
    @NonNull
    private String name;

    @NonNull
    private String category;
}