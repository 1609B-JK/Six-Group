import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System;
import java.util.UUID;

/**
 * Created by dell on 2017/5/25.
 */
public class FtpTest {

    public static void main(String[] args) {
        testUpload();
        testDownload();
    }

    //上传
    private static void testUpload() {
        FTPClient ftpClient = new FTPClient();
        FileInputStream fis = null;
        try {
            ftpClient.connect("192.168.31.180");
            ftpClient.login("root","root");

            File srcFile = new File("D:\\topit\\ymt\\533a79d20a1424599093621dcd2329bc.jpg");
            String fname = srcFile.getName();
            String prefix = fname.substring(fname.lastIndexOf("."));

            fis = new FileInputStream(srcFile);

            //设置上传目录
            ftpClient.changeWorkingDirectory("/");
            ftpClient.makeDirectory("img/");
            ftpClient.changeWorkingDirectory("img/");

            ftpClient.setBufferSize(1024);
            ftpClient.setControlEncoding("UTF-8");

            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            UUID uuid = UUID.randomUUID();
            String name = uuid.toString() + prefix;
            ftpClient.storeFile(name,fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("FTP客户端出错。",e);
        } finally {
            IOUtils.closeQuietly(fis);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭FTP连接发生异常。",e);
            }
        }
    }

    //下载
    public static void testDownload(){
        FTPClient ftpClient = new FTPClient();
        FileOutputStream fos = null;

        try {
            ftpClient.connect("192.168.31.180");
            ftpClient.login("root", "root");

            String remoteFileName = "/img/1.jpg";
            fos = new FileOutputStream("C:/Users/dell/Desktop/1.jpg");

            ftpClient.setBufferSize(1024);
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.retrieveFile(remoteFileName, fos);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("FTP客户端出错！", e);
        } finally {
            IOUtils.closeQuietly(fos);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭FTP连接发生异常！", e);
            }
        }
    }
}
