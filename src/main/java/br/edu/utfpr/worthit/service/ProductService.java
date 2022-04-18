package br.edu.utfpr.worthit.service;

import br.edu.utfpr.worthit.model.dao.ProductDAO;
import br.edu.utfpr.worthit.model.domain.Product;

import java.util.List;

public class ProductService extends AbstractService<Long, Product>{

    public ProductService() {
        dao = new ProductDAO();
    }

    public List<Product> listByProperty(String propertyName, String propertyValue) {
        List<Product> entities = null;
        entities = dao.listByProperty(propertyName, propertyValue);
        return entities;
    }
}
