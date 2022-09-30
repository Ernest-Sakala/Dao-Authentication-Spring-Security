package com.project.farmsmart.controllers;

import com.project.farmsmart.entities.Farmer;
import com.project.farmsmart.entities.Product;
import com.project.farmsmart.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private final ProductService productService;

    private ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/my_products")
    public String getMyProducts(Model model) {
        Farmer farmer = new Farmer();

        model.addAttribute("products", productService.getAllProducts());
        farmer.getProducts();

        return "my_products";
    }

    @GetMapping("/my_products/new")
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "my_products";
    }

    @PostMapping("/my_products")
    public String saveProduct(@ModelAttribute("product") Product product, RedirectAttributes redirAttrs) {
        productService.saveProduct(product);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/my_products";
    }

    @GetMapping("/my_products/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "edit_product";
    }

    @PostMapping("/my_products/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product, RedirectAttributes redirAttrs) {
        Product existingProduct = productService.getProduct(id);

        existingProduct.setName(product.getName());
        existingProduct.setProductCategory(product.getProductCategory());
        existingProduct.setProductType(product.getProductType());

        productService.updateProduct(existingProduct);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/my_products";
    }

    @GetMapping("/my_products/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
        return "redirect:/my_products";
    }
}
