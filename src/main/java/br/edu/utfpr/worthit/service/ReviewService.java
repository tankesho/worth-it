package br.edu.utfpr.worthit.service;

import br.edu.utfpr.worthit.model.dao.ReviewDAO;
import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.domain.Review;

import java.util.List;

public class ReviewService extends AbstractService<Long, Review>{

    public ReviewService() {
        dao = new ReviewDAO();
    }

    public Long countByTwoProperties(String firstPropertyName, Object firstPropertyValue, String secondPropertyName, Object secondPropertyValue) {
        Long entities = null;
        entities = dao.countByTwoProperties(firstPropertyName, firstPropertyValue, secondPropertyName, secondPropertyValue);
        return entities;
    }

    public List<Review> listByForeignOrObjectProperty(String propertyName, Object propertyValue) {
        List<Review> entities = null;
        entities = dao.listByForeignOrObjectProperty(propertyName, propertyValue);
        return entities;
    }
}
