package com.example.controller;


import com.example.bean.Account;
import com.example.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {
    public static final  Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @ResponseBody
    @GetMapping("/acct/{id}")
    public Account getById(@PathVariable("id") Long id){
        return accountService.getAcctByid(id);
    }

    @PostMapping(value = "/pages/noticeDeviceStatus.do")
    @ResponseBody
    public ResponseEntity noticeDeviceStatus(@RequestBody Account account) {
        log.info("{}",account);


        return ResponseEntity.accepted().build();
    }

}
