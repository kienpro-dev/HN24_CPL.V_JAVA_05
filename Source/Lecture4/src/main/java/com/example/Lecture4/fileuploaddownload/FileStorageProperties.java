package com.example.Lecture4.fileuploaddownload;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
@Getter
@Setter
public class FileStorageProperties {
    // file.upload-dir=./uploads --> uploadDir = ./uploads
    private String uploadDir;
}