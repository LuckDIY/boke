package com.boke.service.impl;

import cn.hutool.core.io.IoUtil;
import com.boke.service.FileService;
import com.boke.vo.ResponseVo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public ResponseVo importMarkdown(MultipartFile file) throws IOException {

        // Read markdown content.
        String markdown = IoUtil.read(file.getInputStream(), StandardCharsets.UTF_8);

        // TODO sheet import

        //return postService.importMarkdown(markdown, file.getOriginalFilename());
        return null;
    }
}
