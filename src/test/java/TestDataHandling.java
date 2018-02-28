import DataHandler.DataReader;
import DataHandler.Models.MailData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDataHandling {

    @Parameterized.Parameters
    public static Object[] data() {
        return new Object[] { "MailData/CorrectMail.json", "MailData/IncorrectMail.json" };
    }

    @Parameterized.Parameter
    public String injectedMail;

    @Test
    public void testDataHandler()
    {
        DataReader<MailData> mailReader = new DataReader<>();
        MailData mail = mailReader.read( MailData.class, injectedMail);

        System.out.println(mail.Mailbox);
        System.out.println(mail.Password);
    }
}
