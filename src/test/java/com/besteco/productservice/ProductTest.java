package com.besteco.productservice;

import com.besteco.productservice.entity.Product;
import com.besteco.productservice.repository.ProductRepository;
import com.besteco.productservice.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class ProductTest {

    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository mockRepository;

    @Test
    public void updateProductWithWrongId(){

        //Given
        Product product = new Product("Macbook Pro");
        given(mockRepository.findById(101L)).willReturn(Optional.empty());

        //When
        RuntimeException runtimeException =assertThrows(RuntimeException.class, () ->
                productService.updateProduct(101L,product)
        );

        //Then
        assertEquals(runtimeException.getMessage(),"Product with id 101 not found.");
    }
}
