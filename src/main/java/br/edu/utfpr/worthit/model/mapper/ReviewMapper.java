package br.edu.utfpr.worthit.model.mapper;

import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.domain.Review;
import br.edu.utfpr.worthit.model.dto.ProductDTO;
import br.edu.utfpr.worthit.model.dto.ReviewDTO;


public class ReviewMapper{

    public ReviewMapper getInstance(){
        return new ReviewMapper();
    }

    public Review toEntity(ReviewDTO dto){
        Product product = ProductMapper.toEntity(dto.getProduct());
        Review entity = new Review(dto.getUser(), dto.getLikes(), dto.getReview(), product);
        return entity;
    }

    public static ReviewDTO toDTO(Review entity){
        ProductDTO productDTO = ProductMapper.toDTO(entity.getProduct());
        ReviewDTO dto = new ReviewDTO(entity.getUser(), entity.getLikes(), entity.getReview(), productDTO);
        return dto;
    }
}