package com.ada.exemple01.Interface;

import com.ada.exemple01.Models.MFileAnnotationTypeEnum;

public interface FileDatabase {

    void saveFile(String directory, String content, MFileAnnotationTypeEnum typeEnum, String nameFile);
    void recoveryFile(String directory, String nameFile);
    void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum typeEnum);
    void listAllFiles(String directory);

}
