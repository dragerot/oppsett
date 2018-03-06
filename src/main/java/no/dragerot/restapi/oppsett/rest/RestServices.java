package no.dragerot.restapi.oppsett.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restservices")
public class RestServices {
    @RequestMapping(
            value = "/ping",
            produces = "application/json",
            method = RequestMethod.GET)
    public String echo() {
        return "ok";
    }

    @RequestMapping(
            value = "/ping2",
            produces = "application/json",
            method = RequestMethod.GET)
    public String echo2() {
        return "ok";
    }
}
