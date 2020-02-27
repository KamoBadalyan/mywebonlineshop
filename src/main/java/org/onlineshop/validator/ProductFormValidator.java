package org.onlineshop.validator;import org.springframework.validation.Errors;import org.springframework.validation.Validator;import org.onlineshop.model.Product;public class ProductFormValidator implements Validator {    @Override    public boolean supports(Class<?> paramClass) {        return Product.class.equals(paramClass);    }    @Override    public void validate(Object target, Errors errors) {        Product product=(Product) target;        if (product.getProductCategory().equalsIgnoreCase("NONE")) {            errors.rejectValue("productCategory", "empty", "Please select  a product category");        }    }}