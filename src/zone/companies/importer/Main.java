package zone.companies.importer;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/matthias/Library/Group Containers/G69SCX94XU.duck/Library/Application Support/duck/Volumes/u310458.your-storagebox.de – SFTP/readme-free.txt");
        System.out.println(new String(fileInputStream.readAllBytes()));
    }

}
