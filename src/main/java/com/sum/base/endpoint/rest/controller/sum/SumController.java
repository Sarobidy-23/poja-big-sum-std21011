package com.sum.base.endpoint.rest.controller.sum;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

  @GetMapping("/big-sum")
  public BigInteger getSum(@RequestParam(required = true, name = "a")BigInteger a,
                           @RequestParam(required = true, name = "b")BigInteger b ) {
    return a.add(b);
  }
}
