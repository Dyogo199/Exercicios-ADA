package com.ada.exemple01.Orchestrators;


import com.ada.exemple01.Interface.ImageFileDatabase;
import com.ada.exemple01.Models.MFile;
import com.ada.exemple01.Models.MFileAnnotationTypeEnum;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase {

        File file ;
    @Override
    public void saveImageFile(String directory, String content, String nameFile) {
        BufferedImage image;
        try{
            URL url = new URL(content);
            image = ImageIO.read(url);
            ImageIO.write(image, "jpeg",new File(directory + nameFile));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImageFiles(String directory) {

    }


    public void saveAllListOfImagemFiles(List<MFile> mImageFileList){
        for (MFile list:mImageFileList) {
            file = new File("C:\\workspace\\ProjetosJava");
            if (file.exists()){

                saveImageFile("C:\\workspace\\ProjetosJava"+"Aula Exercicio POOII",list.getContent(), list.getNameFile() );
            }else System.out.println("diretorio não existe");

        }

    }

    @Override
    public void createAFolder(String path, MFileAnnotationTypeEnum typeEnum) {

    }

    @Override
    public void removeAFolder(String path, MFileAnnotationTypeEnum typeEnum) {

    }

    @Override
    public void listAllFoldersCreated() {

    }
}


