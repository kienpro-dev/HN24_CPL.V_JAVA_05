package com.example.Lecture4.fileuploaddownload.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public Response(String fileName, String fileDownloadUri,
                    String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
}
