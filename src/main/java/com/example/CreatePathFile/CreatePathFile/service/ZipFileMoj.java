package com.example.CreatePathFile.CreatePathFile.service;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;

@Service
public class ZipFileMoj {

    public void zippingFile() {
        try {
            ZipFile zipFile = new ZipFile("zzzzip.zip");
            ArrayList filesToAdd = new ArrayList();
            filesToAdd.add(new File("test.txt"));
            filesToAdd.add(new File("testdwa.txt"));
            filesToAdd.add(new File("testtrzy.txt"));

            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            zipFile.addFiles(filesToAdd, parameters);
        } catch (ZipException e) {
            e.printStackTrace();
        }

    }

}
