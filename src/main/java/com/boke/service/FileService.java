package com.boke.service;

import com.boke.vo.ResponseVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    ResponseVo importMarkdown(MultipartFile file) throws IOException;
}
