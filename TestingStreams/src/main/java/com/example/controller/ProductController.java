package com.example.controller;

import com.example.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @PostMapping("/data")
    public void test(@RequestBody ProductDetails productDetails){

        Map<Integer,String> k=new HashMap<>();
        List<String> m=new ArrayList<>();

        String version=productDetails.getHeader().getVersion();

        ProductOfferings productOfferings=productDetails.getBody().getProductOfferings();

       List<ProductOffering> productOffering= productOfferings.getProductOffering();


        for (ProductOffering  productOfferinglist: productOffering) {

             k.put(productOfferinglist.getProductId(), productOfferinglist.getProductName());

            List<PoCharecteristic> poCharecteristic=productOfferinglist.getPoCharecteristics().getPoCharecteristic();
            for (PoCharecteristic poCharecteristicList:poCharecteristic) {
                m.add(poCharecteristicList.getDescription());
            }


        }

        System.out.println(version);
        System.out.println(k);
        System.out.println(m);

    }
    @PostMapping("/data/streams")
    public void testWithStreams(@RequestBody ProductDetails productDetails){

        Map<Integer,String> k=new HashMap<>();
        List<String> m=new ArrayList<>();
        String version=productDetails.getHeader().getVersion();

        List<ProductOffering> productOffering=productDetails.getBody().getProductOfferings().getProductOffering();

        Map<Integer,String> n= productOffering.stream().collect(Collectors.toMap(ProductOffering::getProductId,ProductOffering::getProductName));

        productOffering.forEach((s)->{
          k.put(s.getProductId(),s.getProductName());
          List<PoCharecteristic> po=  s.getPoCharecteristics().getPoCharecteristic();
          po.forEach((p)->
                  m.add(p.getDescription()));
        });


        System.out.println(version);
        System.out.println(k);
        System.out.println(m);
        System.out.println(n);

    }

}
