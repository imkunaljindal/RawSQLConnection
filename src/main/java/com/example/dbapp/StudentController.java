package com.example.dbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController()
public class StudentController {

    @Autowired
    DbManager dbManager;

    @PostMapping("/insert_info")
    public void insertInfo(@RequestBody() Student s) throws SQLException {
        dbManager.insert_info(s);
        return;
    }

    @GetMapping("/info")
    public void getInfo() throws SQLException {
        dbManager.getAllStudents();
    }

}
