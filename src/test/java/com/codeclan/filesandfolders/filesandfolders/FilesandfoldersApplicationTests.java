package com.codeclan.filesandfolders.filesandfolders;

import com.codeclan.filesandfolders.filesandfolders.models.File;
import com.codeclan.filesandfolders.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.FolderRepository;
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

	@Test
	public void contextLoads() {
	}


	@Test
	public void canAddFilesAndFolders(){
		Folder folder = new Folder("Big Folder");
		File file = new File("file", ".xml", 59, folder);
		folderRepository.save(folder);
		fileRepository.save(file);
	}

}

