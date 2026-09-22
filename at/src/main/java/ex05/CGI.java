package ex05;

public class CGI {
    public static void main(String[] args) {
        String contentType = "text/html";

        String header = String.format("Content-Type: %s'", contentType);
        String title = "Saudação CGI";
        String body = "<h1>Olá, Terráqueos!</h1>";
        String html = String.format("""
                <html>
                <head><title>%s</title></head>
                <body>
                %s
                </body>
                </html>""", title, body);

        System.out.println(header);
        System.out.println();
        System.out.println(html);
    }
}
