package com.codeclan.filesandfolders.filesandfolders;

import com.codeclan.filesandfolders.filesandfolders.models.File;
import com.codeclan.filesandfolders.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.filesandfolders.models.User;
import com.codeclan.filesandfolders.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}


//	@Test
//	public void canAddFilesAndFolders(){
//		Folder folder = new Folder("Big Folder");
//		File file = new File("file", ".xml", 59, folder);
//		folderRepository.save(folder);
//		fileRepository.save(file);
//	}

	@Test
	public void canAddFilesAndFoldersAndUsers(){
		User user = new User("Mr User");
		Folder folder = new Folder("Big Folder", user);
		File file = new File("file", ".xml", 59, folder);
		userRepository.save(user);
		folderRepository.save(folder);
		fileRepository.save(file);
	}



}

