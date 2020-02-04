package com.mvc.controller.async;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class SyncController {
    @GetMapping("/quotes")
    @ResponseBody
    public DeferredResult<String> quotes(){
        DeferredResult<String> result = new DeferredResult<>();
        //TODO save result
        return result;
    }
//    result.setResult(data);

}
