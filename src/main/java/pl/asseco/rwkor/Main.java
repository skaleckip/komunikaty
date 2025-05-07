package pl.asseco.rwkor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import pl.asseco.rwkor.komunikaty.K01Typ;
import pl.asseco.rwkor.komunikaty.KomunikatTyp;
import pl.asseco.rwkor.komunikaty.ObjectFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            // Parse JSON
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JakartaXmlBindAnnotationModule());
            var url = Main.class.getResource("/K01.json");
            var komunikat = objectMapper.readValue(url, K01Typ.class);

            // Build XML
            var jaxbContext = JAXBContext.newInstance(komunikat.getClass());
            var jaxbMarshaller = jaxbContext.createMarshaller();
            JAXBElement<KomunikatTyp> jaxbElement = new ObjectFactory().createKomunikat(komunikat);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(jaxbElement, System.out);
        } catch (IOException | JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}