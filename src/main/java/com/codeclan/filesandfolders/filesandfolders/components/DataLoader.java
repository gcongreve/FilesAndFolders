package com.codeclan.filesandfolders.filesandfolders.components;

import com.codeclan.filesandfolders.filesandfolders.models.File;
import com.codeclan.filesandfolders.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.filesandfolders.models.User;
import com.codeclan.filesandfolders.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args){

        User user = new User("Mr User");
        userRepository.save(user);

        Folder folder = new Folder("Big Folder", user);
        folderRepository.save(folder);
        Folder folder2 = new Folder("Small Folder", user);
        folderRepository.save(folder2);

        File file = new File("file", ".xml", 59, folder);
        fileRepository.save(file);

        File file2 = new File("file2", ".ddt", 56, folder2);
        fileRepository.save(file2);

    }






}
