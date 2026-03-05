package StriverDSA.src.Practice;

// add jar file to import these
//import net.glxn.qrgen.QRCode;
//import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QrGenerator {
        public static void main(String[] args) throws Exception {

            String s="Mahantesh";

//            ByteArrayOutputStream out= QRCode.from(s).to(ImageType.PNG).stream();

            File f=new File("E:\\Java\\QR LIB\\abcd.PNG");

            FileOutputStream fos=new FileOutputStream(f);

//            fos.write(out.toByteArray());
            fos.flush();

        }
}
