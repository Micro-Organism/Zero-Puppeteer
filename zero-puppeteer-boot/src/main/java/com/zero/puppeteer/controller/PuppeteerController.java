package com.zero.puppeteer.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micro-Organism
 */
@RestController
@RequestMapping("/puppeteer")
public class PuppeteerController {

    @RequestMapping(value = "/test")
    public String test(Model model) {
        model.addAttribute("msg", "use freemarker/  puppeteer to implement html generate image");
        model.addAttribute("img", "https://img1.baidu.com/it/u=3764156347,3722190225&fm=253&fmt=auto&app=138&f=JPEG?w=440&h=419");
        return "f01";
    }

}