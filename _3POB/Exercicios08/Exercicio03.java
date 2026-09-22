package _3POB.Exercicios08;

public class Exercicio03 {
    public static void main(String[] args) {

        Notificacao email = new EmailNotificacao("joao@email.com");
        Notificacao sms = new SmsNotificacao("(11) 99999-9999");
        Notificacao push = new PushNotificacao("Dispositivo-123");

        processarEnvio(email, "Olá! Esta é uma mensagem por e-mail.");
        processarEnvio(sms, "Olá! Esta é uma mensagem por SMS.");
        processarEnvio(push, "Olá! Esta é uma mensagem por Push.");
    }

    public static void processarEnvio(
            Notificacao notificacao,
            String texto) {

        notificacao.enviar(texto);
    }
}

class Notificacao {
    protected String destinatario;

    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação: " + mensagem);
    }
}

class EmailNotificacao extends Notificacao {

    public EmailNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(
                "Enviando E-mail para "
                + destinatario
                + ": "
                + mensagem
        );
    }
}

class SmsNotificacao extends Notificacao {

    public SmsNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(
                "Enviando SMS para o número "
                + destinatario
                + ": "
                + mensagem
        );
    }
}

class PushNotificacao extends Notificacao {

    public PushNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(
                "Enviando Push Notification para o dispositivo "
                + destinatario
                + ": "
                + mensagem
        );
    }
}
