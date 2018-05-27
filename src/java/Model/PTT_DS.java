package Model;


import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MA-Aunchalee
 */
@XmlRootElement(name="PTT_DS")
public class PTT_DS {
@XmlElement  

    private DataAccess[] DataAccess;

    public DataAccess[] getDataAccess ()
    {
        return DataAccess;
    }

    public void setDataAccess (DataAccess[] DataAccess)
    {
        this.DataAccess = DataAccess;
    }
    
    public PTT_DS(DataAccess[] dataAccess) {
        this.DataAccess = dataAccess;
    }

    public PTT_DS() {

    }

    
}
