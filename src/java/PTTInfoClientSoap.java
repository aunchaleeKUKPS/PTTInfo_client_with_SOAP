
import Model.PTT_DS;
import Model.DataAccess;
import com.pttplc.ptt_webservice.PTTInfo;
import com.pttplc.ptt_webservice.PTTInfoSoap;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.WebServiceRef;

public class PTTInfoClientSoap {
 

    @WebServiceRef(wsdlLocation = "http://www.pttplc.com/webservice/pttinfo.asmx?WSDL")
    // static CurrentOilPrice service;
    static PTTInfo service;

    public void getCurrentOilPrice() {
        try {
            service = new PTTInfo();
            PTTInfoSoap port = service.getPTTInfoSoap12();
            String result = port.currentOilPrice("EN");
            //System.out.print(result);   
            JAXBContext jaxbContext = JAXBContext.newInstance(PTT_DS.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            PTT_DS out = (PTT_DS) jaxbUnmarshaller.unmarshal(new StringReader(result));
            //System.out.print(out);
            for(DataAccess dataAccess : out.getDataAccess()){
                System.out.print("DATE :"+dataAccess.getPRICE_DATE() + " " + 
                        "PRODUCT: "+dataAccess.getPRODUCT()+" "+"PRICE: ");
                if(dataAccess.getPRICE()==null){
                    System.out.println("not found price!!");
                }else{
                    System.out.println(dataAccess.getPRICE());
                }
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PTTInfoClientSoap client = new PTTInfoClientSoap();
        client.getCurrentOilPrice();
    }
}
