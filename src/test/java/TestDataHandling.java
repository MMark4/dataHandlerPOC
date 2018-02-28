import DataHandler.DataReader;
import DataHandler.Models.MailData;
import org.junit.Test;

public class TestDataHandling {

    @Test
    public void testDataHandler()
    {
        DataReader<MailData> mailReader = new DataReader<>();
        MailData mail = mailReader.read( MailData.class,"MailData/CorrectMail.json");

        System.out.println(mail.Mailbox);
        System.out.println(mail.Password);
    }
}
