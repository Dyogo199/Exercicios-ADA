package com.ada.exemple01;

import com.ada.exemple01.Interface.FileDatabase;
import com.ada.exemple01.Interface.FolderManagement;
import com.ada.exemple01.Interface.ImageFileDatabase;
import com.ada.exemple01.Models.MFile;
import com.ada.exemple01.Models.MFileAnnotationTypeEnum;
import com.ada.exemple01.Orchestrators.FileOrchestrator;

import java.util.ArrayList;
import java.util.List;

public class HandlerFile extends FileOrchestrator {
    private List<MFile> mFileList = new ArrayList<>();
    ImageFileDatabase imageFileDatabase;
    FileDatabase fileDatabase;
    FolderManagement folderManagement;

    public HandlerFile(){
        imageFileDatabase = new FileOrchestrator();
        fileDatabase = (FileDatabase) new FileOrchestrator();
    }

    public HandlerFile (MFile mFile){
        if(mFile.getType().equals(MFileAnnotationTypeEnum.IMAGES)){
            mFileList.add(mFile);
            saveAllListOfImagesFiles(mFileList);
        }
    }

    private void saveAllListOfImagesFiles(List<MFile> mFileList) {
    }

    public void salvarImagemComDiretorio(MFile mFile) {
        fileDatabase.saveFile(String.valueOf((mFile.getType())), mFile.getContent(), mFile.getType(), mFile.getNameFile());
    }

    public void listarArquivos(String directory) {
    }

    public void salvarComDiretorio(MFile mFile) {
    }
}
