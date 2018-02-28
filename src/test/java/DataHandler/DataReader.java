package DataHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataReader<T> {

    public T read(Class<T> theClass, String dataFile )
    {
        ObjectMapper mapper = new ObjectMapper();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(dataFile).getFile());

        try
        {
            return mapper.readValue(file, theClass);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
