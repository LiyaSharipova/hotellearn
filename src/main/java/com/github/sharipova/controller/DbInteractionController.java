package com.github.sharipova.controller;

import com.github.sharipova.service.DbInteractionService;
import com.github.sharipova.service.DbInteractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liya on 01.10.17.
 */
@Controller
@RequestMapping("/db")
public class DbInteractionController {

    @Autowired
    private DbInteractionService service;

    @RequestMapping(value = "/someCell", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String getSomeCellFromDb() {

        return service.getSomeCellFromDb();
    }

    @RequestMapping(value = "/someCell1", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody

    public String getSomeCellFromDb1() {

        return "blabla";
    }
}
