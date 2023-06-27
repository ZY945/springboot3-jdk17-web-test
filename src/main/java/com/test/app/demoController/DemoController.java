package com.test.app.demoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 伍六七
 * @date 2023/6/27 14:10
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/1")
    public String demo(){
        return "demo"+1;
    }
}
