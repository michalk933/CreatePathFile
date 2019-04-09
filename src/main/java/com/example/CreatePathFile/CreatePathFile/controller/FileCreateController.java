package com.example.CreatePathFile.CreatePathFile.controller;

import com.example.CreatePathFile.CreatePathFile.service.ZipFileMoj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileCreateController {

    private final ZipFileMoj zipFile;

    public FileCreateController(ZipFileMoj zipFile) {
        this.zipFile = zipFile;
    }


    @GetMapping
    public String test() {
        return "TEST";
    }


    @GetMapping("/zip")
    public void zipping() throws IOException {
        zipFile.zippingFile();
    }

}
