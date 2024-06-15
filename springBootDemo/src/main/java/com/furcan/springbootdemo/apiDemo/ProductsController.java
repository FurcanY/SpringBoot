package com.furcan.springbootdemo.apiDemo;
// api isimlendirmelerde cogul kullanilir
// mvc model view controller
// controller gelen istegi nasil cevaplayacagini ustlenen siniftir.
// view'a gonderir
// model = controllerdan view'a view'dan controllera data transferi yapar

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping("/")
    public String get(){
        return "Laptop";
    }

    @GetMapping("/products")
    public String get2(){
        return "Laptop Cafcafli";
    }
}
