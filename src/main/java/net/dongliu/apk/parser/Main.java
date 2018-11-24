package net.dongliu.apk.parser;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.Locale;

/**
 * Main method for parser apk
 *
 * @author Liu Dong {@literal <dongliu@live.cn>}
 */
public class Main {
    public static void main(String[] args) throws IOException, CertificateException {
        String action = "meta";
        String apkPath = "app-debug.apk";

        try (ApkFile apkFile = new ApkFile(apkPath)) {
            apkFile.setPreferredLocale(Locale.getDefault());
            switch (action) {
                case "meta":
                    System.out.println(apkFile.getApkMeta());
                    break;
                case "manifest":
                    System.out.println(apkFile.getManifestXml());
                    break;
                case "signer":
                    System.out.println(apkFile.getApkSingers());
                    break;
                case "meta-data":
                    System.out.println(apkFile.getApkMeta().getMetaDatas());
                    break;
                case "activities":
                    System.out.println(apkFile.getApkMeta().getActivityInfos());
                    break;
                default:
            }

        }
    }
}
