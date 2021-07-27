
package webservice;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.myWebServices.havadurumu.dto.EmployeesDTO;
import com.myWebServices.havadurumu.dto.GeneralInfo;
import com.myWebServices.havadurumu.dto.MainCategoryDTO;
import com.myWebServices.havadurumu.dto.MainDTO;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


/**
 *
 * @author kucuksille
 */
public class WebService {
    private final String APPID_HEADER = "x-api-key";

    private String baseUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private String appId = "9c49ce4bac41266145056224e0220c3e";
    private HttpClient httpClient;
    
    public WebService(){
        httpClient = HttpClientBuilder.create().build();
    }

  
    
    
    public String getMyJson(String url) throws IOException{        
        HttpGet httpGet = new HttpGet(url);
        HttpResponse httpResponse = httpClient.execute(httpGet);        
        InputStream inputStream = httpResponse.getEntity().getContent();
        StringWriter stringWriter = new StringWriter();
        IOUtils.copy(inputStream, stringWriter, "Utf-8");
        inputStream.close();        
        return  stringWriter.toString();
               
    }
    public List<MainCategoryDTO> getEmployessList(String json ){        
         Gson gson = new Gson(); 
          Type type = new TypeToken<ArrayList<MainCategoryDTO>>(){}.getType();
          List<MainCategoryDTO> founderList = gson.fromJson(json, type);  
         return founderList;
        
        
    }
    
}
