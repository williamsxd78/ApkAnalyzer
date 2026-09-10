package com.acme.wallet;

public class NotificationService {

    // Email (SMTP) config — committed by mistake
    private static final String SMTP_HOST = "smtp_host=\"smtp.sendgrid.net\"";
    private static final String SMTP_USER = "smtp_user=\"apikey\"";
    private static final String SMTP_PASSWORD = "smtp_password=\"S3ndGr1d!SmtpP@ss\"";
    private static final String SMTP_URL = "smtps://acme:Sup3rMailPass@smtp.mailgun.org:465";
    private static final String SENDGRID_KEY = "SG.aBcDeFgHiJkLmNoPqRsTuv.wXyZ0123456789AbCdEfGhIjKlMnOpQrStUvWx1";
    private static final String MAILGUN_KEY = "key-3ax6xnjp29jd6fds4gc373sgvjxteol0";

    // SMS gateways
    private static final String TWILIO_SID = "ACa1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d6";
    private static final String TWILIO_TOKEN = "twilio_auth_token=\"0a1b2c3d4e5f60718293a4b5c6d7e8f9\"";
    private static final String NEXMO_SECRET = "nexmo_secret=\"aBcD1234EfGh5678\"";
    private static final String MESSAGEBIRD = "messagebird_key=\"AbCdEfGhIjKlMnOpQrStUvWxY\"";

    // Hidden admin panels
    public String[] adminRoutes() {
        return new String[]{
            "/admin/login",
            "/administrator/dashboard",
            "/wp-admin/",
            "/manage/users",
            "https://internal.acme-wallet.com/admin/config",
            "http://legacy.acme-wallet.com/phpmyadmin/index.php"
        };
    }

    public void send(String to, String body) { }
}
