package com.ada.exemple01.Interface;

import com.ada.exemple01.Models.MFileAnnotationTypeEnum;

public interface FolderManagement {
    void createAFolder(String path, MFileAnnotationTypeEnum typeEnum);

   void removeAFolder(String path, MFileAnnotationTypeEnum typeEnum);
   void listAllFoldersCreated();
}
