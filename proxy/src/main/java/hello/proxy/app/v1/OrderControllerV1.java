package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping  //스프링은 @Controller 또는 @RequestMapping이 있어야 스프링 컨트롤러로 인식 (스프링부트 3.0 이상에서는 @Controller 또는 @RestController이 있어야 컨트롤러로 인식. @RequestMapping은 있어도 컨트롤러로 인식되지 않음)
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String nolog();
}
