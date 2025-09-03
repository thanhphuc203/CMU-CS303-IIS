
package Lec7Exam;
import java.util.Scanner;
public class Exercise5_ParseURL {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap URL: ");
        String url = sc.nextLine();

        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);

        int domainStart = protocolEnd + 3;
        int pathStart = url.indexOf("/", domainStart);

        String domain;
        String path;

        if (pathStart != -1) {
            domain = url.substring(domainStart, pathStart);
            path = url.substring(pathStart);
        } else {
            domain = url.substring(domainStart);
            path = "/";
        }

        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}


