package com.boke.controller;

import com.boke.service.FileService;
import com.boke.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("markdown")
    public ResponseVo backupMarkdowns(@RequestPart("file") MultipartFile file) throws IOException {
        return fileService.importMarkdown(file);
    }
}
